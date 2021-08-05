// .ui.xml template last modified: 1628095771370
package org.uberfire.ext.widgets.common.client.common.popups.footers;

import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.event.dom.client.ClickHandler;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;
import org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants_;

public class ModalFooterOKButton_ModalFooterOKButtonBinderImpl implements UiBinder<Widget, ModalFooterOKButton>, ModalFooterOKButton.ModalFooterOKButtonBinder {


  public Widget createAndBindUi(final ModalFooterOKButton owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ModalFooterOKButton owner;


    final ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new ClickHandler() {
      public void onClick(ClickEvent event) {
        owner.onOKButtonClick((ClickEvent) event);
      }
    };

    public Widgets(final ModalFooterOKButton owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ModalFooterOKButton_ModalFooterOKButtonBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ModalFooterOKButton_ModalFooterOKButtonBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ModalFooterOKButton_ModalFooterOKButtonBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new ModalFooterOKButton_ModalFooterOKButtonBinderImpl_GenBundle() {

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants get_i18nCommon() {
      return build_i18nCommon();
    }
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants build_i18nCommon() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants i18nCommon = new CommonConstants_();
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
  }
}
