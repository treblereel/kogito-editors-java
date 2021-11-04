/*
* Copyright 2019 Red Hat, Inc. and/or its affiliates.
*  
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*  
*    http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.kie.workbench.common.stunner.forms.client.fields.colorPicker;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

import org.kie.workbench.common.forms.adf.rendering.FieldRendererTypesProvider;
import org.kie.workbench.common.forms.dynamic.client.rendering.FieldRenderer;
import org.kie.workbench.common.forms.model.FieldDefinition;
import org.kie.workbench.common.forms.model.FieldType;
import org.kie.workbench.common.stunner.forms.client.fields.colorPicker.ColorPickerFieldRenderer;

@Generated("org.kie.workbench.common.forms.adf.processors.FieldRendererProcessor")
@ApplicationScoped
public class ModuleFieldRendererTypesProvider implements FieldRendererTypesProvider<FieldRenderer> {

    private Map<Class<? extends FieldType>, Class<? extends FieldRenderer>> fieldTypeRenderers = new HashMap<>();
    private Map<Class<? extends FieldDefinition>, Class<? extends FieldRenderer>> fieldDefinitionRenderers = new HashMap<>();

    public ModuleFieldRendererTypesProvider() {
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.forms.model.ColorPickerFieldType.class, ColorPickerFieldRenderer.class);
    }

    @Override
    public Map<Class<? extends FieldType>, Class<? extends FieldRenderer>> getFieldTypeRenderers() {
        return fieldTypeRenderers;
    }

    @Override
    public Map<Class<? extends FieldDefinition>, Class<? extends FieldRenderer>> getFieldDefinitionRenderers() {
        return fieldDefinitionRenderers;
    }
}
