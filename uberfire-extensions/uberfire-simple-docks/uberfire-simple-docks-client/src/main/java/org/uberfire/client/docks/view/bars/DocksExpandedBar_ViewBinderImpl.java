// .ui.xml template last modified: 1633409266063
package org.uberfire.client.docks.view.bars;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.ScrollPanel;
import org.gwtproject.user.client.ui.Widget;
import org.uberfire.client.resources.WebAppResource_default_InlineClientBundleGenerator;

public class DocksExpandedBar_ViewBinderImpl implements UiBinder<Widget, DocksExpandedBar>, DocksExpandedBar.ViewBinder {


  public Widget createAndBindUi(final DocksExpandedBar owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final DocksExpandedBar owner;


    public Widgets(final DocksExpandedBar owner) {
      this.owner = owner;
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private DocksExpandedBar_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private DocksExpandedBar_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final DocksExpandedBar_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new DocksExpandedBar_ViewBinderImpl_GenBundle(){

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 3 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.client.resources.WebAppResource res;
    private org.uberfire.client.resources.WebAppResource get_res() {
      return res;
    }
    private org.uberfire.client.resources.WebAppResource build_res() {
      // Creation section.
      res = new WebAppResource_default_InlineClientBundleGenerator();
      // Setup section.

      return res;
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
      f_FlowPanel1.add(get_titlePanel());
      f_FlowPanel1.add(get_f_ScrollPanel2());
      f_FlowPanel1.setStyleName("" + get_res().CSS().dockExpanded() + "");

      return f_FlowPanel1;
    }

    /**
     * Getter for titlePanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private FlowPanel get_titlePanel() {
      return build_titlePanel();
    }
    private FlowPanel build_titlePanel() {
      // Creation section.
      final FlowPanel titlePanel = new FlowPanel();
      // Setup section.
      titlePanel.setStyleName("" + get_res().CSS().dockExpandedTitlePanel() + "");

      this.owner.titlePanel = titlePanel;

      return titlePanel;
    }

    /**
     * Getter for f_ScrollPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private ScrollPanel get_f_ScrollPanel2() {
      return build_f_ScrollPanel2();
    }
    private ScrollPanel build_f_ScrollPanel2() {
      // Creation section.
      final ScrollPanel f_ScrollPanel2 = new ScrollPanel();
      // Setup section.
      f_ScrollPanel2.add(get_targetPanel());
      f_ScrollPanel2.setStyleName("" + get_res().CSS().dockExpandedContentPanel() + "");

      return f_ScrollPanel2;
    }

    /**
     * Getter for targetPanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private FlowPanel get_targetPanel() {
      return build_targetPanel();
    }
    private FlowPanel build_targetPanel() {
      // Creation section.
      final FlowPanel targetPanel = new FlowPanel();
      // Setup section.

      this.owner.targetPanel = targetPanel;

      return targetPanel;
    }
  }
}
