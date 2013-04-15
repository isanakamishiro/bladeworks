package com.github.isanakamishiro.bladeworks.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface IconResources extends ClientBundle {
	
	@Source("icon/fire32.png")
	ImageResource fire();

	@Source("icon/water32.png")
	ImageResource water();

	@Source("icon/lightning32.png")
	ImageResource lightning();

	@Source("icon/dragon32.png")
	ImageResource dragon();

	@Source("icon/light32.png")
	ImageResource light();

	@Source("icon/dark32.png")
	ImageResource dark();

}
