
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TAssociation</code>
 * 
 */
@JsType(namespace = "<global>", name = "Object", isNative = true)
public class JSITAssociation
    extends JSITArtifact
{

    @JsOverlay
    public final static String TYPE = "DMN12.TAssociation";

    protected JSITAssociation() {
    }

    @JsOverlay
    public static JSITAssociation newInstance() {
        JSITAssociation toReturn = new JSITAssociation();
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
        toReturn.setLocalPart("tAssociation");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tAssociation");
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
     * Native getter for <b>sourceRef</b>
     * 
     * @return
     *     The <b>sourceRef</b> JSON property
     */
    @JsProperty(name = "sourceRef")
    public native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getSourceRef();

    /**
     * Setter for <b>sourceRef</b>
     * 
     * @param sourceRefParam
     *      <b>sourceRef</b> to set.
     */
    @JsProperty(name = "sourceRef")
    public final native void setSourceRef(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference sourceRefParam);

    /**
     * Native getter for <b>targetRef</b>
     * 
     * @return
     *     The <b>targetRef</b> JSON property
     */
    @JsProperty(name = "targetRef")
    public native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getTargetRef();

    /**
     * Setter for <b>targetRef</b>
     * 
     * @param targetRefParam
     *      <b>targetRef</b> to set.
     */
    @JsProperty(name = "targetRef")
    public final native void setTargetRef(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference targetRefParam);

    /**
     * Native getter for <b>associationDirection</b>
     * 
     * @return
     *     The <b>associationDirection</b> JSON property
     */
    @JsProperty(name = "associationDirection")
    public native JSITAssociationDirection getAssociationDirection();

    /**
     * Setter for <b>associationDirection</b>
     * 
     * @param associationDirectionParam
     *      <b>associationDirection</b> to set.
     */
    @JsProperty(name = "associationDirection")
    public final native void setAssociationDirection(JSITAssociationDirection associationDirectionParam);

}
