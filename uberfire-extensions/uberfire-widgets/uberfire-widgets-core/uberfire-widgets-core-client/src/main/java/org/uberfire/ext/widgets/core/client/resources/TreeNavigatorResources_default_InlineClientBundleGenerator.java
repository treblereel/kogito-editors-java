package org.uberfire.ext.widgets.core.client.resources;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.client.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class TreeNavigatorResources_default_InlineClientBundleGenerator implements TreeNavigatorResources {
  private static TreeNavigatorResources_default_InlineClientBundleGenerator _instance0 = new TreeNavigatorResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new NavigatorStyle() {
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
        return "css";
      }
      public String getText() {
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5CBN{color:" + ("#484848")  + ";}.GIYSKH5CBN a{color:" + ("inherit")  + ";text-decoration:" + ("none")  + ";}.GIYSKH5CBN .GIYSKH5CCN{width:" + ("100%")  + ";min-height:" + ("20px")  + ";margin-top:" + ("1px")  + ";cursor:" + ("pointer")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN{position:" + ("relative")  + ";display:" + ("inline-flex")  + ";height:" + ("20px")  + ";width:") + (("inherit")  + ";white-space:" + ("nowrap")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN i{position:" + ("relative")  + ";top:" + ("5px")  + ";right:" + ("5px")  + ";float:" + ("right")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN .GIYSKH5CFN{padding-right:" + ("12px")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis") ) + (";white-space:" + ("nowrap")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CDN{margin-right:" + ("23px")  + ";}.GIYSKH5CBN .GIYSKH5CGN{display:" + ("inline-flex")  + ";position:" + ("relative")  + ";width:" + ("100%")  + ";height:" + ("20px")  + ";margin:" + ("1px")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";border-top:") + (("1px"+ " " +"solid"+ " " +"transparent")  + ";}.GIYSKH5CBN .GIYSKH5CGN:hover,.GIYSKH5CBN .GIYSKH5CEN:hover{background-color:" + ("#d4edfa")  + ";border-color:" + ("#b3d3e7")  + ";}.GIYSKH5CBN .GIYSKH5CGN .GIYSKH5CHN{position:" + ("relative")  + ";right:" + ("10px")  + ";z-index:" + ("1")  + " !important;display:" + ("inline-flex")  + ";}.GIYSKH5CBN .GIYSKH5CGN i{position:" + ("relative")  + ";padding-top:" + ("2px")  + ";padding-right:" + ("5px")  + ";}.GIYSKH5CBN .GIYSKH5CIN,.GIYSKH5CBN .GIYSKH5CIN:hover,.GIYSKH5CBN .GIYSKH5CIN a{background-color:" + ("#0099d3") ) + (" !important;border-color:" + ("#0076b7")  + " !important;color:" + ("#fff")  + " !important;}.GIYSKH5CBN .GIYSKH5CGN canvas{margin-top:" + ("2px")  + ";margin-right:" + ("2px")  + ";}")) : ((".GIYSKH5CBN{color:" + ("#484848")  + ";}.GIYSKH5CBN a{color:" + ("inherit")  + ";text-decoration:" + ("none")  + ";}.GIYSKH5CBN .GIYSKH5CCN{width:" + ("100%")  + ";min-height:" + ("20px")  + ";margin-top:" + ("1px")  + ";cursor:" + ("pointer")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN{position:" + ("relative")  + ";display:" + ("inline-flex")  + ";height:" + ("20px")  + ";width:") + (("inherit")  + ";white-space:" + ("nowrap")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN i{position:" + ("relative")  + ";top:" + ("5px")  + ";left:" + ("5px")  + ";float:" + ("left")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CEN .GIYSKH5CFN{padding-left:" + ("12px")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis") ) + (";white-space:" + ("nowrap")  + ";}.GIYSKH5CBN .GIYSKH5CCN .GIYSKH5CDN{margin-left:" + ("23px")  + ";}.GIYSKH5CBN .GIYSKH5CGN{display:" + ("inline-flex")  + ";position:" + ("relative")  + ";width:" + ("100%")  + ";height:" + ("20px")  + ";margin:" + ("1px")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";border-top:") + (("1px"+ " " +"solid"+ " " +"transparent")  + ";}.GIYSKH5CBN .GIYSKH5CGN:hover,.GIYSKH5CBN .GIYSKH5CEN:hover{background-color:" + ("#d4edfa")  + ";border-color:" + ("#b3d3e7")  + ";}.GIYSKH5CBN .GIYSKH5CGN .GIYSKH5CHN{position:" + ("relative")  + ";left:" + ("10px")  + ";z-index:" + ("1")  + " !important;display:" + ("inline-flex")  + ";}.GIYSKH5CBN .GIYSKH5CGN i{position:" + ("relative")  + ";padding-top:" + ("2px")  + ";padding-left:" + ("5px")  + ";}.GIYSKH5CBN .GIYSKH5CIN,.GIYSKH5CBN .GIYSKH5CIN:hover,.GIYSKH5CBN .GIYSKH5CIN a{background-color:" + ("#0099d3") ) + (" !important;border-color:" + ("#0076b7")  + " !important;color:" + ("#fff")  + " !important;}.GIYSKH5CBN .GIYSKH5CGN canvas{margin-top:" + ("2px")  + ";margin-left:" + ("2px")  + ";}"));
      }
      public String tree() {
        return "GIYSKH5CBN";
      }
      public String treeFolder() {
        return "GIYSKH5CCN";
      }
      public String treeFolderContent() {
        return "GIYSKH5CDN";
      }
      public String treeFolderHeader() {
        return "GIYSKH5CEN";
      }
      public String treeFolderName() {
        return "GIYSKH5CFN";
      }
      public String treeItem() {
        return "GIYSKH5CGN";
      }
      public String treeItemName() {
        return "GIYSKH5CHN";
      }
      public String treeSelected() {
        return "GIYSKH5CIN";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static NavigatorStyle get() {
      return css;
    }
  }
  public NavigatorStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static NavigatorStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
  }
}
