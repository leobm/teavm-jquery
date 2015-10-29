package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSFunction;

public interface AjaxXhrFunctionHandler extends JSObject {
	
	JSFunction onXhr();

}
