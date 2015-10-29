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

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.events.Event;
import org.teavm.jso.dom.xml.Element;

/**
*
* @author Jan-Felix Wittmann
*/
public interface BaseJQueryEventObject extends Event {

	@JSProperty
	JSObject getData();

	@JSProperty
	Element getDelegateTarget();

	boolean isDefaultPrevented();

	boolean isImmediatePropagationStopped();

	boolean isPropagationStopped();

	@JSProperty
	String getNamespace();

	@JSProperty
	Event getOriginalEvent();

	void preventDefault();

	@JSProperty
	Element getRelatedTarget();

	@JSProperty
	JSObject getResult();

	void stopImmediatePropagation();

	void stopPropagation();

	@JSProperty("target")
	Element getTargetElement(); // can't name this property method to getTarget

	@JSProperty
	int getPageX();

	@JSProperty
	int getPageY();

	@JSProperty
	int getWhich();

	@JSProperty
	boolean getMetaKey();

}
