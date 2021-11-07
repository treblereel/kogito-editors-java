// .ui.xml template last modified: 1633409266063
package org.uberfire.client.docks.view.bars;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

public class DocksCollapsedBar_ViewBinderImpl implements UiBinder<Widget, DocksCollapsedBar>, DocksCollapsedBar.ViewBinder {


  public Widget createAndBindUi(final DocksCollapsedBar owner) {


    return new Widgets(owner).get_docksBarPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final DocksCollapsedBar owner;


    public Widgets(final DocksCollapsedBar owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private DocksCollapsedBar_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private DocksCollapsedBar_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final DocksCollapsedBar_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new DocksCollapsedBar_ViewBinderImpl_GenBundle() {};
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for docksBarPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private FlowPanel get_docksBarPanel() {
      return build_docksBarPanel();
    }
    private FlowPanel build_docksBarPanel() {
      // Creation section.
      final FlowPanel docksBarPanel = new FlowPanel();
      // Setup section.

      this.owner.docksBarPanel = docksBarPanel;

      return docksBarPanel;
    }
  }
}
