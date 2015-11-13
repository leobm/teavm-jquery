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
package de.iterable.teavm.utils.functor;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
*
* @author Jan-Felix Wittmann
*/
@JSFunctor
public interface JSVoidFunctor2<T1 extends JSObject, T2 extends JSObject> extends JSFunctorBase {

	public void apply(T1 a, T2 b);

}
