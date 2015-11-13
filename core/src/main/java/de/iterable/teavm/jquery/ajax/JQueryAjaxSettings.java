package de.iterable.teavm.jquery.ajax;

import java.util.function.Consumer;

import org.teavm.jso.JSObject;

import de.iterable.teavm.jquery.JQuery;
import de.iterable.teavm.jquery.ajax.handler.AjaxBeforeSendHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxCompleteHandler;
import de.iterable.teavm.utils.jso.JSDictonary;

public class JQueryAjaxSettings {

    private JQueryAjaxSettingsObject instance = JQueryAjaxSettingsObject.create();

    private JQueryAjaxSettings() {
    }

    public static JQueryAjaxSettings currentUrl() {
        return new JQueryAjaxSettings();
    }

    public static JQueryAjaxSettings url(String url) {
        final JQueryAjaxSettings settings = JQueryAjaxSettings.currentUrl();
        settings.instance.setUrl(url);
        return settings;
    }

    public JQueryAjaxSettings accepts(JSDictonary obj) {
        instance.setAccepts(obj);
        return this;
    }

    public JQueryAjaxSettings async(boolean isAsync) {
        instance.setAsync(isAsync);
        return this;

    }

    public JQueryAjaxSettings cache(boolean isCache) {
        instance.setCache(isCache);
        return this;
    }

    public JQueryAjaxSettings onBeforeSend(AjaxBeforeSendHandler handler) {
        instance.setBeforeSend(handler);
        return this;
    }

    public JQueryAjaxSettings onComplete(AjaxCompleteHandler handler) {
        instance.setCompleteHandler(handler);
        return this;
    }

    public JQueryAjaxSettings contents(JSDictonary contents) {
        instance.setContents(contents);
        return this;
    }

    public JQueryAjaxSettings contents(Consumer<JSDictonary> contentsBuilder) {
        final JSDictonary dict = JSDictonary.create();
        contentsBuilder.accept(dict);
        instance.setContents(dict);
        return this;
    }

    public JQueryAjaxSettings contentType(String contentType) {
        instance.setContentType(contentType);
        return this;
    }

    public JQueryAjaxSettings context(JSObject context) {
        instance.setContext(context);
        return this;
    }

    public JQueryAjaxSettings isCrossDomainRequest() {
        instance.setCrossDomain(true);
        return this;
    }

    public JQueryAjaxSettings data(JSDictonary data) {
        instance.setData(data);
        return this;
    }

    public JQueryAjaxSettings data(String data) {
        instance.setData(data);
        return this;
    }

    public JQueryAjaxSettingsObject build() {
        return instance;
    }

    public JQueryXHR send() {
        return JQuery.ajax(instance);
    }
}
