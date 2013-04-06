package com.isanak.bladeworks.client.ui.theme;

import com.google.gwt.core.shared.GWT;
import com.googlecode.mgwt.ui.client.theme.MGWTClientBundle;
import com.googlecode.mgwt.ui.client.theme.MGWTTheme;

public class MGWTBlankTheme implements MGWTTheme {

	private MGWTClientBundle bundle;
	
	public MGWTBlankTheme() {
		bundle = (MGWTBlankBundle) GWT.create(MGWTBlankBundle.class);
	}
	
	@Override
	public MGWTClientBundle getMGWTClientBundle() {
		return bundle;
	}

}
