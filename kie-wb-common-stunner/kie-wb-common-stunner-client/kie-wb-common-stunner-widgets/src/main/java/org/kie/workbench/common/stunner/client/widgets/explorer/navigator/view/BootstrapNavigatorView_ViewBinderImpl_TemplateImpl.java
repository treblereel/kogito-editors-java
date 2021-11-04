package org.kie.workbench.common.stunner.client.widgets.explorer.navigator.view;

import org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.safehtml.shared.SafeHtmlUtils;

public class BootstrapNavigatorView_ViewBinderImpl_TemplateImpl implements BootstrapNavigatorView_ViewBinderImpl.Template {
  
  public SafeHtml html1(String arg0, String arg1) {
    StringBuilder sb = new StringBuilder();
    sb.append("<span id='");
    sb.append(SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> <span id='");
    sb.append(SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span>");
return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
