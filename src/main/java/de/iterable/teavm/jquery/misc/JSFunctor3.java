package de.iterable.teavm.jquery.misc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface JSFunctor3<T1 extends JSObject, T2 extends JSObject, T3 extends JSObject, R extends JSObject>
		extends JSFunctorBase {

	public R apply(T1 a, T2 b, T3 c);

}
