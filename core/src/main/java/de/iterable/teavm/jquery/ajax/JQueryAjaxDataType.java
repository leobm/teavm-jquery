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

/**
*
* @author Jan-Felix Wittmann
*/
public enum JQueryAjaxDataType {

    TEXT("text"), //
    HTML("html"), //
    XML("xml"), //
    JSON("json"), //
    JSONP("jsonp"), //
    SCRIPT("script");

    private String value;

    JQueryAjaxDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
