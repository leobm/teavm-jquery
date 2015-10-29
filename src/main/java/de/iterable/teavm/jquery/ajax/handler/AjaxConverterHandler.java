package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface AjaxConverterHandler extends JSObject {

	public abstract JSObject apply(JSObject value);

}
