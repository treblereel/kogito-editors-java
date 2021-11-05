
package org.drools.workbench.scenariosimulation.kogito.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JSIName;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>ExpressionIdentifierType</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSIExpressionIdentifierType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ExpressionIdentifierType";

    protected JSIExpressionIdentifierType() {
    }

    @JsOverlay
    public static JSIExpressionIdentifierType newInstance() {
        JSIExpressionIdentifierType toReturn = new JSIExpressionIdentifierType();
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
        toReturn.setLocalPart("expressionIdentifierType");
        toReturn.setPrefix("");
        toReturn.setKey("{}");
        toReturn.setString("{}expressionIdentifierType");
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
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name")
    public final native void setName(String nameParam);

    /**
     * Native getter for <b>type</b>
     * 
     * @return
     *     The <b>type</b> JSON property
     */
    @JsProperty(name = "type")
    public native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type")
    public final native void setType(String typeParam);

}
