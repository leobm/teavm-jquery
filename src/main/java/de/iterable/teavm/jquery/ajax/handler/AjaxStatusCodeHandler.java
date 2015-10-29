package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface AjaxStatusCodeHandler extends JSObject{

	void onStatusCode(JSObject... args);
}
