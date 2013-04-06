package com.isanak.bladeworks.client.view;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link TopView}.
 */
public class TopViewImpl extends Composite implements TopView {

	interface Binder extends UiBinder<Widget, TopViewImpl> {
	}

	private static final Binder binder = GWT.create(Binder.class);

	private Presenter listener;

	@UiField
	Button bladeCreationButton1;
	
	public TopViewImpl() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter listener) {
		this.listener = listener;
	}
	
	@UiHandler({"bladeCreationButton1", "bladeCreationButton2"})
	public void onBladeCreationButtonClick(ClickEvent event) {
		listener.goToBladeCreation();
	}
}
