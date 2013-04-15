package com.github.isanakamishiro.bladeworks.client.top;

import com.github.isanakamishiro.bladeworks.client.inject.ClientInjector;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

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
		injector.getPlaceController().goTo(injector.getBladeCreationPlace());
	}

	@Override
	public void goToBladeList() {
		injector.getPlaceController().goTo(injector.getBladeListPlace());		
	}

	@Override
	public void goToAbout() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	

}
