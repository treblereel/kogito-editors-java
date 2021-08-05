// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.common.popups.footers;

import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.event.dom.client.ClickHandler;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;
import org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants_;

public class ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl implements UiBinder<Widget, ModalFooterOKCancelButtons>, ModalFooterOKCancelButtons.ModalFooterOKCancelButtonsBinder {


  public Widget createAndBindUi(final ModalFooterOKCancelButtons owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ModalFooterOKCancelButtons owner;


    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onOKButtonClick((ClickEvent) event);
      }
    };

    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onCancelButtonClick((ClickEvent) event);
      }
    };

    public Widgets(final ModalFooterOKCancelButtons owner) {
      this.owner = owner;
      build_i18nCommon();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new ModalFooterOKCancelButtons_ModalFooterOKCancelButtonsBinderImpl_GenBundle() {

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants i18nCommon;
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants get_i18nCommon() {
      return i18nCommon;
    }
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants build_i18nCommon() {
      // Creation section.
      i18nCommon = new CommonConstants_();
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
      f_FlowPanel1.add(get_okButton());
      f_FlowPanel1.add(get_cancelButton());

      return f_FlowPanel1;
    }

    /**
     * Getter for okButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_okButton() {
      return build_okButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_okButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button okButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      okButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);
      okButton.setText("" + get_i18nCommon().OK() + "");
      okButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      okButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.okButton = okButton;

      return okButton;
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
      cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
