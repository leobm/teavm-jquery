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
package de.iterable.teavm.jquery;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSBoolean;
import org.teavm.jso.core.JSFunction;
import org.teavm.jso.core.JSNumber;
import org.teavm.jso.core.JSString;
import org.teavm.jso.core.utils.JSArrayUtils;
import org.teavm.jso.dom.xml.Element;
import org.teavm.jso.dom.xml.Node;

import de.iterable.teavm.jquery.ajax.JQueryAjaxSettings;
import de.iterable.teavm.jquery.ajax.JQueryXHR;
import de.iterable.teavm.jquery.ajax.handler.AjaxPrefilterHandler;
import de.iterable.teavm.jquery.ajax.handler.AjaxSuccessHandler;
import de.iterable.teavm.jquery.misc.JSFunctor2;
import de.iterable.teavm.jquery.misc.JSVoidFunctor0;
import de.iterable.teavm.jquery.types.JQueryAjaxTransportHandler;
import de.iterable.teavm.jquery.types.JQueryBrowserInfo;
import de.iterable.teavm.jquery.types.JQueryCallbacks;
import de.iterable.teavm.jquery.types.JQueryCallbacksFlag;
import de.iterable.teavm.jquery.types.JQueryDeferred;
import de.iterable.teavm.jquery.types.JQueryFxObject;
import de.iterable.teavm.jquery.types.JQueryGrepFunction;
import de.iterable.teavm.jquery.types.JQueryMapFunction;
import de.iterable.teavm.jquery.types.JQueryPromise;
import de.iterable.teavm.jquery.types.JQuerySupport;

/**
*
* @author Jan-Felix Wittmann
*/
public final class JQuery {

    private JQuery() {
    }
    
    @JSBody(params = { "selector" }, script = "return jQuery(selector)")
    public static native JQueryObject create(String selector);

    @JSBody(params = { "element" }, script = "return jQuery(element)")
    public static native JQueryObject create(Node element);

    @JSBody(params = { "url" }, script = "return jQuery.getJSON(url)")
    public static native JQueryXHR getJSON(String url);

    @JSBody(params = { "url", "data" }, script = "return jQuery.getJSON(url, data)")
    public static native JQueryXHR getJSON(String url, JSObject data);

    @JSBody(params = { "url", "handler" }, script = "return jQuery.getJSON(url, handler)")
    public static native JQueryXHR getJSON(String url, AjaxSuccessHandler<JSObject> handler);

    @JSBody(params = { "url", "data", "handler" }, script = "return jQuery.getJSON(url, data, handler)")
    public static native JQueryXHR getJSON(String url, JSObject data, AjaxSuccessHandler<JSObject> handler);

    @JSBody(params = { "url" }, script = "return jQuery.getScript(url)")
    public static native JQueryXHR getScript(String url);

    @JSBody(params = { "url", "handler" }, script = "return jQuery.getScript(url, handler)")
    public static native JQueryXHR getScript(String url, AjaxSuccessHandler<JSString> handler);

    @JSBody(params = { "settings" }, script = "return jQuery.ajax(settings)")
    public static native JQueryXHR ajax(JQueryAjaxSettings settings);

    @JSBody(params = {}, script = "return jQuery.Deferred()")
    public static native JQueryDeferred Deferred();

    @JSBody(params = { "url", "settings" }, script = "return jQuery.ajax(url, settings)")
    public static native JQueryXHR ajax(String url, JQueryAjaxSettings settings);

    @JSBody(params = { "dataTypes", "handler" }, script = "return jQuery.ajaxPrefilter(dataTypes, handler)")
    public static native void ajaxPrefilter(String dataTypes, AjaxPrefilterHandler handler);

    @JSBody(params = { "handler" }, script = "return jQuery.ajaxPrefilter(handler)")
    public static native void ajaxPrefilter(AjaxPrefilterHandler handler);

    @JSBody(params = { "dataType", "handler" }, script = "return jQuery.ajaxTransport(dataType, handler)")
    public static native void ajaxTransport(String dataType, JQueryAjaxTransportHandler handler);

    @JSBody(params = { "url", "data", "success",
            "dataType" }, script = "return jQuery.get(url, data, success, dataType )")
    public static native JQueryXHR get(String url, JSObject data, AjaxSuccessHandler<? extends JSObject> success,
            String dataType);

    @JSBody(params = { "url", "data", "success" }, script = "return jQuery.get(url, data, success )")
    public static native JQueryXHR get(String url, JSObject data, AjaxSuccessHandler<? extends JSObject> success);

    @JSBody(params = { "url", "data" }, script = "return jQuery.get(url, data)")
    public static native JQueryXHR get(String url, JSObject data);

