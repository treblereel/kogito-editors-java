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

package org.kie.workbench.common.stunner.bpmn.client.forms.fields.comboBoxEditor;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import io.crysknife.ui.templates.client.annotation.DataField;
import io.crysknife.ui.templates.client.annotation.Templated;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.ValueListBox;
import org.gwtproject.event.logical.shared.ValueChangeEvent;
import org.gwtproject.event.logical.shared.ValueChangeHandler;
import org.gwtproject.event.shared.HandlerRegistration;
import org.gwtproject.text.shared.Renderer;
import org.gwtproject.user.client.ui.Composite;
import org.kie.workbench.common.stunner.bpmn.client.forms.fields.comboBoxEditor.annotation.FixedValues;
import org.kie.workbench.common.stunner.bpmn.client.forms.util.ListBoxValues;
import org.kie.workbench.common.stunner.bpmn.client.forms.widgets.ComboBox;

/**
 * Combobox with fixed list of values, it doesn't allow custom values to be inserted.
 */
@FixedValues
//@Templated("ComboBoxWidget.html")
@Dependent
public class ComboBoxFixedValuesWidgetViewImpl extends Composite implements ComboBoxFixedValuesWidgetView {

    @Override
    public void setComboBoxValues(ListBoxValues valueListBoxValues) {
        throw new Error(getClass().getCanonicalName()+".setComboBoxValues see ComboBoxWidgetViewImpl");
    }

    @Override
    public void setValue(String value) {
        throw new Error(getClass().getCanonicalName()+".setValue see ComboBoxWidgetViewImpl");

    }

    @Override
    public String getValue() {
        throw new Error(getClass().getCanonicalName()+".getValue see ComboBoxWidgetViewImpl");
    }

    @Override
    public void setReadOnly(boolean readOnly) {

    }
}
