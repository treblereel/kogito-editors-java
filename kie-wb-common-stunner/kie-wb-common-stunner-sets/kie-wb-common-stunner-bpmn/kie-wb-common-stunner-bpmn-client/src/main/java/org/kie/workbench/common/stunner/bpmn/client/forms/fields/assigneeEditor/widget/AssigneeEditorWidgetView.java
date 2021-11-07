/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.stunner.bpmn.client.forms.fields.assigneeEditor.widget;

import org.gwtproject.user.client.ui.HasValue;
import org.gwtproject.user.client.ui.IsWidget;

public interface AssigneeEditorWidgetView extends IsWidget {

    interface Presenter extends HasValue<String> {

        String getNameHeader();

        String getAddLabel();

        void doSave();

        void addAssignee();

        boolean isDuplicateName(final String name);
    }

    void init(final Presenter presenter);

    boolean isDuplicateName(final String name);

    void clearList();

    void add(final AssigneeListItem listItem);

    void enableAddButton();

    void disableAddButton();

    void setReadOnly(final boolean readOnly);
}
