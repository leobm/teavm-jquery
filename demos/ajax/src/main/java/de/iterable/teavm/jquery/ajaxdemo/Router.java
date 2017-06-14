package de.iterable.teavm.jquery.ajaxdemo;

import static de.iterable.teavm.jquery.ajaxdemo.Router.Mode.HASH;
import static de.iterable.teavm.jquery.ajaxdemo.Router.Mode.HISTORY;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.teavm.jso.JSBody;
import org.teavm.jso.browser.Location;
import org.teavm.jso.dom.events.EventListener;
import org.teavm.jso.dom.events.HashChangeEvent;

import de.iterable.teavm.jso.browser.History;
import de.iterable.teavm.jso.browser.Window;
import de.iterable.teavm.jso.dom.events.PopStateEvent;
import de.iterable.teavm.utils.jso.JSObjectUtils;

public class Router {

    public static enum Mode {
        HISTORY, HASH
    }

    public static class Route {
        private final Pattern pattern;
        private final Consumer<List<String>> handler;

        public Route(Pattern pattern, Consumer<List<String>> handler) {
            this.pattern = pattern;
            this.handler = handler;
        }

        public Pattern getPattern() {
            return pattern;
        }

        public Consumer<List<String>> getHandler() {
            return handler;
        }
    }

    private List<Route> routes;
    private Mode mode;
    private String contextRoot;
    private FramentChangeListener listener;

    public Router(String contextRoot) {
        this.mode = History.isSupported() ? HISTORY : HASH;
        this.routes = new ArrayList<>();
        this.contextRoot = contextRoot;
    }

    public String getFragment() {
        final Location location = Location.current();
        final String hash = location.getHash();
        final String pathName = location.getPathName();

        String fragment = "";
        if (this.mode == HISTORY) {
            fragment = pathName.substring(1);
            fragment = fragment.replaceFirst("^" + this.contextRoot + "/?", "");
        } else {
            fragment = hash.substring(1);
        }
        return postProcessFragment(fragment);
    }

    public Router add(Consumer<List<String>> handler) {
        return this.add("", handler);
    }

    public Router add(String regex, Consumer<List<String>> handler) {
        this.routes.add(new Route(Pattern.compile(regex), handler));
        return this;
    }

    public Router match() {
        return this.match(this.getFragment());
    }

    public Router match(String fragment) {
        for (Route route : routes) {
            final Matcher matcher = route.getPattern()
                                         .matcher(fragment);
            if (matcher.find()) {
                final List<String> args = new ArrayList<>();
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    args.add(matcher.group(i));
                }
                route.getHandler()
                     .accept(args);
                return this;
            }
        }
        return this;
    }

    private static class FramentChangeHandler {

        private final Router router;
        private String currentFragment;

        public FramentChangeHandler(Router router) {
            this.router = router;
            this.currentFragment = router.getFragment();
        }

        public void handle() {
            if (!this.currentFragment.equals(router.getFragment())) {
                this.currentFragment = router.getFragment();
                router.match(this.currentFragment);
            }
        }

    }

    private static abstract class FramentChangeListener {

        protected final FramentChangeHandler handler;

        public FramentChangeListener(FramentChangeHandler handler) {
            this.handler = handler;
        }

        public abstract void attach();

        public abstract void remove();
    }

    private static class HashChangeListener extends FramentChangeListener {

        private EventListener<HashChangeEvent> listener;
        private final Window window = Window.current();

        public HashChangeListener(FramentChangeHandler handler) {
            super(handler);
        }

        public void attach() {
            window.listenHashChange(this.listener = (evt) -> {
                handler.handle();
            });
        }

        @Override
        public void remove() {
            window.neglectHashChange(listener);
        }

        @JSBody(params = {}, script = "return (typeof window.onhashchange !== 'undefined') && (document.documentMode === undefined || document.documentMode > 7)")
        public static native boolean isSupported();
    }

    private static class FallbackChangeListener extends FramentChangeListener {
        private int interval;

        public FallbackChangeListener(FramentChangeHandler handler) {
            super(handler);
        }

        @Override
        public void attach() {
            Window.setInterval(() -> {
                handler.handle();
            } , 50);
        }

        @Override
        public void remove() {
            Window.clearInterval(this.interval);
        }

    }

    private static class HistoryChangeListener extends FramentChangeListener {

        private EventListener<PopStateEvent> listener;
        private final Window window = Window.current();

        public HistoryChangeListener(FramentChangeHandler handler) {
            super(handler);
        }

        @Override
        public void attach() {
            window.listenPopstate(this.listener = (evt) -> {
                handler.handle();
            });
        }

        @Override
        public void remove() {
            window.neglectPopstate(listener);
        }

    }

    public Router listen() {
        final FramentChangeHandler handler = new FramentChangeHandler(this);
        if (this.listener != null) {
            this.listener.remove();
        }
        this.listener = getListener(handler);
        this.listener.attach();
        return this;

    }

    FramentChangeListener getListener(FramentChangeHandler handler) {
        if (this.mode == Mode.HISTORY) {
            return new HistoryChangeListener(handler);
        } else {
            if (HashChangeListener.isSupported()) {
                return new HashChangeListener(handler);
            } else {
                return new FallbackChangeListener(handler);
            }
        }
    }

    public Router navigate() {
        return this.navigate("");
    }

    public Router navigate(String path) {
        if (this.mode == HISTORY) {
            final History history = History.current();
            final String url = this.contextRoot + clearSlashes(path);
            history.pushState(JSObjectUtils.create(), "", url);
            this.match();
        } else {
            final Location location = Location.current();
            final String href = location.getFullURL();
            location.setFullURL(href.replaceFirst("#(.*)$", "") + "#" + path);
        }
        return this;
    }

    private static String clearSlashes(String path) {
        return path.replaceFirst("/$", "")
                   .replaceFirst("^/", "");
    }

    private static String postProcessFragment(String fragment) {
        return clearSlashes(decodeURI(fragment));
    }

    @JSBody(params = { "encodedURI" }, script = "return decodeURI(encodedURI)")
    private static native String decodeURI(String encodedURI);

}
