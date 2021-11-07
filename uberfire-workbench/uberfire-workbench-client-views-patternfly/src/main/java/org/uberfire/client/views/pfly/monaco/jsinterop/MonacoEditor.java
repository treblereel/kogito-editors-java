/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.views.pfly.monaco.jsinterop;

import org.gwtproject.core.client.JavaScriptObject;
import elemental2.dom.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@JsType(isNative = true, namespace = "window", name = "monaco")
public class MonacoEditor {

    public void defineTheme(final String themeId,
                                   final JavaScriptObject themeData) {
        throw new Error(MonacoEditor.class.getCanonicalName()+".defineTheme");

    };

    public MonacoStandaloneCodeEditor create(final Element themeId,
                                                    final JavaScriptObject options) {
        throw new Error(MonacoEditor.class.getCanonicalName()+".create");

    };

    public void setTheme(final String feelThemeId) {
        throw new Error(MonacoEditor.class.getCanonicalName()+".setTheme");

    };

    //@JsProperty(name = "editor")
    public static MonacoEditor get() {
        throw new Error(MonacoEditor.class.getCanonicalName()+".get");
    }
}
