package org.uberfire.ext.widgets.common.client.tables;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class SimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements SimpleTable_BinderImpl_GenBundle {
  private static SimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new SimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new SimpleTable_BinderImpl_GenCss_style() {
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
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5CGO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CHO{height:" + ("32px")  + ";}.GIYSKH5CIO{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GIYSKH5CFO{text-align:" + ("center")  + ";}")) : ((".GIYSKH5CGO{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GIYSKH5CHO{height:" + ("32px")  + ";}.GIYSKH5CIO{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GIYSKH5CFO{text-align:" + ("center")  + ";}"));
      }
      public String centerToolBar() {
        return "GIYSKH5CFO";
      }
      public String dataGridContainer() {
        return "GIYSKH5CGO";
      }
      public String horizontalContainer() {
        return "GIYSKH5CHO";
      }
      public String rightToolBar() {
        return "GIYSKH5CIO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static SimpleTable_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public SimpleTable_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static SimpleTable_BinderImpl_GenCss_style style;
  
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
