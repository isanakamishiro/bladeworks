package com.github.isanakamishiro.bladeworks.client.inject;

import com.github.isanakamishiro.bladeworks.client.bladecreation.BladeCreationView;
import com.github.isanakamishiro.bladeworks.client.bladecreation.BladeCreationViewImpl;
import com.github.isanakamishiro.bladeworks.client.bladeinfo.BladeInfoView;
import com.github.isanakamishiro.bladeworks.client.bladeinfo.BladeInfoViewImpl;
import com.github.isanakamishiro.bladeworks.client.bladelist.BladeListView;
import com.github.isanakamishiro.bladeworks.client.bladelist.BladeListViewImpl;
import com.github.isanakamishiro.bladeworks.client.top.TopView;
import com.github.isanakamishiro.bladeworks.client.top.TopViewImpl;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

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
