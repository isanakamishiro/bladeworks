package com.isanak.bladeworks.client.inject;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort.DENSITY;
import com.googlecode.mgwt.ui.client.theme.MGWTTheme;
import com.isanak.bladeworks.client.ui.theme.MGWTBlankTheme;

public class MGWTModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(MGWTTheme.class).to(MGWTBlankTheme.class).in(Singleton.class);
	}

	@Provides
	@Singleton
	public ViewPort viewport() {
        ViewPort viewPort = new MGWTSettings.ViewPort();
        viewPort.setTargetDensity(DENSITY.MEDIUM);
        viewPort
            .setWidthToDeviceWidth()
            .setUserScaleAble(false)
            .setInitialScale(1.0)
            .setMinimumScale(1.0)
            .setMaximumScale(1.0);
        
        return viewPort;
	}

	@Provides
	@Singleton
	public MGWTSettings mgwtSettings(ViewPort viewPort) {
        MGWTSettings settings = new MGWTSettings();
        settings.setViewPort(viewPort);
        settings.setIconUrl("logo.png");
        settings.setAddGlosToIcon(true);
        settings.setFullscreen(true);
        settings.setPreventScrolling(true);

        return settings;
	}
	
}
