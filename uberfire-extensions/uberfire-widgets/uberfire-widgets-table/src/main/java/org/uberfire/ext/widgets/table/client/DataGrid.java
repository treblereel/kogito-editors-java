/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
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

package org.uberfire.ext.widgets.table.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.dom.client.Element;
import org.gwtproject.view.client.ProvidesKey;

import static jsinterop.annotations.JsPackage.GLOBAL;

public class DataGrid<T> extends org.gwtbootstrap3.client.ui.gwt.DataGrid<T> {

    public DataGrid() {
        super();
        setupDefaults();
    }

    public DataGrid(final ProvidesKey<T> keyProvider) {
        super(keyProvider);
        setupDefaults();
    }

    protected void setupDefaults() {
        setHover(true);
        setStriped(true);
        setBordered(true);
        addRedrawHandler(() -> fixTableStyle(this.getElement()));
    }

    public void fixTableStyle(final Element e) {
        JQuery elm = JQuery.$(e).find("table").first();
        elm.addClass("table");
        elm.css("margin-bottom", "0px");
    }
    /*-{
        var table = $wnd.jQuery(e).find("table").first();
        table.addClass("table");
        table.css("margin-bottom", "0px");
    }-*/;

    @JsType(isNative = true, namespace = GLOBAL, name = "jQuery")
    public static abstract class JQuery {

        @JsMethod(namespace = GLOBAL, name = "jQuery")
        public native static JQuery $(final JavaScriptObject selector);

        @JsMethod(namespace = GLOBAL, name = "jQuery")
        public native static JQuery first();

        @JsMethod(namespace = GLOBAL, name = "jQuery")
        public native static JQuery find(String s);

        @JsMethod(namespace = GLOBAL, name = "jQuery")
        public native static void addClass(String clazz);

        @JsMethod(namespace = GLOBAL, name = "jQuery")
        public native static void css(String param1, String param2);
    }
}
