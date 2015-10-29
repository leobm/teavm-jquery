package de.iterable.teavm.jquery.ajax.handler;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import de.iterable.teavm.jquery.ajax.JQueryAjaxSettings;
import de.iterable.teavm.jquery.ajax.JQueryXHR;

@JSFunctor
public interface AjaxPrefilterHandler extends JSObject {

	public void apply(JSObject options, JQueryAjaxSettings originalOptions, JQueryXHR jqXHR);

}
