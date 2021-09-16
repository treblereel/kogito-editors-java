/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.forms.dynamic.client.rendering.renderers.date.input;

import java.util.Date;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLElement;
import io.crysknife.ui.templates.client.annotation.DataField;
import io.crysknife.ui.templates.client.annotation.EventHandler;
import io.crysknife.ui.templates.client.annotation.ForEvent;
import io.crysknife.ui.templates.client.annotation.Templated;
import org.gwtbootstrap3.client.ui.html.Span;
import org.gwtproject.event.logical.shared.ValueChangeHandler;
import org.gwtproject.user.client.Event;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.HasValue;
import org.gwtproject.user.client.ui.RootPanel;
import org.gwtbootstrap3.extras.datepicker.client.ui.DatePicker;
import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;
import org.jboss.errai.common.client.dom.DOMUtil;
import org.kie.workbench.common.forms.dynamic.client.resources.i18n.FormRenderingConstants;
import org.uberfire.client.views.pfly.widgets.JQueryProducer;
import org.uberfire.client.views.pfly.widgets.Popover;

@Templated
@Dependent
public class DatePickerWrapperViewImpl extends Composite implements DatePickerWrapperView {

    private Presenter presenter;
    private DatePicker datePicker;
    private DateTimePicker dateTimePicker;
    private boolean disabledClearButton = false;
    private boolean showtime;

    @Inject
    private JQueryProducer.JQuery<Popover> jQueryPopover;

    //@Inject
    //TranslationService translationService;

    @Inject
    @DataField
    @Named("span")
    private HTMLElement selector;

    @Inject
    @DataField
    private HTMLButtonElement clearBtn;

    @Inject
    @DataField
    private HTMLButtonElement showCalendarBtn;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
        initialiseTooltips();
    }

    @Override
    public void setDatePickerWidget(boolean showTime) {

        this.showtime = showTime;
        DOMUtil.removeAllChildren(selector);
        if (showtime) {
            dateTimePicker = new DateTimePicker();
            dateTimePicker.setAutoClose(true);
            dateTimePicker.setHighlightToday(true);
            dateTimePicker.setShowTodayButton(true);
            dateTimePicker.setReadOnly(true);
            DOMUtil.appendWidgetToElement(selector, dateTimePicker);
        } else {
            datePicker = new DatePicker();
            datePicker.setAutoClose(true);
            datePicker.setHighlightToday(true);
            datePicker.setShowTodayButton(true);
            datePicker.setReadOnly(true);
            datePicker.setContainer(RootPanel.get());
            DOMUtil.appendWidgetToElement(selector, datePicker);
        }
    }

    @Override
    public void setId(String id) {
        if (showtime) {
            dateTimePicker.setId(id);
        } else {
            datePicker.setId(id);
        }
    }

    @Override
    public void setName(String name) {
        if (showtime) {
            dateTimePicker.setName(name);
        } else {
            datePicker.setName(name);
        }
    }

    @Override
    public void setPlaceholder(String placeholder) {
        if (showtime) {
            dateTimePicker.setPlaceholder(placeholder);
        } else {
            datePicker.setPlaceholder(placeholder);
        }
    }

    @Override
    public void setDateValue(Date date) {
        if (showtime) {
            dateTimePicker.setValue(date);
        } else {
            datePicker.setValue(date);
        }
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (showtime) {
            dateTimePicker.setEnabled(enabled);
        } else {
            datePicker.setEnabled(enabled);
        }
    }

    @Override
    public Date getDateValue() {
        if (showtime) {
            return dateTimePicker.getValue();
        } else {
            return datePicker.getValue();
        }
    }

    @Override
    public void addDateValueChangeHandler(ValueChangeHandler<Date> handler) {
        if (showtime) {
            dateTimePicker.addValueChangeHandler(handler);
        } else {
            datePicker.addValueChangeHandler(handler);
        }
    }

    @Override
    public void disableActions() {
        if (showtime) {
            dateTimePicker.hide();
        } else {
            datePicker.hide();
        }
        disabledClearButton = true;
        clearBtn.disabled = (true);
        showCalendarBtn.disabled = (true);
    }

    public void initialiseTooltips() {

        clearBtn.setAttribute("data-content", "clearDateTooltip");
                              //translationService.getTranslation(FormRenderingConstants.DatePickerWrapperViewImplClearDateTooltip));
        showCalendarBtn.setAttribute("data-content", "showDateTooltip");
                                     //translationService.getTranslation(FormRenderingConstants.DatePickerWrapperViewImplShowDateTooltip));
        jQueryPopover.wrap(clearBtn).popover();
        jQueryPopover.wrap(showCalendarBtn).popover();
    }

    @Override
    public HasValue<Date> wrapped() {
        return presenter;
    }

    //@SinkNative(Event.ONCLICK)
    @EventHandler("clearBtn")
    public void onClear(@ForEvent("click") Event event) {
        if (!disabledClearButton) {
            this.presenter.setValue(null, true);
        }
    }

    //@SinkNative(Event.ONCLICK)
    @EventHandler("showCalendarBtn")
    public void onShowCalendar(@ForEvent("click")  Event event) {
        if (!disabledClearButton) {
            if (showtime) {
                dateTimePicker.show();
            } else {
                datePicker.show();
            }
        }
    }
}
