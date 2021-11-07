package org.kie.workbench.common.stunner.kogito.client.services.util;

import org.gwtproject.resources.client.ImageResource;
import org.gwtproject.resources.client.ResourcePrototype;
import org.gwtproject.resources.client.TextResource;
import org.gwtproject.resources.client.impl.ImageResourcePrototype;
import org.gwtproject.safehtml.shared.UriUtils;

public class WidPresetResources_default_InlineClientBundleGenerator implements WidPresetResources {
  private static WidPresetResources_default_InlineClientBundleGenerator _instance0 = new WidPresetResources_default_InlineClientBundleGenerator();
  private void asTextInitializer() {
    asText = new TextResource() {
      // file:/home/treblereel/workspace/redhat/kogito-editors-java/kie-wb-common-stunner/kie-wb-common-stunner-sets/kie-wb-common-stunner-bpmn/kie-wb-common-stunner-bpmn-kogito-runtime/src/main/webapp/WEB-INF/classes/org/kie/workbench/common/stunner/kogito/client/services/util/WorkDefinitions.wid
      public String getText() {
        return "[\n   [\n    \"name\" : \"Milestone\",\n    \"parameters\" : [\n        \"Condition\" : new StringDataType()\n    ],\n    \"displayName\" : \"Milestone\",\n    \"icon\" : \"defaultmilestoneicon.png\",\n    \"category\" : \"Milestone\"\n    ]\n]\n";
      }
      public String getName() {
        return "asText";
      }
    }
    ;
  }
  private static class asTextInitializer {
    static {
      _instance0.asTextInitializer();
    }
    static TextResource get() {
      return asText;
    }
  }
  public TextResource asText() {
    return asTextInitializer.get();
  }
  private void getMillestoneImageInitializer() {
    getMillestoneImage = new ImageResourcePrototype(
            "getMillestoneImage",
            UriUtils.fromTrustedString(externalImage),
            0, 0, 20, 20, false, false
    );
  }
  private static class getMillestoneImageInitializer {
    static {
      _instance0.getMillestoneImageInitializer();
    }
    static ImageResource get() {
      return getMillestoneImage;
    }
  }
  public ImageResource getMillestoneImage() {
    return getMillestoneImageInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static TextResource asText;
  private static final String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAYAAACNiR0NAAAAzUlEQVR4XmNgGDJARUXlb4yc3K77AgLPHggIPH3Ax7f8Pj9/xgMuLqNXDAw86OoJAqCB/zRUVJ4/4Oe/DTTwPxL+ep+Xd+MDXt6kuwwM/Oj6cAI8BmLgh3x8R+9zcfk/4+UVQTcHDkgxEBnf4+O7/4iHxw7dPOIM5Of/dZ+P7wTQhXFXGBgkQhkYmNHNgQMMA/n5/wHxdyDef5+Hp/4/AwMLuh4QKGRg4EQXAwOYgUAXHH3Eymq6H4cBRAOQgUD8GF2cbDBqIOVg1MBhDAACjZeAKbj0+AAAAABJRU5ErkJggg==";
  private static ImageResource getMillestoneImage;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      asText(), 
      getMillestoneImage(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("asText", asText());
        resourceMap.put("getMillestoneImage", getMillestoneImage());
      }
      return resourceMap.get(name);
  }
}
