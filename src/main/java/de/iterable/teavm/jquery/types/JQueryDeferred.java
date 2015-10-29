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
import org.teavm.jso.core.JSArray;

/**
*
* @author Jan-Felix Wittmann
*/
public interface JQueryDeferred extends JQueryPromise {

    String state();

    @JSBody(params = { "args" }, script = "return this.notify.apply(this, args)")
    JQueryDeferred notify(JSObject... args);

    @JSBody(params = { "args" }, script = "return this.reject.apply(this, args)")
    JQueryDeferred reject(JSObject... args);

    @JSBody(params = { "args" }, script = "return this.resolve.apply(this, args)")
    JQueryDeferred resolve(JSObject... args);

    JQueryDeferred notifyWith(JSObject context, JSArray<JSObject> args);

    JQueryDeferred rejectWith(JSObject context, JSArray<JSObject> args);

    JQueryDeferred resolveWith(JSObject context, JSArray<JSObject> args);

    JQueryPromise promise();

    JQueryPromise promise(JSObject target);

}
