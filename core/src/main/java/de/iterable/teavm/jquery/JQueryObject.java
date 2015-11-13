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
import org.teavm.jso.core.JSArrayReader;
import org.teavm.jso.core.JSNumber;
import org.teavm.jso.core.JSString;
import org.teavm.jso.dom.xml.Element;

import de.iterable.teavm.jquery.ajax.handler.AjaxSuccessHandler;
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
import de.iterable.teavm.utils.functor.JSFunctor0;
import de.iterable.teavm.utils.functor.JSFunctor1;
import de.iterable.teavm.utils.functor.JSVoidFunctor0;
import de.iterable.teavm.utils.functor.JSVoidFunctor1;
import de.iterable.teavm.utils.functor.JSVoidFunctor2;

/**
*
* @author Jan-Felix Wittmann
*/
public abstract class JQueryObject<J extends JQueryObject<J>> implements JSObject, JSArrayReader<Element> {

    public abstract J load(String url);

    public abstract J load(String url, JSObject data);

    public abstract J load(String url, String data);

    public abstract J load(String url, AjaxSuccessHandler<JSString> handler);

    public abstract J load(String url, JSObject data, AjaxSuccessHandler<JSString> handler);

    public abstract J load(String url, String data, AjaxSuccessHandler<JSString> handler);

    public abstract J ajaxComplete(JQueryObjectAjaxHandler handler);

    public abstract J ajaxError(JQueryObjectAjaxErrorHandler handler);

    public abstract J ajaxSend(JQueryObjectAjaxHandler handler);

    public abstract J ajaxStart(JSVoidFunctor0 handler);

    public abstract J ajaxStop(JSVoidFunctor0 handler);

    public abstract J ajaxSuccess(JQueryObjectAjaxSucessHandler handler);

    public abstract String serialize();

    public abstract JSArray<JSObject> serializeArray();

    public abstract J addClass(String className);

    public abstract J addClass(JQueryIndexValueFunctionReturnString funct);

    public abstract String attr(String attributeName);

    public abstract J attr(String attributeName, String value);

    public abstract J attr(String attributeName, int value);

    public abstract J attr(JSObject values);

    public abstract J attr(JQueryIndexValueFunctionReturnString funct);

    public abstract boolean hasClass(String className);

    public abstract String html();

    public abstract J html(String text);

    public abstract JSObject prop(String propertyName);

    public abstract J prop(String propertyName, JSObject value);

    public abstract J prop(JSObject properties);

    public abstract J prop(JQueryIndexValueFunctionReturnJSObject funct);

    public abstract J removeAttr(String attributeName);

    public abstract J removeClass();

    public abstract J removeClass(String className);

    public abstract J removeClass(JQueryIndexValueFunctionReturnString funct);

    public abstract J removeProp(String propertyName);

    public abstract J toggleClass(String className);

    public abstract J toggleClass(String className, boolean state);

    public abstract J toggleClass(boolean state);

    public abstract J toggleClass();

    public abstract J toggleClass(JQueryIndexValueStateFunctionReturnString func);

    public abstract JSObject val();

    public abstract J val(String value);

    public abstract J val(int value);

    public abstract J val(String[] value);

    public abstract J val(JQueryIndexValueFunctionReturnString funct);

    public abstract String css(String propertyName);

    public abstract String css(String[] propertyNames);

    public abstract J css(String propertyName, String value);

    public abstract J css(String propertyName, Number propertyValue);

    public abstract J css(JSObject properties);

    public abstract J css(String propertyName, JQueryIndexValueFunctionReturnInt func);

    public abstract J css(String propertyName, JQueryIndexValueFunctionReturnString func);

    public abstract int height();

    public abstract J height(int value);

    public abstract J height(String value);

    public abstract J height(JQueryIndexValueFunctionReturnString funct);

    public abstract J height(JQueryIndexValueFunctionReturnInt funct);

    public abstract int innerHeight();

    public abstract J innerHeight(int value);

    public abstract J innerHeight(String value);

    public abstract J innerHeight(JQueryIndexValueFunctionReturnString funct);

