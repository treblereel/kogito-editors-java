package org.kie.workbench.common.stunner.client.widgets.explorer.tree;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.resources.client.ResourcePrototype;

public class TreeExplorerView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator implements TreeExplorerView_ViewBinderImpl_GenBundle {
  private static TreeExplorerView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new TreeExplorerView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new TreeExplorerView_ViewBinderImpl_GenCss_style() {
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
        return ("");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static TreeExplorerView_ViewBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public TreeExplorerView_ViewBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static TreeExplorerView_ViewBinderImpl_GenCss_style style;
  
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
