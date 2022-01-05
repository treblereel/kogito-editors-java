
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>TFunctionKind</code>
 * 
 */
@JsType(name = "TFunctionKind")
public enum JSITFunctionKind {

    FEEL("FEEL"),
    JAVA("Java"),
    PMML("PMML");
    private final String value;

    JSITFunctionKind(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
