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
package de.iterable.teavm.jquery.ajax;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.ajax.XMLHttpRequest;

import de.iterable.teavm.jquery.ajax.handler.AjaxAlwaysHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxDoneHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxFailHandler;
import de.iterable.teavm.jquery.types.JQueryPromise;

/**
*
*  This object provides a subset of the methods of the Deferred object 
* (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred. 
* 
* @author Jan-Felix Wittmann
*/
public abstract class JQueryXHR extends XMLHttpRequest implements JQueryPromise {

    @Override
    public abstract void overrideMimeType(String mimeType);

    public abstract void abort();

    public abstract void abort(String statusText);

    public abstract JQueryXHR done(AjaxDoneHandler<?> doneCallback);

    public abstract JQueryXHR fail(AjaxFailHandler failCallback);

    public abstract JQueryXHR always(AjaxAlwaysHandler alwaysCallback);

    public abstract JQueryXHR then(AjaxDoneHandler<?> doneCallback);

    public abstract JQueryXHR then(AjaxDoneHandler<?> doneCallback, AjaxFailHandler failCallback);

    @JSProperty
    public abstract JSObject getResponseJSON();

}