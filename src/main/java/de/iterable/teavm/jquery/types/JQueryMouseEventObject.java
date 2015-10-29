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

import org.teavm.jso.JSProperty;

/**
*
* @author Jan-Felix Wittmann
*/
public interface JQueryMouseEventObject extends JQueryInputEventObject {

    @JSProperty
    int getButton();

    @JSProperty
    int getClientX();

    @JSProperty
    int ClientY();

    @JSProperty
    int getOffsetX();

    @JSProperty
    int getOffsetY();

    @JSProperty
    int getPageX();

    @JSProperty
    int getPageY();

    @JSProperty
    int getScreenX();

    @JSProperty
    int getScreenY();
}
