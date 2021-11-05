
package org.drools.workbench.scenariosimulation.kogito.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JSIName;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>SimulationType</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSISimulationType {

    @JsOverlay
    public final static String TYPE = "SCESIM.SimulationType";

    protected JSISimulationType() {
    }

    @JsOverlay
    public static JSISimulationType newInstance() {
        JSISimulationType toReturn = new JSISimulationType();
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
        toReturn.setLocalPart("simulationType");
        toReturn.setPrefix("");
        toReturn.setKey("{}");
        toReturn.setString("{}simulationType");
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
     * Native getter for <b>scesimModelDescriptor</b>
     * 
     * @return
     *     The <b>scesimModelDescriptor</b> JSON property
     */
    @JsProperty(name = "scesimModelDescriptor")
    public native JSIScesimModelDescriptorType getScesimModelDescriptor();

    /**
     * Setter for <b>scesimModelDescriptor</b>
     * 
     * @param scesimModelDescriptorParam
     *      <b>scesimModelDescriptor</b> to set.
     */
    @JsProperty(name = "scesimModelDescriptor")
    public final native void setScesimModelDescriptor(JSIScesimModelDescriptorType scesimModelDescriptorParam);

    /**
     * Native getter for <b>scesimData</b>
     * 
     * @return
     *     The <b>scesimData</b> JSON property
     */
    @JsProperty(name = "scesimData")
    public native JSIScenariosType getScesimData();

    /**
     * Setter for <b>scesimData</b>
     * 
     * @param scesimDataParam
     *      <b>scesimData</b> to set.
     */
    @JsProperty(name = "scesimData")
    public final native void setScesimData(JSIScenariosType scesimDataParam);

}
