package com.isanak.bladeworks.client.inject;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.googlecode.mgwt.mvp.client.AnimatableDisplay;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.mvp.client.history.HistoryObserver;
import com.googlecode.mgwt.mvp.client.history.MGWTPlaceHistoryHandler;
import com.isanak.bladeworks.client.framework.AppActivityMapper;
import com.isanak.bladeworks.client.framework.AppAnimationMapper;
import com.isanak.bladeworks.client.framework.AppHistoryObserver;
import com.isanak.bladeworks.client.framework.AppPlaceHistoryMapper;
import com.isanak.bladeworks.client.place.BladeListPlace;

public class MvpModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(AnimatableDisplay.class).in(Singleton.class);
		// bind(Place.class).annotatedWith(Names.named("default")).to(
		// TopPlace.class);
		// bind(Place.class).annotatedWith(Names.named("default")).to(
		// BladeCreationPlace.class);
		bind(Place.class).annotatedWith(Names.named("default")).to(
				BladeListPlace.class);
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
	public AnimationMapper animationMapper() {
		return new AppAnimationMapper();
	}

	@Provides
	@Singleton
	public AnimatingActivityManager animatingActivityManager(
			AnimatableDisplay display, ActivityMapper activityMapper,
			AnimationMapper animationMapper, EventBus eventBus) {

		AnimatingActivityManager activityManager = new AnimatingActivityManager(
				activityMapper, animationMapper, eventBus);
		activityManager.setDisplay(display);
		return activityManager;
	}

	@Provides
	@Singleton
	public HistoryObserver historyObserver() {
		return new AppHistoryObserver();
	}

	@Provides
	@Singleton
	public MGWTPlaceHistoryHandler mgwtPlaceHistoryHandler(
			AppPlaceHistoryMapper mapper, HistoryObserver observer,
			PlaceController placeController, EventBus eventBus,
			@Named("default") Place defaultPlace, ClientInjector injector) {

		mapper.setFactory(injector);

		MGWTPlaceHistoryHandler historyHandler = new MGWTPlaceHistoryHandler(
				mapper, observer);

		historyHandler.register(placeController, eventBus, defaultPlace);

		return historyHandler;
	}
}
