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
* @author Jan-Felix Wittmann
*/
public interface JQuerySupport extends JSObject {
    @JSProperty
    boolean getAjax();

    @JSProperty
    boolean getBoxModel();

    @JSProperty
    boolean getChangeBubbles();

    @JSProperty
    boolean getCheckClone();

    @JSProperty
    boolean getCheckOn();

    @JSProperty
    boolean getCors();

    @JSProperty
    boolean getCssFloat();

    @JSProperty
    boolean getHrefNormalized();

    @JSProperty
    boolean getHtmlSerialize();

    @JSProperty
    boolean getLeadingWhitespace();

    @JSProperty
    boolean getNoCloneChecked();

    @JSProperty
    boolean getNoCloneEvent();

    @JSProperty
    boolean getOpacity();

    @JSProperty
    boolean getOptDisabled();

    @JSProperty
    boolean getOptSelected();

    @JSProperty
    boolean getScriptEval();

    @JSProperty
    boolean getStyle();

    @JSProperty
    boolean getSubmitBubbles();

    @JSProperty
    boolean getTbody();

}
