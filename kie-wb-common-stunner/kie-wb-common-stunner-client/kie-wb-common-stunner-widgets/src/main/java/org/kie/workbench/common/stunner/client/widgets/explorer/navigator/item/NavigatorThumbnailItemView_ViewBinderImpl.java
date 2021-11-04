// .ui.xml template last modified: 1635144653282
package org.kie.workbench.common.stunner.client.widgets.explorer.navigator.item;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

public class NavigatorThumbnailItemView_ViewBinderImpl implements UiBinder<Widget, NavigatorThumbnailItemView>, NavigatorThumbnailItemView.ViewBinder {


  public Widget createAndBindUi(final NavigatorThumbnailItemView owner) {


    return new Widgets(owner).get_mainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final NavigatorThumbnailItemView owner;


    public Widgets(final NavigatorThumbnailItemView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private NavigatorThumbnailItemView_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private NavigatorThumbnailItemView_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final NavigatorThumbnailItemView_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new NavigatorThumbnailItemView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private NavigatorThumbnailItemView_ViewBinderImpl_GenCss_style style;
    private NavigatorThumbnailItemView_ViewBinderImpl_GenCss_style get_style() {
      return style;
    }
    private NavigatorThumbnailItemView_ViewBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for mainPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private FlowPanel get_mainPanel() {
      return build_mainPanel();
    }
    private FlowPanel build_mainPanel() {
      // Creation section.
      final FlowPanel mainPanel = new FlowPanel();
      // Setup section.
      mainPanel.add(get_popover());

      this.owner.mainPanel = mainPanel;

      return mainPanel;
    }

    /**
     * Getter for popover called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Popover get_popover() {
      return build_popover();
    }
    private org.gwtbootstrap3.client.ui.Popover build_popover() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover popover = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      popover.add(get_panel());
      popover.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.BOTTOM);

      this.owner.popover = popover;

      return popover;
    }

    /**
     * Getter for panel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_panel() {
      return build_panel();
    }
    private org.gwtbootstrap3.client.ui.Panel build_panel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel panel = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      panel.add(get_body());
      panel.add(get_footer());
      panel.addStyleName("" + get_style().item() + "");

      this.owner.panel = panel;

      return panel;
    }

    /**
     * Getter for body called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_body() {
      return build_body();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_body() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody body = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      body.add(get_item());

      this.owner.body = body;

      return body;
    }

    /**
     * Getter for item called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailLink get_item() {
      return build_item();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailLink build_item() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailLink item = new org.gwtbootstrap3.client.ui.ThumbnailLink();
      // Setup section.
      item.add(get_thumbImage());

      this.owner.item = item;

      return item;
    }

    /**
     * Getter for thumbImage called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Image get_thumbImage() {
      return build_thumbImage();
    }
    private org.gwtbootstrap3.client.ui.Image build_thumbImage() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image thumbImage = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      thumbImage.addStyleName("" + get_style().item() + "");

      this.owner.thumbImage = thumbImage;

      return thumbImage;
    }

    /**
     * Getter for footer called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_footer() {
      return build_footer();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_footer() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter footer = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      footer.add(get_heading());

      this.owner.footer = footer;

      return footer;
    }

    /**
     * Getter for heading called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_heading() {
      return build_heading();
    }
    private org.gwtbootstrap3.client.ui.Heading build_heading() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading heading = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.

      this.owner.heading = heading;

      return heading;
    }
  }
}
