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

package org.kie.workbench.common.forms.adf.engine.client.formGeneration;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import elemental2.dom.DomGlobal;
import io.crysknife.client.BeanManager;
import io.crysknife.client.SyncBeanDef;
import org.kie.workbench.common.forms.adf.engine.shared.formGeneration.processing.fields.AbstractFieldElementProcessor;
import org.kie.workbench.common.forms.adf.engine.shared.formGeneration.processing.fields.FieldInitializer;
import org.kie.workbench.common.forms.adf.engine.shared.formGeneration.util.PropertyValueExtractor;
import org.kie.workbench.common.forms.service.shared.FieldManager;

@ApplicationScoped
public class ClientFieldElementProcessor extends AbstractFieldElementProcessor {

    @Inject
    BeanManager beanManager;

    @Inject
    public ClientFieldElementProcessor(FieldManager fieldManager,
                                       PropertyValueExtractor propertyValueExtractor) {
        super(fieldManager,
              propertyValueExtractor);
    }

    @PostConstruct
    public void initialize() {
        DomGlobal.console.log("check this " + getClass().getCanonicalName());
        Collection<SyncBeanDef<FieldInitializer>> initializers = beanManager.lookupBeans(FieldInitializer.class);
        initializers.forEach(initializerDef -> registerInitializer(initializerDef.getInstance()));
    }
}
