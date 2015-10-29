package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSString;

import de.iterable.teavm.jquery.ajax.JQueryXHR;

@JSFunctor
public interface AjaxErrorHandler extends JSObject {

	void onError(JQueryXHR jqXHR, JSString textStatus, JSString errorThrow);

}
