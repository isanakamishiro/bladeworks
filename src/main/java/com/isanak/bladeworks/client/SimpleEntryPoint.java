package com.isanak.bladeworks.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.isanak.bladeworks.client.inject.ClientInjector;

public class SimpleEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final ClientInjector injector = GWT.create(ClientInjector.class);
				
		injector.getActivityManager();
		
		RootPanel.get().add(injector.getContentsPanel());
		
		injector.getPlaceHistoryHandler().handleCurrentHistory();
		
	}

}
