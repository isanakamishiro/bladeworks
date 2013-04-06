package com.isanak.bladeworks.client.inject;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.EventBus;
import com.isanak.bladeworks.client.place.BladeCreationPlace;
import com.isanak.bladeworks.client.place.BladeInfoPlace;
import com.isanak.bladeworks.client.place.BladeListPlace;
import com.isanak.bladeworks.client.place.TopPlace;
import com.isanak.bladeworks.client.view.BladeCreationView;
import com.isanak.bladeworks.client.view.BladeInfoView;
import com.isanak.bladeworks.client.view.BladeList2View;
import com.isanak.bladeworks.client.view.BladeListView;
import com.isanak.bladeworks.client.view.TopView;

@GinModules(AppModule.class)
public interface ClientInjector extends Ginjector {

	EventBus getEventBus();

	PlaceController getPlaceController();

	ActivityManager getActivityManager();
	
	PlaceHistoryHandler getPlaceHistoryHandler();
	
	@Named("contents")
	SimplePanel getContentsPanel();
	
	@Named("default")
	Place getDefaultPlace();

	// View Injection Method

	TopView getTopView();

	BladeCreationView getBladeCreationView();

	BladeInfoView getBladeInfoView();

	BladeListView getBladeListView();

	BladeList2View getBladeList2View();

	// Place Injection Method
	TopPlace getTopPlace();

	BladeCreationPlace getBladeCreationPlace();

	BladeInfoPlace getBladeInfoPlace();

	BladeListPlace getBladeListPlace();
}
