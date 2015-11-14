package de.iterable.teavm.jquery.ajax;

import de.iterable.teavm.utils.functor.JSVoidFunctor0;
import de.iterable.teavm.utils.jso.JSDictonary;
import de.iterable.teavm.utils.jso.JSFunctorUtils;

public class JQueryAjaxStatusCodeBuilder {

    private JSDictonary dict = JSDictonary.create();

    private JQueryAjaxStatusCodeBuilder() {
    }

    public static JQueryAjaxStatusCodeBuilder create() {
        return new JQueryAjaxStatusCodeBuilder();
    }

    public JQueryAjaxStatusCodeBuilder handler(int code, JSVoidFunctor0 handler) {
        dict.with(String.valueOf(code), JSFunctorUtils.of(handler));
        return this;
    }

    public JSDictonary build() {
        return dict;
    }
}
