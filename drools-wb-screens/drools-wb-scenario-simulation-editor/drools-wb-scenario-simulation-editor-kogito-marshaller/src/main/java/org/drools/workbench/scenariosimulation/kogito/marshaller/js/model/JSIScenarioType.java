
package org.drools.workbench.scenariosimulation.kogito.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JSIName;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>ScenarioType</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSIScenarioType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ScenarioType";

    protected JSIScenarioType() {
    }

    @JsOverlay
    public static JSIScenarioType newInstance() {
        JSIScenarioType toReturn = new JSIScenarioType();
        Js.asPropertyMap(toReturn).set("TYPE_NAME", TYPE);
        return toReturn;
    }

    @JsOverlay
    public static boolean instanceOf(final Object instance) {
        return TYPE.equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for specific <code>JSIName</code>
     * 
     * @return
     *     Getter for specific <code>JSIName</code>
     */
    @JsOverlay
    public static JSIName getJSIName() {
        JSIName toReturn = new JSIName();
        toReturn.setNamespaceURI("");
        toReturn.setLocalPart("ScenarioType");
        toReturn.setPrefix("");
        toReturn.setKey("{}");
        toReturn.setString("{}ScenarioType");
        return toReturn;
    }

    /**
     * Native getter for <b>TYPE_NAME</b>
     * 
     * @return
     *     The <b>TYPE_NAME</b> JSON property
     */
    @JsProperty(name = "TYPE_NAME")
    public native String getTYPE_NAME();

    /**
     * Native getter for <b>factMappingValues</b>
     * 
     * @return
     *     The <b>factMappingValues</b> JSON property
     */
    @JsProperty(name = "factMappingValues")
    public native JSIFactMappingValuesType getFactMappingValues();

    /**
     * Setter for <b>factMappingValues</b>
     * 
     * @param factMappingValuesParam
     *      <b>factMappingValues</b> to set.
     */
    @JsProperty(name = "factMappingValues")
    public final native void setFactMappingValues(JSIFactMappingValuesType factMappingValuesParam);

}
