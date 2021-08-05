package org.uberfire.ext.widgets.table.client;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class UberfirePagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements UberfirePagedTable_BinderImpl_GenBundle {
  private static UberfirePagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new UberfirePagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new UberfirePagedTable_BinderImpl_GenCss_style() {
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
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5COO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CPO{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GIYSKH5CBP{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GIYSKH5CNO{text-align:" + ("center")  + ";}.GIYSKH5CAP{margin:" + ("0")  + ";}")) : ((".GIYSKH5COO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CPO{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GIYSKH5CBP{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GIYSKH5CNO{text-align:" + ("center")  + ";}.GIYSKH5CAP{margin:" + ("0")  + ";}"));
      }
      public String centerToolBar() {
        return "GIYSKH5CNO";
      }
      public String dataGridContainer() {
        return "GIYSKH5COO";
      }
      public String leftToolBar() {
        return "GIYSKH5CPO";
      }
      public String pager() {
        return "GIYSKH5CAP";
      }
      public String rightToolBar() {
        return "GIYSKH5CBP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static UberfirePagedTable_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public UberfirePagedTable_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static UberfirePagedTable_BinderImpl_GenCss_style style;
  
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
