// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.tables;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.HasHorizontalAlignment;
import org.gwtproject.user.client.ui.HorizontalPanel;
import org.gwtproject.user.client.ui.SimplePanel;
import org.gwtproject.user.client.ui.Widget;

public class SimpleTable_BinderImpl implements UiBinder<Widget, SimpleTable>, SimpleTable.Binder {


  public Widget createAndBindUi(final SimpleTable owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final SimpleTable owner;


    public Widgets(final SimpleTable owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_leftToolbar();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_centerToolbar();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_rightToolbar();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private SimpleTable_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private SimpleTable_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final SimpleTable_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new SimpleTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private SimpleTable_BinderImpl_GenCss_style style;
    private SimpleTable_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private SimpleTable_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_FlowPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private FlowPanel get_f_FlowPanel1() {
      return build_f_FlowPanel1();
    }
    private FlowPanel build_f_FlowPanel1() {
      // Creation section.
      final FlowPanel f_FlowPanel1 = new FlowPanel();
      // Setup section.
      f_FlowPanel1.add(get_toolbarContainer());
      f_FlowPanel1.add(get_f_SimplePanel2());
      f_FlowPanel1.addStyleName("" + get_style().dataGridContainer() + "");

      return f_FlowPanel1;
    }

    /**
     * Getter for toolbarContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private HorizontalPanel get_toolbarContainer() {
      return build_toolbarContainer();
    }
    private HorizontalPanel build_toolbarContainer() {
      // Creation section.
      final HorizontalPanel toolbarContainer = new HorizontalPanel();
      // Setup section.
      toolbarContainer.add(get_leftToolbar());
      toolbarContainer.setCellWidth(get_leftToolbar(), "33%");
      toolbarContainer.add(get_centerToolbar());
      toolbarContainer.setCellWidth(get_centerToolbar(), "33%");
      toolbarContainer.add(get_rightToolbar());
      toolbarContainer.setCellHorizontalAlignment(get_rightToolbar(), HasHorizontalAlignment.ALIGN_RIGHT);
      toolbarContainer.setCellWidth(get_rightToolbar(), "33%");
      toolbarContainer.addStyleName("" + get_style().horizontalContainer() + "");
      toolbarContainer.setWidth("100%");

      this.owner.toolbarContainer = toolbarContainer;

      return toolbarContainer;
    }

    /**
     * Getter for leftToolbar called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private FlowPanel leftToolbar;
    private FlowPanel get_leftToolbar() {
      return leftToolbar;
    }
    private FlowPanel build_leftToolbar() {
      // Creation section.
      leftToolbar = new FlowPanel();
      // Setup section.
      leftToolbar.setWidth("100%");

      this.owner.leftToolbar = leftToolbar;

      return leftToolbar;
    }

    /**
     * Getter for centerToolbar called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private FlowPanel centerToolbar;
    private FlowPanel get_centerToolbar() {
      return centerToolbar;
    }
    private FlowPanel build_centerToolbar() {
      // Creation section.
      centerToolbar = new FlowPanel();
      // Setup section.
      centerToolbar.addStyleName("" + get_style().centerToolBar() + "");
      centerToolbar.setWidth("100%");

      this.owner.centerToolbar = centerToolbar;

      return centerToolbar;
    }

    /**
     * Getter for rightToolbar called 3 times. Type: DEFAULT. Build precedence: 3.
     */
    private HorizontalPanel rightToolbar;
    private HorizontalPanel get_rightToolbar() {
      return rightToolbar;
    }
    private HorizontalPanel build_rightToolbar() {
      // Creation section.
      rightToolbar = new HorizontalPanel();
      // Setup section.
      rightToolbar.add(get_rightActionsToolbar());
      rightToolbar.add(get_columnPickerButton());

      this.owner.rightToolbar = rightToolbar;

      return rightToolbar;
    }

    /**
     * Getter for rightActionsToolbar called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private FlowPanel get_rightActionsToolbar() {
      return build_rightActionsToolbar();
    }
    private FlowPanel build_rightActionsToolbar() {
      // Creation section.
      final FlowPanel rightActionsToolbar = new FlowPanel();
      // Setup section.
      rightActionsToolbar.addStyleName("" + get_style().rightToolBar() + "");
      rightActionsToolbar.setWidth("100%");

      this.owner.rightActionsToolbar = rightActionsToolbar;

      return rightActionsToolbar;
    }

    /**
     * Getter for columnPickerButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Button get_columnPickerButton() {
      return build_columnPickerButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_columnPickerButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button columnPickerButton = owner.columnPickerButton;
      assert columnPickerButton != null : "UiField columnPickerButton with 'provided = true' was null";
      // Setup section.

      return columnPickerButton;
    }

    /**
     * Getter for f_SimplePanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private SimplePanel get_f_SimplePanel2() {
      return build_f_SimplePanel2();
    }
    private SimplePanel build_f_SimplePanel2() {
      // Creation section.
      final SimplePanel f_SimplePanel2 = new SimplePanel();
      // Setup section.
      f_SimplePanel2.add(get_dataGrid());

      return f_SimplePanel2;
    }

    /**
     * Getter for dataGrid called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.gwt.DataGrid get_dataGrid() {
      return build_dataGrid();
    }
    private org.gwtbootstrap3.client.ui.gwt.DataGrid build_dataGrid() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.DataGrid dataGrid = owner.dataGrid;
      assert dataGrid != null : "UiField dataGrid with 'provided = true' was null";
      // Setup section.

      return dataGrid;
    }
  }
}
