package com.isanak.bladeworks.client.inject;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.isanak.bladeworks.client.framework.AppActivityMapper;
import com.isanak.bladeworks.client.framework.AppPlaceHistoryMapper;
import com.isanak.bladeworks.client.place.TopPlace;

public class MvpModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(Place.class).annotatedWith(Names.named("default")).to(
				TopPlace.class);
		// bind(Place.class).annotatedWith(Names.named("default")).to(
		// BladeCreationPlace.class);
//		bind(Place.class).annotatedWith(Names.named("default")).to(
//				BladeListPlace.class);
	}

	@Provides
	@Singleton
	public EventBus eventBus() {
		return new SimpleEventBus();
	}

	@Provides
	@Singleton
	public PlaceController placeController(EventBus eventBus) {
		return new PlaceController(eventBus);
	}

	@Provides
	@Singleton
	public ActivityMapper activityMapper() {
		return new AppActivityMapper();
	}

	@Provides
	@Singleton
	@Named("contents")
	public SimplePanel contentsPanel() {
		SimplePanel simplePanle = new SimplePanel();
		return simplePanle;
	}

	@Provides
	@Singleton
	public ActivityManager activityManager(ActivityMapper activityMapper,
			EventBus eventBus, @Named("contents") SimplePanel simplePanel) {
		ActivityManager activityManager = new ActivityManager(activityMapper,
				eventBus);
		activityManager.setDisplay(simplePanel);
		return activityManager;
	}

	@Provides
	@Singleton
	public PlaceHistoryHandler placeHistoryHandler(
			AppPlaceHistoryMapper mapper, PlaceController placeController,
			EventBus eventBus, @Named("default") Place defaultPlace, ClientInjector injector) {

		mapper.setFactory(injector);

		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(mapper);

		historyHandler.register(placeController, eventBus, defaultPlace);

		return historyHandler;
	}
}
