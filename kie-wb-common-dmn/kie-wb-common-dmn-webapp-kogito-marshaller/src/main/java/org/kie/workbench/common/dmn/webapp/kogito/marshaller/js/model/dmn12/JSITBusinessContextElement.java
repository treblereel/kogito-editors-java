
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TBusinessContextElement</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSITBusinessContextElement
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TBusinessContextElement";

    protected JSITBusinessContextElement() {
    }

    @JsOverlay
    public static JSITBusinessContextElement newInstance() {
        JSITBusinessContextElement toReturn = new JSITBusinessContextElement();
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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/MODEL/");
        toReturn.setLocalPart("tBusinessContextElement");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tBusinessContextElement");
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
     * Native getter for <b>uri</b>
     * 
     * @return
     *     The <b>uri</b> JSON property
     */
    @JsProperty(name = "uri")
    public native String getURI();

    /**
     * Setter for <b>uri</b>
     * 
     * @param uriParam
     *      <b>uri</b> to set.
     */
    @JsProperty(name = "uri")
    public final native void setURI(String uriParam);

}