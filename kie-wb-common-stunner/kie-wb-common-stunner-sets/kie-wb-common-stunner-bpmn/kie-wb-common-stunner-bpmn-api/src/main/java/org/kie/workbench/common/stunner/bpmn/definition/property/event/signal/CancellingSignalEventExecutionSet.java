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
package org.kie.workbench.common.stunner.bpmn.definition.property.event.signal;

import java.util.Objects;

import javax.validation.Valid;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;
import io.crysknife.ui.databinding.client.api.Bindable;
import org.kie.workbench.common.forms.adf.definitions.annotations.FormDefinition;
import org.kie.workbench.common.forms.adf.definitions.annotations.FormField;
import org.kie.workbench.common.forms.adf.definitions.annotations.field.selector.SelectorDataProvider;
import org.kie.workbench.common.stunner.bpmn.definition.property.event.BaseCancellingEventExecutionSet;
import org.kie.workbench.common.stunner.bpmn.definition.property.event.CancelActivity;
import org.kie.workbench.common.stunner.bpmn.definition.property.general.SLADueDate;
import org.kie.workbench.common.stunner.bpmn.forms.model.ComboBoxFieldType;
import org.kie.workbench.common.stunner.core.definition.annotation.Property;
import org.kie.workbench.common.stunner.core.util.HashUtil;

@Portable
@Bindable
@FormDefinition(startElement = "cancelActivity")
public class CancellingSignalEventExecutionSet extends BaseCancellingEventExecutionSet {

    @Property
    @FormField(afterElement = "cancelActivity",
            type = ComboBoxFieldType.class)
    @SelectorDataProvider(
            type = SelectorDataProvider.ProviderType.CLIENT,
            className = "org.kie.workbench.common.stunner.bpmn.client.dataproviders.ProcessSignalRefProvider"
    )
    @Valid
    private SignalRef signalRef;

    public CancellingSignalEventExecutionSet() {
        this(new CancelActivity(),
             new SLADueDate(),
             new SignalRef());
    }

    public CancellingSignalEventExecutionSet(final @MapsTo("cancelActivity") CancelActivity cancelActivity,
                                             final @MapsTo("slaDueDate") SLADueDate slaDueDate,
                                             final @MapsTo("signalRef") SignalRef signalRef) {
        super(cancelActivity, slaDueDate);
        this.signalRef = signalRef;
    }

    public SignalRef getSignalRef() {
        return signalRef;
    }

    public void setSignalRef(final SignalRef signalRef) {
        this.signalRef = signalRef;
    }

    @Override
    public int hashCode() {
        return HashUtil.combineHashCodes(super.hashCode(),
                                         Objects.hashCode(signalRef));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CancellingSignalEventExecutionSet) {
            CancellingSignalEventExecutionSet other = (CancellingSignalEventExecutionSet) o;
            return super.equals(other) &&
                    Objects.equals(signalRef, other.signalRef);
        }
        return false;
    }
}
