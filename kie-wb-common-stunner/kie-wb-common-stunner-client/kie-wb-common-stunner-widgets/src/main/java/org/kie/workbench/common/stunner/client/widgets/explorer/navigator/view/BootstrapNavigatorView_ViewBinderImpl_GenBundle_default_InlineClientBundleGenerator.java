package org.kie.workbench.common.stunner.client.widgets.explorer.navigator.view;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.resources.client.ResourcePrototype;

public class BootstrapNavigatorView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator implements BootstrapNavigatorView_ViewBinderImpl_GenBundle {
  private static BootstrapNavigatorView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new BootstrapNavigatorView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new BootstrapNavigatorView_ViewBinderImpl_GenCss_style() {
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
        return (".GIYSKH5CEO{width:" + ("100%")  + ";height:" + ("100%")  + ";}.GIYSKH5CDO{text-align:" + ("center")  + ";}");
      }
      public String loadingPanel() {
        return "GIYSKH5CDO";
      }
      public String panel() {
        return "GIYSKH5CEO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static BootstrapNavigatorView_ViewBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public BootstrapNavigatorView_ViewBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static BootstrapNavigatorView_ViewBinderImpl_GenCss_style style;
  
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
