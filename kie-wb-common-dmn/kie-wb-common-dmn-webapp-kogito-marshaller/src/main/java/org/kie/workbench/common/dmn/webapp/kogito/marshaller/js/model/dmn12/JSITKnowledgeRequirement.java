
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TKnowledgeRequirement</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSITKnowledgeRequirement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TKnowledgeRequirement";

    protected JSITKnowledgeRequirement() {
    }

    @JsOverlay
    public static JSITKnowledgeRequirement newInstance() {
        JSITKnowledgeRequirement toReturn = new JSITKnowledgeRequirement();
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
        toReturn.setLocalPart("tKnowledgeRequirement");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tKnowledgeRequirement");
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
     * Native getter for <b>requiredKnowledge</b>
     * 
     * @return
     *     The <b>requiredKnowledge</b> JSON property
     */
    @JsProperty(name = "requiredKnowledge")
    public native JSITDMNElementReference getRequiredKnowledge();

    /**
     * Setter for <b>requiredKnowledge</b>
     * 
     * @param requiredKnowledgeParam
     *      <b>requiredKnowledge</b> to set.
     */
    @JsProperty(name = "requiredKnowledge")
    public final native void setRequiredKnowledge(JSITDMNElementReference requiredKnowledgeParam);

}
