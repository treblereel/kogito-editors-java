/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.forms.dynamic.client.rendering;

import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import elemental2.dom.DomGlobal;
import io.crysknife.client.ManagedInstance;
import org.kie.workbench.common.forms.model.FieldDefinition;

@Dependent
public class FieldRendererManagerImpl implements FieldRendererManager {

    private ManagedInstance<FieldRenderer> renderers;

    @Inject
    public FieldRendererManagerImpl(ManagedInstance<FieldRenderer> renderers) {
        this.renderers = renderers;
    }

    @Override
    public FieldRenderer getRendererForField(FieldDefinition fieldDefinition) {
        throw new Error(getClass().getCanonicalName()+".getRendererForField " + fieldDefinition.getClass().getCanonicalName());
/*        Class<? extends FieldRenderer> rendererClass = FieldRendererTypeRegistry.getFieldRenderer(fieldDefinition);

        if (rendererClass != null) {
            return renderers.select(rendererClass).get();
        }
        return null;*/
    }

    @PreDestroy
    public void destroy() {
        renderers.destroyAll();
    }
}
