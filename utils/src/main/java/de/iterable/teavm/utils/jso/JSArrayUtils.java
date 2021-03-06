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
package de.iterable.teavm.utils.jso;

import java.util.ArrayList;
import java.util.List;

import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSNumber;
import org.teavm.jso.core.JSString;

/**
*
* @author Jan-Felix Wittmann
*/
public final class JSArrayUtils {

    private JSArrayUtils() {
    }

    public static <V extends Object, S extends JSObject> JSArray<S> of(V[] items, JSFromObjectMapper<V, S> mapper) {
        final JSArray<S> array = JSArray.create(items.length);
        for (int i = 0; i < items.length; ++i) {
            array.set(i, mapper.apply(items[i]));
        }
        return array;   
    }

    @SafeVarargs
    public static JSArray<JSString> of(String... items) {
        return of(items, value -> JSString.valueOf(value));
    }

    @SafeVarargs
    public static JSArray<JSNumber> of(Integer... items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    @SafeVarargs
    public static JSArray<JSNumber> of(Double... items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    @SafeVarargs
    public static JSArray<JSNumber> of(Float... items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    public static <V extends Object, S extends JSObject> JSArray<S> of(Iterable<V> items, JSFromObjectMapper<V, S> mapper) {
        final JSArray<S> array = JSArray.create();
        for (V item : items) {
            array.push(mapper.apply(item));
        }
        return array;
    }

    public static JSArray<JSString> ofStringIterable(Iterable<String> items) {
        return of(items, value -> JSString.valueOf(value));
    }

    public static JSArray<JSNumber> ofIntIterable(Iterable<Integer> items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    public static JSArray<JSNumber> ofFloatIterable(Iterable<Float> items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    public static JSArray<JSNumber> ofDoubleIterable(Iterable<Float> items) {
        return of(items, value -> JSNumber.valueOf(value));
    }

    public static <V extends JSObject, S extends Object> List<S> asList(JSArray<V> arr, JSToObjectMapper<V, S> mapper) {
        final List<S> list = new ArrayList<>(arr.getLength());
        for (int i = 0; i < arr.getLength(); i++) {
            list.add(mapper.apply(arr.get(i)));
        }
        return list;
    }

    public static List<String> asStringList(JSArray<JSString> arr) {
        return asList(arr, value -> value.stringValue());
    }

    public static List<Integer> asIntList(JSArray<JSNumber> arr) {
        return asList(arr, value -> value.intValue());
    }

    public static List<Double> asDoubleList(JSArray<JSNumber> arr) {
        return asList(arr, value -> value.doubleValue());
    }

    public static List<Float> asFloatList(JSArray<JSNumber> arr) {
        return asList(arr, value -> value.floatValue());
    }

}
