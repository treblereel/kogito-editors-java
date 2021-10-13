// .ui.xml template last modified: 1633409251095
package org.uberfire.client.views.pfly.tab;

import org.gwtbootstrap3.client.ui.TabPanel;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.HasHorizontalAlignment;
import org.gwtproject.user.client.ui.HorizontalPanel;

public class TabPanelWithDropdowns_TabPanelWithDropdownsBinderImpl implements UiBinder<TabPanel, TabPanelWithDropdowns>, TabPanelWithDropdowns.TabPanelWithDropdownsBinder {


  public TabPanel createAndBindUi(final TabPanelWithDropdowns owner) {


    return new Widgets(owner).get_f_TabPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final TabPanelWithDropdowns owner;


    public Widgets(final TabPanelWithDropdowns owner) {
      this.owner = owner;
      build_tabBar();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_widgetsPanel();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private TabPanelWithDropdowns_TabPanelWithDropdownsBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private TabPanelWithDropdowns_TabPanelWithDropdownsBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final TabPanelWithDropdowns_TabPanelWithDropdownsBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new TabPanelWithDropdowns_TabPanelWithDropdownsBinderImpl_GenBundle() {

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_TabPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private TabPanel get_f_TabPanel1() {
      return build_f_TabPanel1();
    }
    private TabPanel build_f_TabPanel1() {
      // Creation section.
      final TabPanel f_TabPanel1 = new TabPanel();
      // Setup section.
      f_TabPanel1.add(get_tabBarPanel());
      f_TabPanel1.add(get_tabContent());
      f_TabPanel1.addStyleName("uf-tabbar-panel");

      return f_TabPanel1;
    }

    /**
     * Getter for tabBarPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private HorizontalPanel get_tabBarPanel() {
      return build_tabBarPanel();
    }
    private HorizontalPanel build_tabBarPanel() {
      // Creation section.
      final HorizontalPanel tabBarPanel = (HorizontalPanel) new HorizontalPanel();
      // Setup section.
      tabBarPanel.add(get_tabBar());
      tabBarPanel.setCellHorizontalAlignment(get_tabBar(), HasHorizontalAlignment.ALIGN_LEFT);
      tabBarPanel.add(get_widgetsPanel());
      tabBarPanel.setCellHorizontalAlignment(get_widgetsPanel(), HasHorizontalAlignment.ALIGN_RIGHT);
      tabBarPanel.setWidth("100%");

      this.owner.tabBarPanel = tabBarPanel;

      return tabBarPanel;
    }

    /**
     * Getter for tabBar called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.NavTabs tabBar;
    private org.gwtbootstrap3.client.ui.NavTabs get_tabBar() {
      return tabBar;
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_tabBar() {
      // Creation section.
      tabBar = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      tabBar.addStyleName("uf-tabbar-panel-nav-tabs");

      this.owner.tabBar = tabBar;

      return tabBar;
    }

    /**
     * Getter for widgetsPanel called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private HorizontalPanel widgetsPanel;
    private HorizontalPanel get_widgetsPanel() {
      return widgetsPanel;
    }
    private HorizontalPanel build_widgetsPanel() {
      // Creation section.
      widgetsPanel = (HorizontalPanel) new HorizontalPanel();
      // Setup section.
      widgetsPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
      widgetsPanel.addStyleName("uf-tabbar-panel-widgets");
      widgetsPanel.setWidth("0px");

      this.owner.widgetsPanel = widgetsPanel;

      return widgetsPanel;
    }

    /**
     * Getter for tabContent called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_tabContent() {
      return build_tabContent();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_tabContent() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent tabContent = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.

      this.owner.tabContent = tabContent;

      return tabContent;
    }
  }
}
