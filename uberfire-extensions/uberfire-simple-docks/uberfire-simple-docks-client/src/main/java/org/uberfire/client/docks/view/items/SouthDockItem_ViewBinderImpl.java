// .ui.xml template last modified: 1633409266063
package org.uberfire.client.docks.view.items;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.Widget;

public class SouthDockItem_ViewBinderImpl implements UiBinder<Widget, SouthDockItem>, SouthDockItem.ViewBinder {


  public Widget createAndBindUi(final SouthDockItem owner) {


    return new Widgets(owner).get_itemButton();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final SouthDockItem owner;


    public Widgets(final SouthDockItem owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private SouthDockItem_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private SouthDockItem_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final SouthDockItem_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new SouthDockItem_ViewBinderImpl_GenBundle() {

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for itemButton called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Button get_itemButton() {
      return build_itemButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_itemButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button itemButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.

      this.owner.itemButton = itemButton;

      return itemButton;
    }
  }
}
