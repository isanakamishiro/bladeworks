package com.isanak.bladeworks.client.presenter;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.isanak.bladeworks.client.inject.ClientInjector;
import com.isanak.bladeworks.client.view.TopView;

public class TopActivity extends AbstractActivity implements TopView.Presenter {

	private final ClientInjector injector;
	
	@Inject
	public TopActivity(ClientInjector injector) {
		this.injector = injector;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		TopView view = injector.getTopView();
		view.setPresenter(this);
		panel.setWidget(view);
	}

	@Override
	public void goToBladeCreation() {
		injector.getPlaceController().goTo(injector.getBladeCreationPlace().init("creation"));
	}

}
