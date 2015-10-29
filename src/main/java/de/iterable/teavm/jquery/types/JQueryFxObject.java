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

import de.iterable.teavm.jquery.misc.JSVoidFunctor0;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryFxObject implements JSObject {

    @JSBody(params = {}, script = "return {}")
    public static native final JQueryFxObject create();

    @JSProperty
    public abstract JSVoidFunctor0 getTick();

    @JSProperty
    public abstract void setTick(JSVoidFunctor0 tick);

    @JSProperty
    public abstract int getInterval();

    @JSProperty
    public abstract void setInterval(int interval);

    @JSProperty
    public abstract JSVoidFunctor0 getStop();

    @JSProperty
    public abstract void setStop(JSVoidFunctor0 tick);

    @JSProperty
    public abstract JQueryFxSpeeds getSpeeds();

    @JSProperty
    public abstract void setSpeeds(JQueryFxSpeeds speeds);

    @JSProperty
    public abstract boolean isOff();

    @JSProperty
    public abstract void setOff(boolean isOff);

    @JSProperty
    public abstract JSObject getStep(); // ????

    @JSProperty
    public abstract void setStep(JSObject step); /// ???

}
