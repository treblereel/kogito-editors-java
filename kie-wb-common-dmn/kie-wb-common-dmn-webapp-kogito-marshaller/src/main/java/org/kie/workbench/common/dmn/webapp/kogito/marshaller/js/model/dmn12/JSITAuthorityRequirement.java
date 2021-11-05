
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TAuthorityRequirement</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSITAuthorityRequirement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TAuthorityRequirement";

    protected JSITAuthorityRequirement() {
    }

    @JsOverlay
    public static JSITAuthorityRequirement newInstance() {
        JSITAuthorityRequirement toReturn = new JSITAuthorityRequirement();
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
        toReturn.setLocalPart("tAuthorityRequirement");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tAuthorityRequirement");
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
     * Native getter for <b>requiredDecision</b>
     * 
     * @return
     *     The <b>requiredDecision</b> JSON property
     */
    @JsProperty(name = "requiredDecision")
    public native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredDecision();

    /**
     * Setter for <b>requiredDecision</b>
     * 
     * @param requiredDecisionParam
     *      <b>requiredDecision</b> to set.
     */
    @JsProperty(name = "requiredDecision")
    public final native void setRequiredDecision(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredDecisionParam);

    /**
     * Native getter for <b>requiredInput</b>
     * 
     * @return
     *     The <b>requiredInput</b> JSON property
     */
    @JsProperty(name = "requiredInput")
    public native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredInput();

    /**
     * Setter for <b>requiredInput</b>
     * 
     * @param requiredInputParam
     *      <b>requiredInput</b> to set.
     */
    @JsProperty(name = "requiredInput")
    public final native void setRequiredInput(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredInputParam);

    /**
     * Native getter for <b>requiredAuthority</b>
     * 
     * @return
     *     The <b>requiredAuthority</b> JSON property
     */
    @JsProperty(name = "requiredAuthority")
    public native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredAuthority();

    /**
     * Setter for <b>requiredAuthority</b>
     * 
     * @param requiredAuthorityParam
     *      <b>requiredAuthority</b> to set.
     */
    @JsProperty(name = "requiredAuthority")
    public final native void setRequiredAuthority(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredAuthorityParam);

}
