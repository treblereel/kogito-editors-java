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

package org.kie.workbench.common.stunner.bpmn.client.forms.fields.scriptEditor;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

import org.kie.workbench.common.forms.adf.rendering.FieldRendererTypesProvider;
import org.kie.workbench.common.forms.dynamic.client.rendering.FieldRenderer;
import org.kie.workbench.common.forms.model.FieldDefinition;
import org.kie.workbench.common.forms.model.FieldType;
import org.kie.workbench.common.stunner.bpmn.client.forms.fields.scriptEditor.ScriptTypeFieldRenderer;
import org.kie.workbench.common.stunner.bpmn.client.forms.fields.scriptEditor.ScriptTypeListFieldRenderer;

@Generated("org.kie.workbench.common.forms.adf.processors.FieldRendererProcessor")
@ApplicationScoped
public class ModuleFieldRendererTypesProvider implements FieldRendererTypesProvider<FieldRenderer> {

    private Map<Class<? extends FieldType>, Class<? extends FieldRenderer>> fieldTypeRenderers = new HashMap<>();
    private Map<Class<? extends FieldDefinition>, Class<? extends FieldRenderer>> fieldDefinitionRenderers = new HashMap<>();

    public ModuleFieldRendererTypesProvider() {
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.AssigneeEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.assigneeEditor.AssigneeEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.AssignmentsEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.assignmentsEditor.AssignmentsEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ConditionEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.conditionEditor.ConditionEditorFieldEditorRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.DataObjectTypeFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.artifacts.DataObjectEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.GenericServiceTaskEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.serviceEditor.GenericServiceTaskEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ImportsFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.importsEditor.ImportsFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.MetaDataEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.metaDataEditor.MetaDataEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.MultipleInstanceVariableFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.multipleInstanceVariableEditor.MultipleInstanceVariableFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.NotificationsEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.notificationsEditor.NotificationsEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ReassignmentsEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.reassignmentsEditor.ReassignmentsEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ScriptTypeFieldType.class, ScriptTypeFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ScriptTypeListFieldType.class, ScriptTypeListFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.TimerSettingsFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.timerEditor.TimerSettingsFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.VariablesEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.variablesEditor.VariablesEditorFieldRenderer.class);
        fieldTypeRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.cm.RolesEditorFieldType.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.cm.roles.RolesEditorFieldRenderer.class);
        fieldDefinitionRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ComboBoxFieldDefinition.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.comboBoxEditor.ComboBoxFieldRenderer.class);
        fieldDefinitionRenderers.put(org.kie.workbench.common.stunner.bpmn.forms.model.ConditionalComboBoxFieldDefinition.class, org.kie.workbench.common.stunner.bpmn.client.forms.fields.comboBoxEditor.ConditionalComboBoxFieldRenderer.class);
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
