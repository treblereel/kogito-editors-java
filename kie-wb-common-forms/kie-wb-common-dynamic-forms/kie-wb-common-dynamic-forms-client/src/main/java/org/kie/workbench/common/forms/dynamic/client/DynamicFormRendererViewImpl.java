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

package org.kie.workbench.common.forms.dynamic.client;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import io.crysknife.ui.templates.client.annotation.DataField;
import io.crysknife.ui.templates.client.annotation.Templated;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.FlowPanel;
import org.kie.workbench.common.forms.dynamic.client.rendering.FieldLayoutComponent;
import org.kie.workbench.common.forms.dynamic.client.rendering.FormLayoutGenerator;
import org.kie.workbench.common.forms.dynamic.client.rendering.util.FormsElementWrapperWidgetUtil;
import org.kie.workbench.common.forms.dynamic.service.shared.FormRenderingContext;
import org.kie.workbench.common.forms.model.FieldDefinition;

@Dependent
@Templated
public class DynamicFormRendererViewImpl extends Composite implements DynamicFormRenderer.DynamicFormRendererView {

    @Inject
    private FormLayoutGenerator layoutGenerator;

    @Inject
    @DataField
    private FlowPanel formContent;

    @Inject
    private FormsElementWrapperWidgetUtil wrapperWidgetUtil;

    private HTMLElement layoutContent;

    private DynamicFormRenderer presenter;

    @Override
    public void setPresenter(DynamicFormRenderer presenter) {
        DomGlobal.console.log("DO setPresenter " + presenter.getClass().getCanonicalName());

        this.presenter = presenter;
    }

    @Override
    public void render(FormRenderingContext context) {

        DomGlobal.console.log("DO render " + context.getClass().getCanonicalName());


        clear();

        if (context != null) {
            layoutContent = layoutGenerator.buildLayout(context);
            formContent.add(wrapperWidgetUtil.getWidget(this, layoutContent));
        }
    }

    @Override
    public void bind() {

        DomGlobal.console.log("DO bind ");


        for (FieldLayoutComponent fieldComponent : layoutGenerator.getLayoutFields()) {

            DomGlobal.console.log("DO bind.fieldComponent " + fieldComponent.getClass().getCanonicalName());


            presenter.bind(fieldComponent.getFieldRenderer());
        }
    }

    @Override
    public FieldLayoutComponent getFieldLayoutComponentForField(FieldDefinition field) {
        return layoutGenerator.getFieldLayoutComponentForField(field);
    }

    @Override
    public void clear() {
        if (layoutContent != null) {
            wrapperWidgetUtil.clear(this);
            layoutContent = null;
        }
        formContent.clear();
        layoutGenerator.clear();
    }
}
