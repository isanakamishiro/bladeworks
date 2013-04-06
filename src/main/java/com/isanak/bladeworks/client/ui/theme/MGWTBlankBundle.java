package com.isanak.bladeworks.client.ui.theme;

import com.googlecode.mgwt.ui.client.theme.base.MGWTClientBundleBaseThemeDesktop;
import com.googlecode.mgwt.ui.client.theme.base.MainCss;

public interface MGWTBlankBundle extends MGWTClientBundleBaseThemeDesktop {

	@Source({ "main.css" })
	MainCss getMainCss();

}
