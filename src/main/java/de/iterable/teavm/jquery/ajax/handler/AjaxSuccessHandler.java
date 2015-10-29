package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSString;

import de.iterable.teavm.jquery.ajax.JQueryXHR;

@JSFunctor
public interface AjaxSuccessHandler<T extends JSObject> extends JSObject {

	void onSuccess(T data, JSString textStatus, JQueryXHR jqXHR);

}