    public abstract J innerHeight(JQueryIndexValueFunctionReturnInt funct);

    public abstract int innerWidth();

    public abstract JQueryCoordinates offset();

    public abstract J offset(JQueryCoordinates coordinates);

    public abstract J offset(JQueryOffsetHandler funct);

    public abstract int outerHeight();

    public abstract int outerHeight(boolean includeMargin);

    public abstract int outerWidth();

    public abstract int outerWidth(boolean includeMargin);

    public abstract JQueryCoordinates position();

    public abstract int scrollLeft();

    public abstract J scrollLeft(int value);

    public abstract int scrollTop();

    public abstract J scrollTop(int value);

    public abstract int width();

    public abstract J width(int value);

    public abstract J width(String value);

    public abstract J width(JQueryIndexValueFunctionReturnString funct);

    public abstract J width(JQueryIndexValueFunctionReturnInt funct);

    public abstract J clearQueue(String queueName);

    public abstract J clearQueue();

    public abstract J data(String key, JSObject value);

    public abstract J data(JSObject obj);

    public abstract JSObject data(String key);

    public abstract JSObject data();

    public abstract J dequeue(String queueName);

    public abstract J dequeue();

    public abstract JSArray<JSObject> queue(String queueName);

    public abstract JSArray<JSObject> queue();

    public abstract J queue(String queueName, JSFunctor1<JSFunctor0<?>, JSFunctor0<?>> callback);

    public abstract J removeData();

    public abstract J removeData(String name);

    public abstract J removeData(JSArray<JSString> list);

    public abstract JQueryPromise promise();

    public abstract JQueryPromise promise(String type);

    public abstract JQueryPromise promise(String type, JSObject target);

    public abstract J animate(JSObject properties);

    public abstract J animate(JSObject properties, int duration, String easing, JSVoidFunctor0 callback);

    public abstract J animate(JSObject properties, String duration, String easing, JSVoidFunctor0 callback);

    public abstract J animate(JSObject properties, JSVoidFunctor0 callback);

    public abstract J animate(JSObject propertiesJ, JQueryAnimationOptions options);

    public abstract J delay(int duration, String queueName);

    public abstract J fadeIn(String duration);

    public abstract J fadeIn(String duration, JSVoidFunctor0 complete);

    public abstract J fadeIn(int duration);

    public abstract J fadeIn(int duration, JSVoidFunctor0 complete);

    public abstract J fadeIn(JQueryAnimationOptions options);

