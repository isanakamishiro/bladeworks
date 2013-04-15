package com.github.isanakamishiro.bladeworks.client.inject;

import com.github.isanakamishiro.bladeworks.client.bladecreation.BladeCreationPlace;
import com.github.isanakamishiro.bladeworks.client.bladecreation.BladeCreationView;
import com.github.isanakamishiro.bladeworks.client.bladeinfo.BladeInfoPlace;
import com.github.isanakamishiro.bladeworks.client.bladeinfo.BladeInfoView;
import com.github.isanakamishiro.bladeworks.client.bladelist.BladeListPlace;
import com.github.isanakamishiro.bladeworks.client.bladelist.BladeListView;
import com.github.isanakamishiro.bladeworks.client.top.TopPlace;
import com.github.isanakamishiro.bladeworks.client.top.TopView;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.EventBus;

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

	// Place Injection Method
	TopPlace getTopPlace();

	TopPlace.Tokenizer getTopTokenizer();

	BladeCreationPlace getBladeCreationPlace();

	BladeCreationPlace.Tokenizer getBladeCreationTokenizer();

	BladeInfoPlace getBladeInfoPlace();

	BladeInfoPlace.Tokenizer getBladeInfoTokenizer();

	BladeListPlace getBladeListPlace();

	BladeListPlace.Tokenizer getBladeListTokenizer();
}
