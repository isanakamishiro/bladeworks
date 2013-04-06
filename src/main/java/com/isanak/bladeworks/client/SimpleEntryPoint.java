package com.isanak.bladeworks.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTStyle;
import com.googlecode.mgwt.ui.client.util.SuperDevModeUtil;
import com.isanak.bladeworks.client.inject.ClientInjector;

public class SimpleEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		SuperDevModeUtil.showDevMode();

		final ClientInjector injector = GWT.create(ClientInjector.class);
		
		MGWTStyle.setTheme(injector.getMGWTTheme());
		MGWT.applySettings(injector.getMGWTSettings());
		
		injector.getActivityManager();
		
		RootPanel.get().add(injector.getMainDisplay());
		
		injector.getPlaceHistoryHandler().handleCurrentHistory();
	}

}
