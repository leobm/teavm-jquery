package de.iterable.teavm.jquery.ajax;

import org.teavm.jso.core.JSString;

import de.iterable.teavm.utils.jso.JSDictonary;

public class JQueryAjaxHeadersBuilder {

    private JSDictonary dict = JSDictonary.create();

    private JQueryAjaxHeadersBuilder() {
    }

    public static JQueryAjaxHeadersBuilder create() {
        return new JQueryAjaxHeadersBuilder();
    }

    public JQueryAjaxHeadersBuilder header(String key, String value) {
        dict.put(key, JSString.valueOf(value));
        return this;
    }

    public JSDictonary build() {
        return dict;
    }
}
