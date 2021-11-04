// .ui.xml template last modified: 1635144653282
package org.kie.workbench.common.stunner.client.widgets.explorer.tree;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

public class TreeExplorerView_ViewBinderImpl implements UiBinder<Widget, TreeExplorerView>, TreeExplorerView.ViewBinder {


  public Widget createAndBindUi(final TreeExplorerView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final TreeExplorerView owner;


    public Widgets(final TreeExplorerView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private TreeExplorerView_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private TreeExplorerView_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final TreeExplorerView_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (TreeExplorerView_ViewBinderImpl_GenBundle) new TreeExplorerView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private TreeExplorerView_ViewBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private TreeExplorerView_ViewBinderImpl_GenCss_style build_style() {
      // Creation section.
      final TreeExplorerView_ViewBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_FlowPanel1.add(get_tree());

      return f_FlowPanel1;
    }

    /**
     * Getter for tree called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.uberfire.ext.widgets.core.client.tree.Tree get_tree() {
      return build_tree();
    }
    private org.uberfire.ext.widgets.core.client.tree.Tree build_tree() {
      // Creation section.
      final org.uberfire.ext.widgets.core.client.tree.Tree tree = (org.uberfire.ext.widgets.core.client.tree.Tree) new org.uberfire.ext.widgets.core.client.tree.Tree();
      // Setup section.

      this.owner.tree = tree;

      return tree;
    }
  }
}
