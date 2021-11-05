
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIEdge;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNDecisionServiceDividerLine</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSIDMNDecisionServiceDividerLine
    extends JSIEdge
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDecisionServiceDividerLine";

    protected JSIDMNDecisionServiceDividerLine() {
    }

    @JsOverlay
    public static JSIDMNDecisionServiceDividerLine newInstance() {
        JSIDMNDecisionServiceDividerLine toReturn = new JSIDMNDecisionServiceDividerLine();
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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/DMNDI/");
        toReturn.setLocalPart("DMNDecisionServiceDividerLine");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNDecisionServiceDividerLine");
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

}
