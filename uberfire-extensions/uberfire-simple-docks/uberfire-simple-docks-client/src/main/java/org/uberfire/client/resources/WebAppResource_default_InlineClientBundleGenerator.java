package org.uberfire.client.resources;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class WebAppResource_default_InlineClientBundleGenerator implements WebAppResource {
  private static WebAppResource_default_InlineClientBundleGenerator _instance0 = new WebAppResource_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new DocksCss() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "CSS";
      }
      public String getText() {
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5COK{margin-top:" + ("5px")  + ";margin-right:" + ("2px")  + ";margin-left:" + ("2px")  + ";}.GIYSKH5CPK,.GIYSKH5CPK i{height:" + ("100%")  + ";}.GIYSKH5CMK{display:" + ("none")  + ";}.GIYSKH5CLK{border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GIYSKH5CKK{border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";text-align:" + ("center")  + ";}.GIYSKH5CPJ{height:" + ("100%")  + ";width:") + (("100%")  + ";}.GIYSKH5CJK{height:" + ("36px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GIYSKH5CEK{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GIYSKH5CAL{margin-right:" + ("5px")  + ";margin-top:" + ("5px")  + ";}.GIYSKH5CIK{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0") ) + (";}.GIYSKH5CCK{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("15px")  + ";}.GIYSKH5CGK{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GIYSKH5CAK{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("15px")  + ";}.GIYSKH5CHK{float:") + (("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GIYSKH5CBK{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("6px")  + ";}.GIYSKH5COJ{margin-right:" + ("3px")  + ";margin-left:" + ("3px")  + ";}.GIYSKH5CNK{background-color:" + ("#ddd")  + ";float:" + ("left") ) + (";}.GIYSKH5CDK{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("5px")  + ";}")) : ((".GIYSKH5COK{margin-top:" + ("5px")  + ";margin-left:" + ("2px")  + ";margin-right:" + ("2px")  + ";}.GIYSKH5CPK,.GIYSKH5CPK i{height:" + ("100%")  + ";}.GIYSKH5CMK{display:" + ("none")  + ";}.GIYSKH5CLK{border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GIYSKH5CKK{border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";text-align:" + ("center")  + ";}.GIYSKH5CPJ{height:" + ("100%")  + ";width:") + (("100%")  + ";}.GIYSKH5CJK{height:" + ("36px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GIYSKH5CEK{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GIYSKH5CAL{margin-left:" + ("5px")  + ";margin-top:" + ("5px")  + ";}.GIYSKH5CIK{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0") ) + (";}.GIYSKH5CCK{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("15px")  + ";}.GIYSKH5CGK{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GIYSKH5CAK{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("15px")  + ";}.GIYSKH5CHK{float:") + (("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GIYSKH5CBK{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("6px")  + ";}.GIYSKH5COJ{margin-left:" + ("3px")  + ";margin-right:" + ("3px")  + ";}.GIYSKH5CNK{background-color:" + ("#ddd")  + ";float:" + ("right") ) + (";}.GIYSKH5CDK{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("5px")  + ";}"));
      }
      public String buttonFocused() {
        return "GIYSKH5COJ";
      }
      public String dockExpanded() {
        return "GIYSKH5CPJ";
      }
      public String dockExpandedButtonEast() {
        return "GIYSKH5CAK";
      }
      public String dockExpandedButtonSouth() {
        return "GIYSKH5CBK";
      }
      public String dockExpandedButtonWest() {
        return "GIYSKH5CCK";
      }
      public String dockExpandedContentButton() {
        return "GIYSKH5CDK";
      }
      public String dockExpandedContentPanel() {
        return "GIYSKH5CEK";
      }
      public String dockExpandedContentPanelSouth() {
        return "GIYSKH5CFK";
      }
      public String dockExpandedLabelEast() {
        return "GIYSKH5CGK";
      }
      public String dockExpandedLabelSouth() {
        return "GIYSKH5CHK";
      }
      public String dockExpandedLabelWest() {
        return "GIYSKH5CIK";
      }
      public String dockExpandedTitlePanel() {
        return "GIYSKH5CJK";
      }
      public String gradientBottomTop() {
        return "GIYSKH5CKK";
      }
      public String gradientTopBottom() {
        return "GIYSKH5CLK";
      }
      public String hideElement() {
        return "GIYSKH5CMK";
      }
      public String resizableBar() {
        return "GIYSKH5CNK";
      }
      public String sideDockItem() {
        return "GIYSKH5COK";
      }
      public String singleDockItem() {
        return "GIYSKH5CPK";
      }
      public String southDockItem() {
        return "GIYSKH5CAL";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static DocksCss get() {
      return CSS;
    }
  }
  public DocksCss CSS() {
    return CSSInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static DocksCss CSS;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      CSS(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("CSS", CSS());
      }
      return resourceMap.get(name);
  }
}
