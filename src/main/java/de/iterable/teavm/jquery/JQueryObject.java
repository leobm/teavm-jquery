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
import org.teavm.jso.core.JSNumber;
import org.teavm.jso.core.JSString;
import org.teavm.jso.dom.xml.Element;

import de.iterable.teavm.jquery.ajax.handler.AjaxSuccessHandler;
import de.iterable.teavm.jquery.misc.JSFunctor0;
import de.iterable.teavm.jquery.misc.JSFunctor1;
import de.iterable.teavm.jquery.misc.JSVoidFunctor0;
import de.iterable.teavm.jquery.misc.JSVoidFunctor1;
import de.iterable.teavm.jquery.misc.JSVoidFunctor2;
import de.iterable.teavm.jquery.types.JQueryAnimationOptions;
import de.iterable.teavm.jquery.types.JQueryCoordinates;
import de.iterable.teavm.jquery.types.JQueryDomFilterFunction;
import de.iterable.teavm.jquery.types.JQueryDomMapFunction;
import de.iterable.teavm.jquery.types.JQueryDomUpdateFunction;
import de.iterable.teavm.jquery.types.JQueryDomWrapFunctionByJQuery;
import de.iterable.teavm.jquery.types.JQueryDomWrapFunctionByString;
import de.iterable.teavm.jquery.types.JQueryEventHandler;
import de.iterable.teavm.jquery.types.JQueryEventHandlerWithExtraParameters;
import de.iterable.teavm.jquery.types.JQueryEventObject;
import de.iterable.teavm.jquery.types.JQueryIndexValueFunctionReturnInt;
import de.iterable.teavm.jquery.types.JQueryIndexValueFunctionReturnJSObject;
import de.iterable.teavm.jquery.types.JQueryIndexValueFunctionReturnString;
import de.iterable.teavm.jquery.types.JQueryIndexValueStateFunctionReturnString;
import de.iterable.teavm.jquery.types.JQueryObjectAjaxErrorHandler;
import de.iterable.teavm.jquery.types.JQueryObjectAjaxHandler;
import de.iterable.teavm.jquery.types.JQueryObjectAjaxSucessHandler;
import de.iterable.teavm.jquery.types.JQueryOffsetHandler;
import de.iterable.teavm.jquery.types.JQueryPromise;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryObject implements JSObject {

    public abstract JQueryObject load(String url);

    public abstract JQueryObject load(String url, JSObject data);

    public abstract JQueryObject load(String url, String data);

    public abstract JQueryObject load(String url, AjaxSuccessHandler<JSString> handler);

    public abstract JQueryObject load(String url, JSObject data, AjaxSuccessHandler<JSString> handler);

    public abstract JQueryObject load(String url, String data, AjaxSuccessHandler<JSString> handler);

    public abstract JQueryObject ajaxComplete(JQueryObjectAjaxHandler handler);

    public abstract JQueryObject ajaxError(JQueryObjectAjaxErrorHandler handler);

    public abstract JQueryObject ajaxSend(JQueryObjectAjaxHandler handler);

    public abstract JQueryObject ajaxStart(JSVoidFunctor0 handler);

    public abstract JQueryObject ajaxStop(JSVoidFunctor0 handler);

    public abstract JQueryObject ajaxSuccess(JQueryObjectAjaxSucessHandler handler);

    public abstract String serialize();

    public abstract JSArray<JSObject> serializeArray();

    public abstract JQueryObject addClass(String className);

    public abstract JQueryObject addClass(JQueryIndexValueFunctionReturnString funct);

    public abstract String attr(String attributeName);

    public abstract JQueryObject attr(String attributeName, String value);

    public abstract JQueryObject attr(String attributeName, int value);

    public abstract JQueryObject attr(JSObject values);

    public abstract JQueryObject attr(JQueryIndexValueFunctionReturnString funct);

    public abstract boolean hasClass(String className);

    public abstract String html();

    public abstract JQueryObject html(String text);

    public abstract JSObject prop(String propertyName);

    public abstract JQueryObject prop(String propertyName, JSObject value);

    public abstract JQueryObject prop(JSObject properties);

    public abstract JQueryObject prop(JQueryIndexValueFunctionReturnJSObject funct);

    public abstract JQueryObject removeAttr(String attributeName);

    public abstract JQueryObject removeClass();

    public abstract JQueryObject removeClass(String className);

    public abstract JQueryObject removeClass(JQueryIndexValueFunctionReturnString funct);

    public abstract JQueryObject removeProp(String propertyName);

    public abstract JQueryObject toggleClass(String className);

    public abstract JQueryObject toggleClass(String className, boolean state);

    public abstract JQueryObject toggleClass(boolean state);

    public abstract JQueryObject toggleClass();

    public abstract JQueryObject toggleClass(JQueryIndexValueStateFunctionReturnString func);

    public abstract JSObject val();

    public abstract JQueryObject val(String value);

    public abstract JQueryObject val(int value);

    public abstract JQueryObject val(String[] value);

    public abstract JQueryObject val(JQueryIndexValueFunctionReturnString funct);

    public abstract String css(String propertyName);

    public abstract String css(String[] propertyNames);

    public abstract JQueryObject css(String propertyName, String value);

    public abstract JQueryObject css(String propertyName, Number propertyValue);

    public abstract JQueryObject css(JSObject properties);

    public abstract JQueryObject css(String propertyName, JQueryIndexValueFunctionReturnInt func);

    public abstract JQueryObject css(String propertyName, JQueryIndexValueFunctionReturnString func);

    public abstract int height();

    public abstract JQueryObject height(int value);

    public abstract JQueryObject height(String value);

    public abstract JQueryObject height(JQueryIndexValueFunctionReturnString funct);

    public abstract JQueryObject height(JQueryIndexValueFunctionReturnInt funct);

    public abstract int innerHeight();

    public abstract JQueryObject innerHeight(int value);

    public abstract JQueryObject innerHeight(String value);

    public abstract JQueryObject innerHeight(JQueryIndexValueFunctionReturnString funct);

    public abstract JQueryObject innerHeight(JQueryIndexValueFunctionReturnInt funct);

    public abstract int innerWidth();

    public abstract JQueryCoordinates offset();

    public abstract JQueryObject offset(JQueryCoordinates coordinates);

    public abstract JQueryObject offset(JQueryOffsetHandler funct);

    public abstract int outerHeight();

    public abstract int outerHeight(boolean includeMargin);

    public abstract int outerWidth();

    public abstract int outerWidth(boolean includeMargin);

    public abstract JQueryCoordinates position();

    public abstract int scrollLeft();

    public abstract JQueryObject scrollLeft(int value);

    public abstract int scrollTop();

    public abstract JQueryObject scrollTop(int value);

    public abstract int width();

    public abstract JQueryObject width(int value);

    public abstract JQueryObject width(String value);

    public abstract JQueryObject width(JQueryIndexValueFunctionReturnString funct);

    public abstract JQueryObject width(JQueryIndexValueFunctionReturnInt funct);

    public abstract JQueryObject clearQueue(String queueName);

    public abstract JQueryObject clearQueue();

    public abstract JQueryObject data(String key, JSObject value);

    public abstract JQueryObject data(JSObject obj);

    public abstract JSObject data(String key);

    public abstract JSObject data();

    public abstract JQueryObject dequeue(String queueName);

    public abstract JQueryObject dequeue();

    public abstract JSArray<JSObject> queue(String queueName);

    public abstract JSArray<JSObject> queue();

    public abstract JQueryObject queue(String queueName, JSFunctor1<JSFunctor0<?>, JSFunctor0<?>> callback);

    public abstract JQueryObject removeData();

    public abstract JQueryObject removeData(String name);

    public abstract JQueryObject removeData(JSArray<JSString> list);

    public abstract JQueryPromise promise();

    public abstract JQueryPromise promise(String type);

    public abstract JQueryPromise promise(String type, JSObject target);

    public abstract JQueryObject animate(JSObject properties);

    public abstract JQueryObject animate(JSObject properties, int duration, String easing, JSVoidFunctor0 callback);

    public abstract JQueryObject animate(JSObject properties, String duration, String easing, JSVoidFunctor0 callback);

    public abstract JQueryObject animate(JSObject properties, JSVoidFunctor0 callback);

    public abstract JQueryObject animate(JSObject propertiesJ, JQueryAnimationOptions options);

    public abstract JQueryObject delay(int duration, String queueName);

    public abstract JQueryObject fadeIn(String duration);

    public abstract JQueryObject fadeIn(String duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeIn(int duration);

    public abstract JQueryObject fadeIn(int duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeIn(JQueryAnimationOptions options);

    public abstract JQueryObject fadeIn(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeIn(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeOut(int duration);

    public abstract JQueryObject fadeOut(int duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeOut(String duration);

    public abstract JQueryObject fadeOut(String duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeOut(JQueryAnimationOptions options);

    public abstract JQueryObject fadeOut(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeOut(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeTo(String duration, int opacity);

    public abstract JQueryObject fadeTo(int duration, int opacity);

    public abstract JQueryObject fadeTo(String duration, int opacity, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeTo(int duration, int opacity, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeTo(String duration, int opacity, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeTo(int duration, int opacity, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeToggle(String duration);

    public abstract JQueryObject fadeToggle(String duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeToggle(int duration);

    public abstract JQueryObject fadeToggle(int duration, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeToggle(JQueryAnimationOptions options);

    public abstract JQueryObject fadeToggle(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject fadeToggle(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject finish(String queue);

    public abstract JQueryObject hide();

    public abstract JQueryObject hide(String duration);

    public abstract JQueryObject hide(int duration);

    public abstract JQueryObject hide(JSVoidFunctor0 complete);

    public abstract JQueryObject hide(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject hide(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject hide(JQueryAnimationOptions options);

    public abstract JQueryObject show();

    public abstract JQueryObject show(String duration);

    public abstract JQueryObject show(int duration);

    public abstract JQueryObject show(JSVoidFunctor0 complete);

    public abstract JQueryObject show(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject show(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject show(JQueryAnimationOptions options);

    public abstract JQueryObject slideDown();

    public abstract JQueryObject slideDown(String duration);

    public abstract JQueryObject slideDown(int duration);

    public abstract JQueryObject slideDown(JSVoidFunctor0 complete);

    public abstract JQueryObject slideDown(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideDown(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideDown(JQueryAnimationOptions options);

    public abstract JQueryObject slideToggle();

    public abstract JQueryObject slideToggle(String duration);

    public abstract JQueryObject slideToggle(int duration);

    public abstract JQueryObject slideToggle(JSVoidFunctor0 complete);

    public abstract JQueryObject slideToggle(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideToggle(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideToggle(JQueryAnimationOptions options);

    public abstract JQueryObject slideUp();

    public abstract JQueryObject slideUp(String duration);

    public abstract JQueryObject slideUp(int duration);

    public abstract JQueryObject slideUp(JSVoidFunctor0 complete);

    public abstract JQueryObject slideUp(String duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideUp(int duration, String easing, JSVoidFunctor0 complete);

    public abstract JQueryObject slideUp(JQueryAnimationOptions options);

    public abstract JQueryObject stop();

    public abstract JQueryObject stop(boolean clearQueue);

    public abstract JQueryObject stop(String queue, boolean clearQueue);

    public abstract JQueryObject stop(boolean clearQueue, boolean jumpToEnd);

    public abstract JQueryObject stop(String queue, boolean clearQueue, boolean jumpToEnd);

    public abstract JQueryObject bind(String eventType);

    public abstract JQueryObject bind(String eventType, JSObject eventData);

    public abstract JQueryObject bind(String eventType, JSObject eventData, boolean preventBubble);

    public abstract JQueryObject bind(String eventType, JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject bind(String eventType, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject blur();

    public abstract JQueryObject blur(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject blur(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject change();

    public abstract JQueryObject change(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject change(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject click();

    public abstract JQueryObject click(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject click(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject dblclick();

    public abstract JQueryObject dblclick(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject dblclick(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject delegate(String selector, String eventType, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject delegate(String selector, String eventType, JSObject eventData,
            JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject focus();

    public abstract JQueryObject focus(JQueryEventHandler handler);

    public abstract JQueryObject focus(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject focusin();

    public abstract JQueryObject focusin(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject focusin(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject focusout();

    public abstract JQueryObject focusout(JQueryEventHandler handler);

    public abstract JQueryObject focusout(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject hover(JQueryEventHandler handlerIn, JQueryEventHandler handlerOut);

    public abstract JQueryObject keydown();

    public abstract JQueryObject keydown(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject keydown(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject keypress();

    public abstract JQueryObject keypress(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject keypress(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject keyup();

    public abstract JQueryObject keyup(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject keyup(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mousedown();

    public abstract JQueryObject mousedown(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mousedown(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mouseenter();

    public abstract JQueryObject mouseenter(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mouseenter(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mouseleave();

    public abstract JQueryObject mouseleave(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mouseleave(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mousemove();

    public abstract JQueryObject mousemove(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mousemove(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mouseout();

    public abstract JQueryObject mouseout(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mouseout(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mouseover();

    public abstract JQueryObject mouseover(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mouseover(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject mouseup();

    public abstract JQueryObject mouseup(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject mouseup(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject off(String events);

    public abstract JQueryObject off(String events, String selector);

    public abstract JQueryObject off(String events, String selector, JQueryEventHandler handler);

    public abstract JQueryObject off(JSObject events, String selector);

    public abstract JQueryObject off(JQueryEventObject event);

    public abstract JQueryObject off();

    public abstract JQueryObject on(String events, boolean shorthandHandler);

    public abstract JQueryObject on(String events, JQueryEventHandler handler);

    public abstract JQueryObject on(String events, JQueryEventHandlerWithExtraParameters handler);

    public abstract JQueryObject on(String events, String selector, boolean shorthandHandler);

    public abstract JQueryObject on(String events, String selector, JSObject data, boolean shorthandHandler);

    public abstract JQueryObject on(JSObject events);

    public abstract JQueryObject on(JSObject events, String selector);

    public abstract JQueryObject on(JSObject events, String selector, JSObject eventData);

    public abstract JQueryObject one(String events, boolean shorthandHandler);

    public abstract JQueryObject one(String events, JQueryEventHandler handler);

    public abstract JQueryObject one(String events, String selector, boolean shorthandHandler);

    public abstract JQueryObject one(String events, String selector, JSObject data, boolean shorthandHandler);

    public abstract JQueryObject one(JSObject events);

    public abstract JQueryObject one(JSObject events, String selector);

    public abstract JQueryObject one(JSObject events, String selector, JSObject eventData);

    public abstract JQueryObject ready(JQueryEventHandler handler);

    public abstract JQueryObject resize();

    public abstract JQueryObject resize(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject resize(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject scroll();

    public abstract JQueryObject scroll(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject scroll(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject select();

    public abstract JQueryObject select(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject select(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject submit();

    public abstract JQueryObject submit(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract JQueryObject submit(JSObject eventData, JQueryEventHandler handler);

    public abstract JQueryObject trigger(String eventType);

    public abstract JQueryObject trigger(String eventType, JSObject... extraParameters);

    public abstract JQueryObject trigger(JQueryEventObject event);

    public abstract JQueryObject trigger(JQueryEventObject event, JSObject... extraParameters);

    public abstract JQueryObject unbind(String eventType);

    public abstract JQueryObject unbind(String eventType, JQueryEventHandler handler);

    public abstract JQueryObject unbind(String eventType, boolean falseResult);

    public abstract JQueryObject unbind(JQueryEventObject event);

    public abstract JQueryObject unbind();

    public abstract JQueryObject undelegate();

    public abstract JQueryObject undelegate(String namespace);

    public abstract JQueryObject undelegate(String selector, String eventType);

    public abstract JQueryObject undelegate(String selector, String eventType, JQueryEventObject event);

    public abstract JQueryObject undelegate(String selector, JQueryEventObject event);

    public abstract JQueryObject pushStack(JSArray<Element> elements);

    public abstract JQueryObject pushStack(JSArray<Element> elements, String name, JSArray<JSObject> arguments);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject after(String... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject after(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject after(JSArray<Element>... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject after(JQueryObject... content);

    public abstract JQueryObject after(JQueryDomUpdateFunction funct);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject append(String... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject append(JSString... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject append(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject append(JSArray<Element>... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native JQueryObject append(JQueryObject... content);

    public abstract JQueryObject append(JQueryDomUpdateFunction funct);

    public abstract JQueryObject appendTo(String target);

    public abstract JQueryObject appendTo(Element target);

    public abstract JQueryObject appendTo(JSArray<Element> target);

    public abstract JQueryObject appendTo(JQueryObject target);

    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native JQueryObject before(String... content);

    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native JQueryObject before(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native JQueryObject before(JSArray<Element>... content);

    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native JQueryObject before(JQueryObject... content);

    public abstract JQueryObject before(JQueryDomUpdateFunction funct);

    public abstract JQueryObject clone();

    public abstract JQueryObject clone(boolean withDataAndEvents);

    public abstract JQueryObject clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

    public abstract JQueryObject detach();

    public abstract JQueryObject detach(String selector);

    public abstract JQueryObject empty();

    public abstract JQueryObject insertAfter(String target);

    public abstract JQueryObject insertAfter(Element target);

    public abstract JQueryObject insertAfter(JSArray<Element> target);

    public abstract JQueryObject insertAfter(JQueryObject target);

    public abstract JQueryObject insertBefore(String target);

    public abstract JQueryObject insertBefore(Element target);

    public abstract JQueryObject insertBefore(JSArray<Element> target);

    public abstract JQueryObject insertBefore(JQueryObject target);

    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native JQueryObject prepend(String... content);

    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native JQueryObject prepend(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native JQueryObject prepend(JSArray<Element>... content);

    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native JQueryObject prepend(JQueryObject... content);

    public abstract JQueryObject prepend(JQueryDomUpdateFunction funct);

    public abstract JQueryObject remove();

    public abstract JQueryObject remove(String selector);

    public abstract JQueryObject replaceAll(String target);

    public abstract JQueryObject replaceAll(Element target);

    public abstract JQueryObject replaceAll(JSArray<Element> target);

    public abstract JQueryObject replaceAll(JQueryObject target);

    public abstract String text();

    public abstract JQueryObject text(String text);

    public abstract JSArray<Element> toArray();

    public abstract JQueryObject unwrap();

    public abstract JQueryObject wrap(String target);

    public abstract JQueryObject wrap(Element target);

    public abstract JQueryObject wrap(JSArray<Element> target);

    public abstract JQueryObject wrap(JQueryObject target);

    public abstract JQueryObject wrap(JQueryDomWrapFunctionByString funct);

    public abstract JQueryObject wrap(JQueryDomWrapFunctionByJQuery funct);

    public abstract JQueryObject wrapAll(String target);

    public abstract JQueryObject wrapAll(Element target);

    public abstract JQueryObject wrapAll(JSArray<Element> target);

    public abstract JQueryObject wrapAll(JQueryObject target);

    public abstract JQueryObject wrapAll(JQueryDomWrapFunctionByJQuery funct);

    public abstract JQueryObject wrapAll(JQueryDomWrapFunctionByString funct);

    public abstract JQueryObject wrapInner(String target);

    public abstract JQueryObject wrapInner(Element target);

    public abstract JQueryObject wrapInner(JSArray<Element> target);

    public abstract JQueryObject wrapInner(JQueryObject target);

    public abstract JQueryObject wrapInner(JQueryDomWrapFunctionByJQuery funct);

    public abstract JQueryObject each(JSVoidFunctor2<JSNumber, Element> funct);

    public abstract Element get(int index);

    public abstract JSArray<Element> get();

    public abstract int index();

    public abstract int index(String selector);

    public abstract int index(Element element);

    public abstract int index(JQueryObject jquery);

    public abstract int length();

    public abstract JQueryObject add(String html);

    @JSBody(params = { "elements" }, script = "return this.add.apply(this, elements)")
    public final native JQueryObject add(Element... elements);

    public abstract JQueryObject add(JQueryObject jquery);

    public abstract JQueryObject add(String selector, Element context);

    public abstract JQueryObject addBack();

    public abstract JQueryObject addBack(String selector);

    public abstract JQueryObject children();

    public abstract JQueryObject children(String selector);

    public abstract JQueryObject closest(String selector);

    public abstract JQueryObject closest(String selector, Element context);

    public abstract JQueryObject closest(JQueryObject jquery);

    public abstract JQueryObject closest(Element element);

    public abstract JQueryObject closest(JSArray<Element> element);

    public abstract JQueryObject contents();

    public abstract JQueryObject end();

    public abstract JQueryObject eq(int index);

    public abstract JQueryObject filter(String selector);

    @JSBody(params = { "elements" }, script = "return this.filter.apply(this, elements)")
    public final native JQueryObject filter(Element... elements);

    public abstract JQueryObject filter(JQueryObject jquery);

    public abstract JQueryObject filter(JQueryDomFilterFunction funct);

    public abstract JQueryObject find(String selector);

    public abstract JQueryObject find(Element element);

    public abstract JQueryObject find(JQueryObject jquery);

    public abstract JQueryObject first();

    public abstract JQueryObject has(String selector);

    public abstract JQueryObject has(Element element);

    public abstract JQueryObject is(String selector);

    public abstract JQueryObject is(JQueryDomFilterFunction funct);

    public abstract JQueryObject is(Element element);

    public abstract JQueryObject is(JQueryObject jquery);

    public abstract JQueryObject last();

    public abstract JQueryObject map(JQueryDomMapFunction funct);

    public abstract JQueryObject next();

    public abstract JQueryObject nextAll();

    public abstract JQueryObject nextAll(String selector);

    public abstract JQueryObject nextUntil();

    public abstract JQueryObject nextUntil(String selector);

    public abstract JQueryObject nextUntil(String selector, String filterSelector);

    public abstract JQueryObject nextUntil(Element element, String filterSelector);

    public abstract JQueryObject nextUntil(JQueryObject jquery, String filterSelector);

    public abstract JQueryObject not(String selector);

    public abstract JQueryObject not(JQueryDomFilterFunction funct);

    public abstract JQueryObject not(JQueryObject jquery);

    public abstract JQueryObject offsetParent();

    public abstract JQueryObject parent();

    public abstract JQueryObject parent(String selector);

    public abstract JQueryObject parents();

    public abstract JQueryObject parents(String selector);

    public abstract JQueryObject parentsUntil();

    public abstract JQueryObject parentsUntil(String selector);

    public abstract JQueryObject parentsUntil(String selector, String filterSelector);

    public abstract JQueryObject parentsUntil(Element element, String filterSelector);

    public abstract JQueryObject parentsUntil(JQueryObject jquery, String filterSelector);

    public abstract JQueryObject prev();

    public abstract JQueryObject prev(String selector);

    public abstract JQueryObject prevAll();

    public abstract JQueryObject prevAll(String selector);

    public abstract JQueryObject prevUntil();

    public abstract JQueryObject prevUntil(String selector);

    public abstract JQueryObject prevUntil(String selector, String filterSelector);

    public abstract JQueryObject prevUntil(Element element, String filterSelector);

    public abstract JQueryObject prevUntil(JQueryObject jquery, String filterSelector);

    public abstract JQueryObject siblings();

    public abstract JQueryObject siblings(String selector);

    public abstract JQueryObject slice(int start);

    public abstract JQueryObject slice(int start, int end);

}