    public abstract J fadeIn(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J fadeIn(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J fadeOut(int duration);

    public abstract J fadeOut(int duration, JSVoidFunctor0 complete);

    public abstract J fadeOut(String duration);

    public abstract J fadeOut(String duration, JSVoidFunctor0 complete);

    public abstract J fadeOut(JQueryAnimationOptions options);

    public abstract J fadeOut(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J fadeOut(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J fadeTo(String duration, int opacity);

    public abstract J fadeTo(int duration, int opacity);

    public abstract J fadeTo(String duration, int opacity, JSVoidFunctor0 complete);

    public abstract J fadeTo(int duration, int opacity, JSVoidFunctor0 complete);

    public abstract J fadeTo(String duration, int opacity, String easing, JSVoidFunctor0 complete);

    public abstract J fadeTo(int duration, int opacity, String easing, JSVoidFunctor0 complete);

    public abstract J fadeToggle(String duration);

    public abstract J fadeToggle(String duration, JSVoidFunctor0 complete);

    public abstract J fadeToggle(int duration);

    public abstract J fadeToggle(int duration, JSVoidFunctor0 complete);

    public abstract J fadeToggle(JQueryAnimationOptions options);

    public abstract J fadeToggle(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J fadeToggle(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J finish(String queue);

    public abstract J hide();

    public abstract J hide(String duration);

    public abstract J hide(int duration);

    public abstract J hide(JSVoidFunctor0 complete);

    public abstract J hide(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J hide(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J hide(JQueryAnimationOptions options);

    public abstract J show();

    public abstract J show(String duration);

    public abstract J show(int duration);

    public abstract J show(JSVoidFunctor0 complete);

    public abstract J show(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J show(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J show(JQueryAnimationOptions options);

    public abstract J slideDown();

    public abstract J slideDown(String duration);

    public abstract J slideDown(int duration);

    public abstract J slideDown(JSVoidFunctor0 complete);

    public abstract J slideDown(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideDown(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideDown(JQueryAnimationOptions options);

    public abstract J slideToggle();

    public abstract J slideToggle(String duration);

    public abstract J slideToggle(int duration);

    public abstract J slideToggle(JSVoidFunctor0 complete);

    public abstract J slideToggle(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideToggle(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideToggle(JQueryAnimationOptions options);

    public abstract J slideUp();

    public abstract J slideUp(String duration);

    public abstract J slideUp(int duration);

    public abstract J slideUp(JSVoidFunctor0 complete);

    public abstract J slideUp(String duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideUp(int duration, String easing, JSVoidFunctor0 complete);

    public abstract J slideUp(JQueryAnimationOptions options);

    public abstract J stop();

    public abstract J stop(boolean clearQueue);

    public abstract J stop(String queue, boolean clearQueue);

    public abstract J stop(boolean clearQueue, boolean jumpToEnd);

    public abstract J stop(String queue, boolean clearQueue, boolean jumpToEnd);

    public abstract J bind(String eventType);

    public abstract J bind(String eventType, JSObject eventData);

    public abstract J bind(String eventType, JSObject eventData, boolean preventBubble);

    public abstract J bind(String eventType, JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J bind(String eventType, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J blur();

    public abstract J blur(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J blur(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J change();

    public abstract J change(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J change(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J click();

    public abstract J click(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J click(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J dblclick();

    public abstract J dblclick(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J dblclick(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J delegate(String selector, String eventType, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J delegate(String selector, String eventType, JSObject eventData,
            JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J focus();

    public abstract J focus(JQueryEventHandler handler);

    public abstract J focus(JSObject eventData, JQueryEventHandler handler);

    public abstract J focusin();

    public abstract J focusin(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J focusin(JSObject eventData, JQueryEventHandler handler);

    public abstract J focusout();

    public abstract J focusout(JQueryEventHandler handler);

    public abstract J focusout(JSObject eventData, JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J hover(JQueryEventHandler handlerIn, JQueryEventHandler handlerOut);

    public abstract J keydown();

    public abstract J keydown(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J keydown(JSObject eventData, JQueryEventHandler handler);

    public abstract J keypress();

    public abstract J keypress(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J keypress(JSObject eventData, JQueryEventHandler handler);

    public abstract J keyup();

    public abstract J keyup(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J keyup(JSObject eventData, JQueryEventHandler handler);

    public abstract J mousedown();

    public abstract J mousedown(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mousedown(JSObject eventData, JQueryEventHandler handler);

    public abstract J mouseenter();

    public abstract J mouseenter(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mouseenter(JSObject eventData, JQueryEventHandler handler);

    public abstract J mouseleave();

    public abstract J mouseleave(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mouseleave(JSObject eventData, JQueryEventHandler handler);

    public abstract J mousemove();

    public abstract J mousemove(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mousemove(JSObject eventData, JQueryEventHandler handler);

    public abstract J mouseout();

    public abstract J mouseout(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mouseout(JSObject eventData, JQueryEventHandler handler);

    public abstract J mouseover();

    public abstract J mouseover(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mouseover(JSObject eventData, JQueryEventHandler handler);

    public abstract J mouseup();

    public abstract J mouseup(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J mouseup(JSObject eventData, JQueryEventHandler handler);

    public abstract J off(String events);

    public abstract J off(String events, String selector);

    public abstract J off(String events, String selector, JQueryEventHandler handler);

    public abstract J off(JSObject events, String selector);

    public abstract J off(JQueryEventObject event);

    public abstract J off();

    public abstract J on(String events, boolean shorthandHandler);

    public abstract J on(String events, JQueryEventHandler handler);

    public abstract J on(String events, JQueryEventHandlerWithExtraParameters handler);

    public abstract J on(String events, String selector, boolean shorthandHandler);

    public abstract J on(String events, String selector, JSObject data, boolean shorthandHandler);

    public abstract J on(JSObject events);

    public abstract J on(JSObject events, String selector);

    public abstract J on(JSObject events, String selector, JSObject eventData);

    public abstract J one(String events, boolean shorthandHandler);

    public abstract J one(String events, JQueryEventHandler handler);

    public abstract J one(String events, String selector, boolean shorthandHandler);

    public abstract J one(String events, String selector, JSObject data, boolean shorthandHandler);

    public abstract J one(JSObject events);

    public abstract J one(JSObject events, String selector);

    public abstract J one(JSObject events, String selector, JSObject eventData);

    public abstract J ready(JQueryEventHandler handler);

    public abstract J resize();

    public abstract J resize(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J resize(JSObject eventData, JQueryEventHandler handler);

    public abstract J scroll();

    public abstract J scroll(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J scroll(JSObject eventData, JQueryEventHandler handler);

    public abstract J select();

    public abstract J select(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J select(JSObject eventData, JQueryEventHandler handler);

    public abstract J submit();

    public abstract J submit(JSVoidFunctor1<JQueryEventObject> handler);

    public abstract J submit(JSObject eventData, JQueryEventHandler handler);

    public abstract J trigger(String eventType);

    public abstract J trigger(String eventType, JSObject... extraParameters);

    public abstract J trigger(JQueryEventObject event);

    public abstract J trigger(JQueryEventObject event, JSObject... extraParameters);

    public abstract J unbind(String eventType);

    public abstract J unbind(String eventType, JQueryEventHandler handler);

    public abstract J unbind(String eventType, boolean falseResult);

    public abstract J unbind(JQueryEventObject event);

    public abstract J unbind();

    public abstract J undelegate();

    public abstract J undelegate(String namespace);

    public abstract J undelegate(String selector, String eventType);

    public abstract J undelegate(String selector, String eventType, JQueryEventObject event);

    public abstract J undelegate(String selector, JQueryEventObject event);

    public abstract J pushStack(JSArray<Element> elements);

    public abstract J pushStack(JSArray<Element> elements, String name, JSArray<JSObject> arguments);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J after(String... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J after(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J after(JSArray<Element>... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J after(J... content);

    public abstract J after(JQueryDomUpdateFunction funct);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J append(String... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J append(JSString... content);

    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J append(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J append(JSArray<Element>... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.after.apply(this, content)")
    public final native J append(J... content);

    public abstract J append(JQueryDomUpdateFunction funct);

    public abstract J appendTo(String target);

    public abstract J appendTo(Element target);

    public abstract J appendTo(JSArray<Element> target);

    public abstract J appendTo(J target);

    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native J before(String... content);

    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native J before(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native J before(JSArray<Element>... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.before.apply(this, content)")
    public final native J before(J... content);

    public abstract J before(JQueryDomUpdateFunction funct);

    public abstract J clone();

    public abstract J clone(boolean withDataAndEvents);

    public abstract J clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

    public abstract J detach();

    public abstract J detach(String selector);

    public abstract J empty();

    public abstract J insertAfter(String target);

    public abstract J insertAfter(Element target);

    public abstract J insertAfter(JSArray<Element> target);

    public abstract J insertAfter(J target);

    public abstract J insertBefore(String target);

    public abstract J insertBefore(Element target);

    public abstract J insertBefore(JSArray<Element> target);

    public abstract J insertBefore(J target);

    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native J prepend(String... content);

    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native J prepend(Element... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native J prepend(JSArray<Element>... content);

    @SafeVarargs
    @JSBody(params = { "content" }, script = "return this.prepend.apply(this, content)")
    public final native J prepend(J... content);

    public abstract J prepend(JQueryDomUpdateFunction funct);

    public abstract J remove();

    public abstract J remove(String selector);

    public abstract J replaceAll(String target);

    public abstract J replaceAll(Element target);

    public abstract J replaceAll(JSArray<Element> target);

    public abstract J replaceAll(J target);

    public abstract String text();

    public abstract J text(String text);

    public abstract JSArray<Element> toArray();

    public abstract J unwrap();

    public abstract J wrap(String target);

    public abstract J wrap(Element target);

    public abstract J wrap(JSArray<Element> target);

    public abstract J wrap(J target);

    public abstract J wrap(JQueryDomWrapFunctionByString funct);

    public abstract J wrap(JQueryDomWrapFunctionByJQuery funct);

    public abstract J wrapAll(String target);

    public abstract J wrapAll(Element target);

    public abstract J wrapAll(JSArray<Element> target);

    public abstract J wrapAll(J target);

    public abstract J wrapAll(JQueryDomWrapFunctionByJQuery funct);

    public abstract J wrapAll(JQueryDomWrapFunctionByString funct);

    public abstract J wrapInner(String target);

    public abstract J wrapInner(Element target);

    public abstract J wrapInner(JSArray<Element> target);

    public abstract J wrapInner(J target);

    public abstract J wrapInner(JQueryDomWrapFunctionByJQuery funct);

    public abstract J each(JSVoidFunctor2<JSNumber, Element> funct);

    public abstract JSArray<Element> get();

    public abstract int index();

    public abstract int index(String selector);

    public abstract int index(Element element);

    public abstract int index(J jquery);

    public abstract int length();

    public abstract J add(String html);

    @JSBody(params = { "elements" }, script = "return this.add.apply(this, elements)")
    public final native J add(Element... elements);

    public abstract J add(J jquery);

    public abstract J add(String selector, Element context);

    public abstract J addBack();

    public abstract J addBack(String selector);

    public abstract J children();

    public abstract J children(String selector);

    public abstract J closest(String selector);

    public abstract J closest(String selector, Element context);

    public abstract J closest(J jquery);

    public abstract J closest(Element element);

    public abstract J closest(JSArray<Element> element);

    public abstract J contents();

    public abstract J end();

    public abstract J eq(int index);

    public abstract J filter(String selector);

    @JSBody(params = { "elements" }, script = "return this.filter.apply(this, elements)")
    public final native J filter(Element... elements);

    public abstract J filter(J jquery);

    public abstract J filter(JQueryDomFilterFunction funct);

    public abstract J find(String selector);

    public abstract J find(Element element);

    public abstract J find(J jquery);

    public abstract J first();

    public abstract J has(String selector);

    public abstract J has(Element element);

    public abstract J is(String selector);

    public abstract J is(JQueryDomFilterFunction funct);

    public abstract J is(Element element);

    public abstract J is(J jquery);

    public abstract J last();

    public abstract J map(JQueryDomMapFunction funct);

    public abstract J next();

    public abstract J nextAll();

    public abstract J nextAll(String selector);

    public abstract J nextUntil();

    public abstract J nextUntil(String selector);

    public abstract J nextUntil(String selector, String filterSelector);

    public abstract J nextUntil(Element element, String filterSelector);

    public abstract J nextUntil(J jquery, String filterSelector);

    public abstract J not(String selector);

    public abstract J not(JQueryDomFilterFunction funct);

    public abstract J not(J jquery);

    public abstract J offsetParent();

    public abstract J parent();

    public abstract J parent(String selector);

    public abstract J parents();

    public abstract J parents(String selector);

    public abstract J parentsUntil();

    public abstract J parentsUntil(String selector);

    public abstract J parentsUntil(String selector, String filterSelector);

    public abstract J parentsUntil(Element element, String filterSelector);

    public abstract J parentsUntil(J jquery, String filterSelector);

    public abstract J prev();

    public abstract J prev(String selector);

    public abstract J prevAll();

    public abstract J prevAll(String selector);

    public abstract J prevUntil();

    public abstract J prevUntil(String selector);

    public abstract J prevUntil(String selector, String filterSelector);

    public abstract J prevUntil(Element element, String filterSelector);

    public abstract J prevUntil(J jquery, String filterSelector);

    public abstract J siblings();

    public abstract J siblings(String selector);

    public abstract J slice(int start);

    public abstract J slice(int start, int end);

}
