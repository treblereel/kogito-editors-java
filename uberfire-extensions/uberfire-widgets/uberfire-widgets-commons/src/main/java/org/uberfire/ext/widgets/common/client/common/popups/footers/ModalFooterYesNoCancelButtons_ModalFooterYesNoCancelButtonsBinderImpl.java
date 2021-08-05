// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.common.popups.footers;

import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.event.dom.client.ClickHandler;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

public class ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl implements UiBinder<Widget, ModalFooterYesNoCancelButtons>, ModalFooterYesNoCancelButtons.ModalFooterYesNoCancelButtonsBinder {


  public Widget createAndBindUi(final ModalFooterYesNoCancelButtons owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ModalFooterYesNoCancelButtons owner;


    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onYesButtonClick((ClickEvent) event);
      }
    };

    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onNoButtonClick((ClickEvent) event);
      }
    };

    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onCancelButtonClick((ClickEvent) event);
      }
    };

    public Widgets(final ModalFooterYesNoCancelButtons owner) {
      this.owner = owner;
      build_i18nCommon();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new ModalFooterYesNoCancelButtons_ModalFooterYesNoCancelButtonsBinderImpl_GenBundle(){

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 3 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants i18nCommon;
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants get_i18nCommon() {
      return i18nCommon;
    }
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants build_i18nCommon() {
      // Creation section.
      i18nCommon = new org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants_();
      // Setup section.

      return i18nCommon;
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
      f_FlowPanel1.add(get_yesButton());
      f_FlowPanel1.add(get_noButton());
      f_FlowPanel1.add(get_cancelButton());

      return f_FlowPanel1;
    }

    /**
     * Getter for yesButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_yesButton() {
      return build_yesButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_yesButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button yesButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      yesButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);
      yesButton.setText("" + get_i18nCommon().YES() + "");
      yesButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      yesButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.yesButton = yesButton;

      return yesButton;
    }

    /**
     * Getter for noButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_noButton() {
      return build_noButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_noButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button noButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      noButton.setText("" + get_i18nCommon().NO() + "");
      noButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);
      noButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.noButton = noButton;

      return noButton;
    }

    /**
     * Getter for cancelButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_cancelButton() {
      return build_cancelButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_cancelButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button cancelButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      cancelButton.setText("" + get_i18nCommon().Cancel() + "");
      cancelButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DEFAULT);
      cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
