package com.isanak.bladeworks.client.inject;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.isanak.bladeworks.client.view.BladeCreationView;
import com.isanak.bladeworks.client.view.BladeCreationViewImpl;
import com.isanak.bladeworks.client.view.BladeInfoView;
import com.isanak.bladeworks.client.view.BladeInfoViewImpl;
import com.isanak.bladeworks.client.view.BladeList2View;
import com.isanak.bladeworks.client.view.BladeList2ViewImpl;
import com.isanak.bladeworks.client.view.BladeListView;
import com.isanak.bladeworks.client.view.BladeListViewImpl;
import com.isanak.bladeworks.client.view.TopView;
import com.isanak.bladeworks.client.view.TopViewImpl;

public class AppModule extends AbstractGinModule {

	@Override
	protected void configure() {
		install(new MvpModule());
		install(new MGWTModule());

		bind(TopView.class).to(TopViewImpl.class).in(Singleton.class);
		bind(BladeCreationView.class).to(BladeCreationViewImpl.class).in(
				Singleton.class);
		bind(BladeInfoView.class).to(BladeInfoViewImpl.class).in(
				Singleton.class);
		bind(BladeListView.class).to(BladeListViewImpl.class).in(
				Singleton.class);
		bind(BladeList2View.class).to(BladeList2ViewImpl.class).in(
				Singleton.class);

	}

}
