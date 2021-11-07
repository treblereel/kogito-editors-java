// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.common.popups.errors;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.HTML;
import org.gwtproject.user.client.ui.ScrollPanel;
import org.gwtproject.user.client.ui.Widget;

public class ErrorPopup_ErrorPopupWidgetBinderImpl implements UiBinder<Widget, ErrorPopup>, ErrorPopup.ErrorPopupWidgetBinder {


  public Widget createAndBindUi(final ErrorPopup owner) {


    return new Widgets(owner).get_f_ScrollPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ErrorPopup owner;


    public Widgets(final ErrorPopup owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ErrorPopup_ErrorPopupWidgetBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ErrorPopup_ErrorPopupWidgetBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ErrorPopup_ErrorPopupWidgetBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new ErrorPopup_ErrorPopupWidgetBinderImpl_GenBundle() {
      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_ScrollPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private ScrollPanel get_f_ScrollPanel1() {
      return build_f_ScrollPanel1();
    }
    private ScrollPanel build_f_ScrollPanel1() {
      // Creation section.
      final ScrollPanel f_ScrollPanel1 = new ScrollPanel();
      // Setup section.
      f_ScrollPanel1.add(get_message());
      f_ScrollPanel1.setWidth("100%");
      f_ScrollPanel1.setHeight("200px");

      return f_ScrollPanel1;
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
