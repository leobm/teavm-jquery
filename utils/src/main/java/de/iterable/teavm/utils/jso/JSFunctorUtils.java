package de.iterable.teavm.utils.jso;

import org.teavm.jso.JSBody;
import org.teavm.jso.core.JSFunction;

import de.iterable.teavm.utils.functor.JSFunctor0;
import de.iterable.teavm.utils.functor.JSFunctor1;
import de.iterable.teavm.utils.functor.JSFunctor2;
import de.iterable.teavm.utils.functor.JSFunctor3;
import de.iterable.teavm.utils.functor.JSVoidFunctor0;
import de.iterable.teavm.utils.functor.JSVoidFunctor1;
import de.iterable.teavm.utils.functor.JSVoidFunctor2;
import de.iterable.teavm.utils.functor.JSVoidFunctor3;

public final class JSFunctorUtils {

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSVoidFunctor0 functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSVoidFunctor1<?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSVoidFunctor2<?, ?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSVoidFunctor3<?, ?, ?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSFunctor0<?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSFunctor1<?, ?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSFunctor2<?, ?, ?> functor);

    @JSBody(params = "functor", script = "return functor;")
    public static native JSFunction of(JSFunctor3<?, ?, ?, ?> functor);

}
