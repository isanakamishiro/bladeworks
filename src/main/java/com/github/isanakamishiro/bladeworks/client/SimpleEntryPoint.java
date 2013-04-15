package com.github.isanakamishiro.bladeworks.client;

import com.github.isanakamishiro.bladeworks.client.inject.ClientInjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;

public class SimpleEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final ClientInjector injector = GWT.create(ClientInjector.class);
				
		injector.getActivityManager();
		
		RootPanel.get("contents").add(injector.getContentsPanel());
		
		injector.getPlaceHistoryHandler().handleCurrentHistory();
		
	}

}
