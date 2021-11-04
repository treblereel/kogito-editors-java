// .ui.xml template last modified: 1635144653282
package org.kie.workbench.common.stunner.client.widgets.explorer.navigator.view;

import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.Element;
import org.gwtproject.safehtml.client.SafeHtmlTemplates;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.uibinder.client.LazyDomElement;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiBinderUtil;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

public class BootstrapNavigatorView_ViewBinderImpl implements UiBinder<Widget, BootstrapNavigatorView>, BootstrapNavigatorView.ViewBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = new BootstrapNavigatorView_ViewBinderImpl_TemplateImpl();


  public Widget createAndBindUi(final BootstrapNavigatorView owner) {


    return new Widgets(owner).get_mainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final BootstrapNavigatorView owner;


    public Widgets(final BootstrapNavigatorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private BootstrapNavigatorView_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private BootstrapNavigatorView_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final BootstrapNavigatorView_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new BootstrapNavigatorView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private BootstrapNavigatorView_ViewBinderImpl_GenCss_style style;
    private BootstrapNavigatorView_ViewBinderImpl_GenCss_style get_style() {
      return style;
    }
    private BootstrapNavigatorView_ViewBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for mainPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.uberfire.client.workbench.widgets.ResizeFlowPanel get_mainPanel() {
      return build_mainPanel();
    }
    private org.uberfire.client.workbench.widgets.ResizeFlowPanel build_mainPanel() {
      // Creation section.
      final org.uberfire.client.workbench.widgets.ResizeFlowPanel mainPanel = new org.uberfire.client.workbench.widgets.ResizeFlowPanel();
      // Setup section.
      mainPanel.add(get_loadingPanel());
      mainPanel.add(get_container());
      mainPanel.addStyleName("" + get_style().panel() + "");

      this.owner.mainPanel = mainPanel;

      return mainPanel;
    }

    /**
     * Getter for loadingPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private FlowPanel get_loadingPanel() {
      return build_loadingPanel();
    }
    private FlowPanel build_loadingPanel() {
      // Creation section.
      final FlowPanel loadingPanel = new FlowPanel();
      // Setup section.
      loadingPanel.add(get_f_Jumbotron1());
      loadingPanel.addStyleName("" + get_style().panel() + "");
      loadingPanel.addStyleName("" + get_style().loadingPanel() + "");

      this.owner.loadingPanel = loadingPanel;

      return loadingPanel;
    }

    /**
     * Getter for f_Jumbotron1 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Jumbotron get_f_Jumbotron1() {
      return build_f_Jumbotron1();
    }
    private org.gwtbootstrap3.client.ui.Jumbotron build_f_Jumbotron1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Jumbotron f_Jumbotron1 = new org.gwtbootstrap3.client.ui.Jumbotron();
      // Setup section.
      f_Jumbotron1.add(get_f_Span2());

      return f_Jumbotron1;
    }

    /**
     * Getter for f_Span2 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span2() {
      return build_f_Span2();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span2 = new org.gwtbootstrap3.client.ui.html.Span(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_Span2.getElement());

        get_domId0Element().get();
        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span2.addAndReplaceElement(get_f_Icon3(), get_domId0Element().get());
      f_Span2.addAndReplaceElement(get_f_Heading4(), get_domId1Element().get());

      return f_Span2;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Icon3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon3() {
      return build_f_Icon3();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon3 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.REFRESH);
      // Setup section.
      f_Icon3.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES5);
      f_Icon3.setSpin(true);
      f_Icon3.setTitle("Loading");

      return f_Icon3;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private LazyDomElement domId0Element;
    private LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private String domId1;
    private String get_domId1() {
      return domId1;
    }
    private String build_domId1() {
      // Creation section.
      domId1 = Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_Heading4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading4() {
      return build_f_Heading4();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading4 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading4.setText("Loading, please wait...");
      f_Heading4.setTitle("Loading");

      return f_Heading4;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private LazyDomElement domId1Element;
    private LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for container called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_container() {
      return build_container();
    }
    private org.gwtbootstrap3.client.ui.Container build_container() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container container = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      container.addStyleName("" + get_style().panel() + "");
      container.setFluid(true);

      this.owner.container = container;

      return container;
    }
  }
}