    @JSBody(params = { "url", "success" }, script = "return jQuery.get(url, success)")
    public static native JQueryXHR get(String url, AjaxSuccessHandler<? extends JSObject> success);

    @JSBody(params = { "url" }, script = "return jQuery.get(url)")
    public static native JQueryXHR get(String url);

    @JSBody(params = { "url", "data", "success",
            "dataType" }, script = "return jQuery.post(url, data, success, dataType )")
    public static native JQueryXHR post(String url, JSObject data, AjaxSuccessHandler<? extends JSObject> success,
            String dataType);

    @JSBody(params = { "url", "data", "success" }, script = "return jQuery.post(url, data, success )")
    public static native JQueryXHR post(String url, JSObject data, AjaxSuccessHandler<? extends JSObject> success);

    @JSBody(params = { "url", "data" }, script = "return jQuery.post(url, data)")
    public static native JQueryXHR post(String url, JSObject data);

    @JSBody(params = { "url", "success" }, script = "return jQuery.post(url, success)")
    public static native JQueryXHR post(String url, AjaxSuccessHandler<? extends JSObject> success);

    @JSBody(params = { "url" }, script = "return jQuery.post(url)")
    public static native JQueryXHR post(String url);

    @JSBody(params = { "settings" }, script = "return jQuery.post(settings)")
    public static native JQueryXHR post(JQueryAjaxSettings settings);

    @JSBody(params = { "obj" }, script = "return jQuery.param(obj)")
    public static native String param(JSObject obj);

    @JSBody(params = { "obj", "traditional" }, script = "return jQuery.param(obj, traditional)")
    public static native String param(JSObject obj, boolean traditional);

    @JSBody(params = {}, script = "return jQuery.browser")
    public static native JQueryBrowserInfo browser();

    @JSBody(params = {}, script = "return jQuery.support")
    public static native JQuerySupport support();

    @JSBody(params = { "container", "contained" }, script = "return jQuery.contains(container, contained)")
    public static native boolean contains(Element container, Element contained);

    @JSBody(params = { "array", "callback" }, script = "return jQuery.each(array, callback)")
    public static native JSObject each(JSArray<JSObject> array, JSFunctor2<JSNumber, JSObject, JSBoolean> callback);

    @JSBody(params = { "target", "source",
            "sourceN" }, script = "var args=[target, source]; args.push.apply(args, sourceN); return jQuery.extend.apply(null, args)")
    public static native JSObject extend(JSObject target, JSObject source, JSObject... sourceN);

    @JSBody(params = { "deep", "target", "source",
            "sourceN" }, script = "var args=[deep, target, source]; args.push.apply(args, sourceN); return jQuery.extend.apply(null, args)")
    public static native JSObject extend(boolean deep, JSObject target, JSObject source, JSObject... sourceN);

    @JSBody(params = { "code" }, script = "return jQuery.globalEval(code)")
    public static native JSObject globalEval(String code);

    @JSBody(params = { "array", "funct" }, script = "return jQuery.grep(array, funct)")
    public static native void grep(JSArray<JSObject> array, JQueryGrepFunction funct);

    @JSBody(params = { "array", "funct", "invert" }, script = "return jQuery.grep(array, funct, invert)")
    public static native void grep(JSArray<JSObject> array, JQueryGrepFunction funct, boolean invert);

    @JSBody(params = { "value", "array" }, script = "return jQuery.inArray(value, array)")
    public static native <T extends JSObject> int inArray(T value, JSArray<T> array);

    @JSBody(params = { "value", "array", "fromIndex" }, script = "return jQuery.inArray(value, array, fromIndex)")
    public static native <T extends JSObject> int inArray(JSObject value, JSArray<JSObject> array, int fromIndex);

    @JSBody(params = { "obj" }, script = "return jQuery.isArray(obj)")
    public static native boolean isArray(JSObject obj);

    @JSBody(params = { "obj" }, script = "return jQuery.isEmptyObject(obj)")
    public static native boolean isEmptyObject(JSObject obj);

    @JSBody(params = { "obj" }, script = "return jQuery.isFunction(obj)")
    public static native boolean isFunction(JSObject obj);

    @JSBody(params = { "obj" }, script = "return jQuery.isNumeric(obj)")
    public static native boolean isNumeric(JSObject obj);

    @JSBody(params = { "obj" }, script = "return jQuery.isPlainObject(obj)")
    public static native boolean isPlainObject(JSObject obj);

    @JSBody(params = { "obj" }, script = "return jQuery.isWindow(obj)")
    public static native boolean isWindow(JSObject obj);

