package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface AjaxFilterHandler extends JSObject {

	public abstract JSObject apply(JSObject data, String dataType);

}
