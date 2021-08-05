package org.uberfire.ext.widgets.table.client;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class UberfireSimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements UberfireSimpleTable_BinderImpl_GenBundle {
  private static UberfireSimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new UberfireSimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new UberfireSimpleTable_BinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5CKO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CLO{height:" + ("32px")  + ";}.GIYSKH5CMO{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GIYSKH5CJO{text-align:" + ("center")  + ";}")) : ((".GIYSKH5CKO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CLO{height:" + ("32px")  + ";}.GIYSKH5CMO{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GIYSKH5CJO{text-align:" + ("center")  + ";}"));
      }
      public String centerToolBar() {
        return "GIYSKH5CJO";
      }
      public String dataGridContainer() {
        return "GIYSKH5CKO";
      }
      public String horizontalContainer() {
        return "GIYSKH5CLO";
      }
      public String rightToolBar() {
        return "GIYSKH5CMO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static UberfireSimpleTable_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public UberfireSimpleTable_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static UberfireSimpleTable_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
  }
}
