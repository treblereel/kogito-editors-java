/*
 * Copyright (C) 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.jboss.errai.ui.client.widget;

import org.gwtproject.dom.client.Element;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.gwtproject.user.client.ui.Widget;

import java.util.Collection;
import java.util.Iterator;

/**
 * Used to merge a {@link Template} onto a {@link Composite} component.
 *
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class TemplateWidget extends Panel {
  private final Collection<Widget> children;

  public TemplateWidget(final Element root, final Collection<Widget> children) {
    this.setElement(root);
    this.children = children;

    for (Widget child : children) {
      if (!(child instanceof TemplateWidget) && child.getParent() instanceof TemplateWidget) {
        child = child.getParent();
      }
      child.removeFromParent();
      adopt(child);
    }
  }

  @Override
  public void onAttach() {
    super.onAttach();
  }

  @Override
  public Iterator<Widget> iterator() {
    return children.iterator();
  }

  @Override
  public boolean remove(final Widget child) {
    if (child.getParent() != this) {
      return false;
    }
    orphan(child);
    child.getElement().removeFromParent();
    return children.remove(child);
  }

}
