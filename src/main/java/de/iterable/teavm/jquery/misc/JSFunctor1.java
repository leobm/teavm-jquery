package de.iterable.teavm.jquery.misc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface JSFunctor1<T1 extends JSObject, R extends JSObject> extends JSFunctorBase {

	public R apply(T1 a);

}
