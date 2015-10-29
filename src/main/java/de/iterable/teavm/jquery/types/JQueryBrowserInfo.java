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

/**
*
* This property was removed in jQuery 1.9 deprecated: 1.3, removed: 1.9
* 
* @author Jan-Felix Wittmann
* 
*/
public interface JQueryBrowserInfo extends JSObject {

    @JSProperty
    boolean getSafari();

    @JSProperty
    boolean geOpera();

    @JSProperty
    boolean geMsie();

    @JSProperty
    boolean geMozilla();

    @JSProperty
    String geVersion();

}
