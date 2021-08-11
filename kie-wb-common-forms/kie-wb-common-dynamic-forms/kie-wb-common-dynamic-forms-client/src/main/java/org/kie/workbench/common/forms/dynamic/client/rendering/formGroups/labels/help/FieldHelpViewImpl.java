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

package org.kie.workbench.common.forms.dynamic.client.rendering.formGroups.labels.help;

import javax.inject.Inject;

import io.crysknife.client.IsElement;
import io.crysknife.ui.templates.client.annotation.DataField;
import io.crysknife.ui.templates.client.annotation.Templated;
import jsinterop.base.Js;
import org.gwtbootstrap3.client.ui.Anchor;
import org.uberfire.client.views.pfly.widgets.JQueryProducer;
import org.uberfire.client.views.pfly.widgets.Popover;

@Templated
@Deprecated
public class FieldHelpViewImpl implements IsElement,
                                          FieldHelpView {

    private Presenter presenter;

    @Inject
    @DataField
    private Anchor helpMessage;

    @Inject
    private JQueryProducer.JQuery<Popover> jQueryPopover;

    @Override
    public void showHelpMessage(String helpMessage) {
        this.helpMessage.getElement().setAttribute("data-content",
                                      helpMessage);

        jQueryPopover.wrap(Js.uncheckedCast(this.helpMessage.getElement())).popover();
    }

    @Override
    public void init(Presenter presenter) {
        this.presenter = presenter;
    }
}
