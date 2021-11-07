
package org.drools.workbench.scenariosimulation.kogito.marshaller.js;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.drools.workbench.scenariosimulation.kogito.marshaller.js.callbacks.SCESIMMarshallCallback;
import org.drools.workbench.scenariosimulation.kogito.marshaller.js.callbacks.SCESIMUnmarshallCallback;
import org.drools.workbench.scenariosimulation.kogito.marshaller.js.model.SCESIM;


/**
 * JSInterop adapter to use for marshalling/unmarshalling.
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "SCESIMMainJs")
public class SCESIMMainJs {


    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, SCESIMUnmarshallCallback sCESIMUnmarshallCallback);

    @JsMethod
    public final static native void marshall(SCESIM sCESIM, org.gwtproject.core.client.JavaScriptObject namespaces, SCESIMMarshallCallback sCESIMMarshallCallback);

}
