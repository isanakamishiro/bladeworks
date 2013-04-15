package com.isanak.bladeworks.client.inject;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.isanak.bladeworks.client.bladecreation.BladeCreationView;
import com.isanak.bladeworks.client.bladecreation.BladeCreationViewImpl;
import com.isanak.bladeworks.client.bladeinfo.BladeInfoView;
import com.isanak.bladeworks.client.bladeinfo.BladeInfoViewImpl;
import com.isanak.bladeworks.client.bladelist.BladeListView;
import com.isanak.bladeworks.client.bladelist.BladeListViewImpl;
import com.isanak.bladeworks.client.top.TopView;
import com.isanak.bladeworks.client.top.TopViewImpl;

public class AppModule extends AbstractGinModule {

	@Override
	protected void configure() {
		install(new MvpModule());

		bind(TopView.class).to(TopViewImpl.class).in(Singleton.class);
		bind(BladeCreationView.class).to(BladeCreationViewImpl.class).in(
				Singleton.class);
		bind(BladeInfoView.class).to(BladeInfoViewImpl.class).in(
				Singleton.class);
		bind(BladeListView.class).to(BladeListViewImpl.class).in(
				Singleton.class);

	}

}
