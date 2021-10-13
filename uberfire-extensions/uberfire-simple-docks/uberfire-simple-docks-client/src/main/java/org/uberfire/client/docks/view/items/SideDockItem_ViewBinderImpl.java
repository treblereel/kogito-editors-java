// .ui.xml template last modified: 1633409266063
package org.uberfire.client.docks.view.items;

import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.Element;
import org.gwtproject.safehtml.client.SafeHtmlTemplates;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.uibinder.client.LazyDomElement;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiBinderUtil;
import org.gwtproject.user.client.ui.HTMLPanel;
import org.gwtproject.user.client.ui.Widget;

public class SideDockItem_ViewBinderImpl implements UiBinder<Widget, SideDockItem>, SideDockItem.ViewBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = new SideDockItem_ViewBinderImpl_TemplateImpl();


  public Widget createAndBindUi(final SideDockItem owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final SideDockItem owner;


    public Widgets(final SideDockItem owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private SideDockItem_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private SideDockItem_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final SideDockItem_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new SideDockItem_ViewBinderImpl_GenBundle(){

      };
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final HTMLPanel f_HTMLPanel1 = new HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_itemTooltip(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private String domId0;
    private String get_domId0() {
      return domId0;
    }
    private String build_domId0() {
      // Creation section.
      domId0 = Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for itemTooltip called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_itemTooltip() {
      return build_itemTooltip();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_itemTooltip() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip itemTooltip = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      itemTooltip.add(get_itemButton());

      this.owner.itemTooltip = itemTooltip;

      return itemTooltip;
    }

    /**
     * Getter for itemButton called 1 times. Type: DEFAULT. Build precedence: 3.
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

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private LazyDomElement domId0Element;
    private LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new LazyDomElement<>(get_domId0());
      // Setup section.

      return domId0Element;
    }
  }
}
