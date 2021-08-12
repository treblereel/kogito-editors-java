/*
 * Copyright 2015 JBoss, by Red Hat, Inc
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
package org.uberfire.ext.widgets.common.client.colorpicker.canvas;

import jsinterop.annotations.JsConstructor;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayInteger;

public class ImageData extends JavaScriptObject {

    @JsConstructor
    protected ImageData() {
    }

    public final int getWidth() {
        throw new Error(getClass().getCanonicalName() + ".getWidth");
    }/*-{
        return this.width;
    }-*/;

    public final int getHeight() {
        throw new Error(getClass().getCanonicalName() + ".getHeight");

    }/*-{
        return this.height;
    }-*/;

    public final JsArrayInteger getData() {
        throw new Error(getClass().getCanonicalName() + ".getData");

    }/*-{
        return this.data;
    }-*/;
}
