package de.iterable.teavm.jquery.misc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface JSVoidFunctor2<T1 extends JSObject, T2 extends JSObject> extends JSFunctorBase {

	public void apply(T1 a, T2 b);

}
