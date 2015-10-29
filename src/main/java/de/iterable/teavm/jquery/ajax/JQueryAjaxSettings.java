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

import de.iterable.teavm.jquery.ajax.handler.AjaxBeforeSendHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxCompleteHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxConverterHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxErrorHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxFilterHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxStatusCodeHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxSuccessHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxXhrFunctionHandler;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryAjaxSettings implements JSObject {

    @JSBody(params = {}, script = "return {}")
    public static native final JQueryAjaxSettings create();

    @JSProperty
    public abstract void setAccepts(JSObject obj);

    @JSProperty
    public abstract void setAsync(boolean isAsync);

    public abstract void setBeforSend(AjaxBeforeSendHandler handler);

    @JSProperty
    public abstract void setCache(boolean isCache);

    @JSProperty("complete")
    public abstract void setCompleteHandler(AjaxCompleteHandler handler);

    @JSProperty
    public abstract void setContents(JSObject contents);

    @JSProperty
    public abstract void setContentType(boolean hasContentType);

    @JSProperty
    public abstract void setContentType(String contentType);

    @JSProperty
    public abstract void setContext(JSObject context);

    @JSBody(params = {
            "dataTypeKey" }, script = "this['contents']=(this['contents']||{});this['contents']['csv']=/csv/;")
    public final native void addContent(String dataTypeKey);

    @JSBody(params = { "dataTypeKey",
            "converter" }, script = "this['converters']=(this['converters']||{});this['converters'][dataTypeKey]=converter;")
    public final native void addCoverter(String dataTypeKey, AjaxConverterHandler converter);

    @JSProperty
    public abstract void setCrossDomain(boolean crossDomain);

    @JSProperty
    public abstract void setData(JSObject data);

    @JSProperty
    public abstract void setData(String data);

    @JSProperty
    public abstract void setDataFilter(AjaxFilterHandler filter);

    @JSProperty
    protected abstract void setDataType(String dataType);

    public void setDataType(JQueryAjaxDataType dataType) {
        setDataType(dataType.getValue());
    }

    @JSProperty("error")
    public abstract void setErrorHandler(AjaxErrorHandler handler);

    @JSProperty
    public abstract void setGlobal(boolean isGlobal);

    @JSBody(params = { "headerKey",
            "headerValue" }, script = "this['headers']=(this['headers']||{});this['headers'][headerKey]=headerValue;")
    public final native void addHeader(String headerKey, String headerValue);

    @JSProperty
    public abstract void setIfModified(boolean isIfModified);

    @JSProperty
    public abstract void setIsLocal(boolean isLocal);

    @JSProperty
    public abstract void setJsonp(String jsonp);

    @JSProperty
    public abstract void setJsonpCallback(String jsonpCallback);

    // @JSProperty
    // public abstract void setJsonpCallback(Function0 jsonpCallback);

    @JSProperty
    public abstract void setMimeType(String mimeType);

    @JSProperty
    public abstract void setPassword(String password);

    @JSProperty
    public abstract void setProcessData(boolean processData);

    @JSProperty
    public abstract void setScriptCharset(String scriptCharset);

    @JSProperty
    public abstract void setStatusCode(int statusCode, AjaxStatusCodeHandler handler);

    @JSProperty("success")
    public abstract void setSuccessHandler(AjaxSuccessHandler<?> handler);

    @JSProperty
    public abstract void setTimeout(long timeout);

    @JSProperty
    public abstract void setTraditional(boolean traditional);

    @JSProperty
    public abstract void setType(String type);

    @JSProperty
    public abstract void setUrl(String url);

    @JSProperty
    public abstract void setXhr(AjaxXhrFunctionHandler handler);

    // @JSProperty
    // public abstract void setXhrFields();

}