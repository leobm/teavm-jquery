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

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSString;

import de.iterable.teavm.jquery.ajax.handler.AjaxBeforeSendHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxCompleteHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxErrorHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxFilterHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxSuccessHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxXhrFunctionHandler;
import de.iterable.teavm.utils.functor.JSFunctor0;
import de.iterable.teavm.utils.jso.JSDictonary;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryAjaxSettingsObject implements JSObject {

    private JQueryAjaxSettingsObject() {
    }

    @JSBody(params = {}, script = "return {}")
    public static native final JQueryAjaxSettingsObject create();

    @JSProperty
    public abstract void setAccepts(JSDictonary obj);

    @JSProperty
    public abstract void setAsync(boolean isAsync);

    @JSProperty("beforeSend")
    public abstract void setBeforeSendHandler(AjaxBeforeSendHandler handler);

    @JSProperty
    public abstract void setCache(boolean isCache);

    @JSProperty("complete")
    public abstract void setCompleteHandler(AjaxCompleteHandler handler);

    @JSProperty
    public abstract void setContentType(boolean hasContentType);

    @JSProperty
    public abstract void setContentType(String contentType);

    @JSProperty
    public abstract void setContext(JSObject context);

    @JSProperty
    public final native void setContents(JSDictonary contents);

    @JSProperty
    public final native void setConverters(JSDictonary converters);

    @JSProperty
    public abstract void setCrossDomain(boolean crossDomain);

    @JSProperty
    public abstract void setData(JSDictonary data);

    @JSProperty
    public abstract void setData(JSArray<JSObject> data);

    @JSProperty
    public abstract void setData(String data);

    @JSProperty
    public abstract void setDataFilter(AjaxFilterHandler filter);

    @JSProperty
    public abstract void setDataType(String dataType);

    @JSProperty("error")
    public abstract void setErrorHandler(AjaxErrorHandler handler);

    @JSProperty
    public abstract void setGlobal(boolean isGlobal);

    @JSProperty
    public final native void setHeaders(JSDictonary headers);

    @JSProperty
    public abstract void setIfModified(boolean isIfModified);

    @JSProperty
    public abstract void setIsLocal(boolean isLocal);

    @JSProperty
    public abstract void setJsonp(String jsonp);

    @JSProperty
    public abstract void setJsonpCallback(String jsonpCallback);

    @JSProperty
    public abstract void setJsonpCallback(JSFunctor0<JSString> jsonpCallback);

    @JSProperty
    public abstract void setMethod(String method);

    @JSProperty
    public abstract void setMimeType(String mimeType);

    @JSProperty
    public abstract void setPassword(String password);

    @JSProperty
    public abstract void setProcessData(boolean processData);

    @JSProperty
    public abstract void setScriptCharset(String scriptCharset);

    @JSProperty
    public abstract void setStatusCode(JSDictonary statusCode);

    @JSProperty("success")
    public abstract <T extends JSObject> void setSuccessHandler(AjaxSuccessHandler<T> handler);

    @JSProperty
    public abstract void setTimeout(int timeout);

    @JSProperty
    public abstract void setTraditional(boolean traditional);

    @JSProperty
    public abstract void setType(String type);

    @JSProperty
    public abstract void setUrl(String url);

    @JSProperty
    public abstract void setUsername(String username);

    @JSProperty
    public abstract void setXhr(AjaxXhrFunctionHandler handler);

    @JSProperty
    public abstract void setXhrFields(JSDictonary fields);

}