package org.uberfire.ext.widgets.table.client.resources;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.resources.client.ResourcePrototype;

public class UFTableResources_default_InlineClientBundleGenerator implements UFTableResources {
  private static UFTableResources_default_InlineClientBundleGenerator _instance0 = new UFTableResources_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new UFTableCss() {
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
        return (".GIYSKH5CNN td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GIYSKH5CBO:first-child td{border-top:" + ("none")  + ";}.GIYSKH5CPN thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GIYSKH5CON{border-top:" + ("none")  + ";margin-bottom:" + ("0")  + ";}.GIYSKH5CAO{width:" + ("100%")  + ";height:" + ("300px")  + ";}.GIYSKH5CMN{background-color:") + (("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GIYSKH5CMN .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}");
      }
      public String columnPickerButton() {
        return "GIYSKH5CLN";
      }
      public String columnPickerPopup() {
        return "GIYSKH5CMN";
      }
      public String dataGrid() {
        return "GIYSKH5CNN";
      }
      public String dataGridContent() {
        return "GIYSKH5CON";
      }
      public String dataGridHeader() {
        return "GIYSKH5CPN";
      }
      public String dataGridMain() {
        return "GIYSKH5CAO";
      }
      public String dataGridRow() {
        return "GIYSKH5CBO";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static UFTableCss get() {
      return CSS;
    }
  }
  public UFTableCss CSS() {
    return CSSInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static UFTableCss CSS;
  
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
