/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.forms.client.widgets;

import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import elemental2.dom.HTMLDivElement;
import io.crysknife.client.IsElement;
import io.crysknife.ui.templates.client.annotation.DataField;
import org.jboss.errai.common.client.dom.DOMUtil;
import io.crysknife.ui.templates.client.annotation.Templated;

@Templated
@Dependent
public class FormPropertiesWidgetViewImpl implements FormPropertiesWidgetView,
                                                     IsElement {

    @Inject
    @DataField
    private HTMLDivElement formContent;

    private Presenter presenter;

    @Override
    public void init(Presenter presenter) {
        this.presenter = presenter;
        DOMUtil.removeAllChildren(formContent);
        formContent.appendChild(presenter.getDisplayerElement());
    }

    @PreDestroy
    public void destroy() {
        DOMUtil.removeFromParent(formContent);
        presenter = null;
    }
}
