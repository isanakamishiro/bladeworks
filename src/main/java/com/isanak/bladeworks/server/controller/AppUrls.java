package com.isanak.bladeworks.server.controller;

import com.isanak.bladeworks.controller.matcher.BladeWorksPageMatcher;

import scenic3.UrlsImpl;

public class AppUrls extends UrlsImpl {

	public AppUrls() {
		excludes("/css/*");
		add(BladeWorksPageMatcher.get());
	}

}
