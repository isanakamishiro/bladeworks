package com.github.isanakamishiro.bladeworks.server.controller;

import scenic3.UrlsImpl;

import com.github.isanakamishiro.bladeworks.controller.matcher.BladeWorksPageMatcher;

public class AppUrls extends UrlsImpl {

	public AppUrls() {
		excludes("/css/*");
		add(BladeWorksPageMatcher.get());
	}

}
