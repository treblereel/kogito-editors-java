// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.common.popups;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.HTML;
import org.gwtproject.user.client.ui.ScrollPanel;
import org.gwtproject.user.client.ui.Widget;

public class YesNoCancelPopup_YesNoCancelPopupWidgetBinderImpl implements UiBinder<Widget, YesNoCancelPopup>, YesNoCancelPopup.YesNoCancelPopupWidgetBinder {


  public Widget createAndBindUi(final YesNoCancelPopup owner) {


    return new Widgets(owner).get_scroll();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final YesNoCancelPopup owner;


    public Widgets(final YesNoCancelPopup owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private YesNoCancelPopup_YesNoCancelPopupWidgetBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private YesNoCancelPopup_YesNoCancelPopupWidgetBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final YesNoCancelPopup_YesNoCancelPopupWidgetBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new YesNoCancelPopup_YesNoCancelPopupWidgetBinderImpl_GenBundle() {

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for scroll called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private ScrollPanel get_scroll() {
      return build_scroll();
    }
    private ScrollPanel build_scroll() {
      // Creation section.
      final ScrollPanel scroll = new ScrollPanel();
      // Setup section.
      scroll.add(get_message());
      scroll.setWidth("100%");
      scroll.setHeight("200px");

      this.owner.scroll = scroll;

      return scroll;
    }

    /**
     * Getter for message called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private HTML get_message() {
      return build_message();
    }
    private HTML build_message() {
      // Creation section.
      final HTML message = new HTML();
      // Setup section.

      this.owner.message = message;

      return message;
    }
  }
}
