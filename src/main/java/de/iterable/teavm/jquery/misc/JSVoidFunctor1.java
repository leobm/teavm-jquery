package de.iterable.teavm.jquery.misc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface JSVoidFunctor1<T1 extends JSObject> extends JSFunctorBase {

	public void apply(T1 a);

}