    @JSBody(params = { "node" }, script = "return jQuery.isXMLDoc(node)")
    public static native boolean isXMLDoc(Node node);

    @JSBody(params = { "obj" }, script = "return jQuery.makeArray(obj)")
    public static native JSArray<JSObject> makeArray(JSObject obj);

    @JSBody(params = { "array", "callback" }, script = "return jQuery.map(obj)")
    public static native JSArray<JSObject> map(JSArray<JSObject> array, JQueryMapFunction callback);

    @JSBody(params = { "first", "second" }, script = "return jQuery.merge(first, second)")
    public static native JSArray<JSObject> merge(JSArray<JSObject> first, JSArray<JSObject> second);

    @JSBody(params = {}, script = "return jQuery.noop()")
    public static native JSObject noop();

    @JSBody(params = {}, script = "return jQuery.now()")
    public static native double now();

    @JSBody(params = { "data" }, script = "return jQuery.parseHTML(data)")
    public static native JSArray<Node> parseHTML(String data);

    @JSBody(params = { "data", "context" }, script = "return jQuery.parseHTML(data, context)")
    public static native JSArray<Node> parseHTML(String data, Element context);

    @JSBody(params = { "data", "context",
            "keepScripts" }, script = "return jQuery.parseHTML(data, context, keepScripts)")
    public static native JSArray<Node> parseHTML(String data, Element context, boolean keepScripts);

    @JSBody(params = { "json" }, script = "return jQuery.parseJSON(json)")
    public static native JSObject parseJSON(String json);

    @JSBody(params = { "data" }, script = "return jQuery.parseXML(data)")
    public static native Node parseXML(String data);

    @JSBody(params = { "element" }, script = "return jQuery.queue(element)")
    public static native JSArray<JSObject> queue(Element element);

    @JSBody(params = { "element", "queueName" }, script = "return jQuery.queue(element, queueName)")
    public static native JSArray<JSObject> queue(Element element, String queueName);

    @JSBody(params = { "element", "queueName",
            "newQueue" }, script = "return jQuery.queue(element, queueName, newQueue)")
    public static native JQueryObject queue(Element element, String queueName, JSArray<JSVoidFunctor0> newQueue);

    @JSBody(params = { "element", "queueName",
            "callback" }, script = "return jQuery.queue(element, queueName, callback)")
    public static native JQueryObject queue(Element element, String queueName, JSVoidFunctor0 callback);

    @JSBody(params = { "str" }, script = "return jQuery.trim(str)")
    public static native String trim(String str);

    @JSBody(params = { "obj" }, script = "return jQuery.type(obj)")
    public static native String type(JSObject obj);

    @JSBody(params = { "arr" }, script = "return jQuery.unique(arr)")
    public static native JSArray<JSObject> unique(JSArray<JSObject> arr);

    @JSBody(params = { "deferreds" }, script = "return jQuery.when.apply(null, deferreds)")
    public static native JQueryPromise when(JSObject... deferreds);

    @JSBody(params = { "element" }, script = "return jQuery.removeData(element)")
    public static native JQueryObject removeData(Element element);

    @JSBody(params = { "element", "name" }, script = "return jQuery.removeData(element, name)")
    public static native JQueryObject removeData(Element element, String name);

    @JSBody(params = { "funct", "context" }, script = "return jQuery.proxy(funct, context)")
    public static native JSFunction proxy(JSFunction funct, JSObject context);

    @JSBody(params = { "context", "name" }, script = "return jQuery.proxy(context, name)")
    public static native JSFunction proxy(JSObject context, String name);

    @JSBody(params = { "funct", "context",
            "additionalArguments" }, script = "return jQuery.proxy.apply(null, [funct, context].concat(additionalArguments));")
    public static native JSFunction proxy(JSFunction funct, JSObject context, JSObject... additionalArguments);

    @JSBody(params = { "hold" }, script = "return jQuery.holdReady(hold)")
    public static native void holdReady(boolean hold);

    @JSBody(params = {}, script = "return jQuery.noConflict()")
    public static native void noConflict();

    @JSBody(params = {}, script = "return jQuery.Callbacks()")
    public static native JQueryCallbacks Callbacks();

    @JSBody(params = { "flags" }, script = "return jQuery.Callbacks(flags)")
    private static native JQueryCallbacks Callbacks(String flags);

    public static JQueryCallbacks Callbacks(JQueryCallbacksFlag... flags) {
        return JQuery.Callbacks(JSArrayUtils.of(flags, value -> JSString.valueOf(value.getValue())).join(" "));
    }

    @JSBody(params = {}, script = "return jQuery.fx")
    public static native JQueryFxObject fx();
    
}
