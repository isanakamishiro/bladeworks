package com.isanak.bladeworks.client.inject;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.AnimatableDisplay;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.mvp.client.history.MGWTPlaceHistoryHandler;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.theme.MGWTTheme;
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

	AnimatableDisplay getMainDisplay();

	AnimatingActivityManager getActivityManager();

	MGWTPlaceHistoryHandler getPlaceHistoryHandler();

	MGWTSettings getMGWTSettings();
	
	MGWTTheme getMGWTTheme();

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
