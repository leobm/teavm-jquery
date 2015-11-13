/*
 *  Copyright 2015 Jan-Felix Wittmann.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.iterable.teavm.jquery.types;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.iterable.teavm.utils.functor.JSVoidFunctor0;
import de.iterable.teavm.utils.functor.JSVoidFunctor2;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryTransport implements JSObject {

    @JSBody(params = {}, script = "return {}")
    public static native final JQueryTransport create();

    @JSProperty
    public abstract void setAbort(JSVoidFunctor0 abortFunct);

    @JSProperty
    public abstract void setSend(JSVoidFunctor2<JSObject, JQueryTansportSendCompleteHandler> sendFunct);

}
