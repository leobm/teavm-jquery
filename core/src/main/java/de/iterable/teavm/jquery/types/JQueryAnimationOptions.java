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
import org.teavm.jso.core.JSBoolean;
import org.teavm.jso.core.JSNumber;

import de.iterable.teavm.utils.functor.JSVoidFunctor0;
import de.iterable.teavm.utils.functor.JSVoidFunctor1;
import de.iterable.teavm.utils.functor.JSVoidFunctor2;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryAnimationOptions implements JSObject {

	@JSBody(params = {}, script = "return {}")
	public static native final JQueryAnimationOptions create();

	@JSProperty
	public abstract void setDuration(String value);

	@JSProperty
	public abstract void setDuration(int value);

	@JSProperty
	public abstract void setEasing(String value);

	@JSProperty
	public abstract void setComplete(JSVoidFunctor0 value);

	@JSProperty
	public abstract void setStep(JSVoidFunctor2<JSNumber, JSObject> value);

	@JSProperty
	public abstract void setProgress(JQueryPromise animation, int progress, int remainingMs);

	@JSProperty
	public abstract void setStart(JSVoidFunctor1<JQueryPromise> funcWithAnimationPromise);

	@JSProperty
	public abstract void setDone(
			JSVoidFunctor2<JQueryPromise, JSBoolean> funcWithAnimationPromiseAndJumpedToEndBoolean);

	@JSProperty
	public abstract void setFail(
			JSVoidFunctor2<JQueryPromise, JSBoolean> funcWithAnimationPromiseAndJumpedToEndBoolean);

	@JSProperty
	public abstract void setAlways(
			JSVoidFunctor2<JQueryPromise, JSBoolean> funcWithAnimationPromiseAndJumpedToEndBoolean);

	@JSProperty
	public abstract void setQueue(boolean value);

	@JSProperty
	public abstract void setQueue(String value);

	@JSProperty
	public abstract void setSpecialEasing(JSObject value);
}
