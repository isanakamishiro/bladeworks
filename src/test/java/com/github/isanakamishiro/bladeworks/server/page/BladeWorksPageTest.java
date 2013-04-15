package com.github.isanakamishiro.bladeworks.server.page;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import scenic3.ScenicPage;
import scenic3.tester.PageTestCase;

import com.github.isanakamishiro.bladeworks.server.controller.AppUrls;
import com.github.isanakamishiro.bladeworks.server.page.BladeWorksPage;

public class BladeWorksPageTest extends PageTestCase {
    static final String baseUrl = "/bladeworks/";

	public BladeWorksPageTest() {
		super(AppUrls.class, BladeWorksPage.class);
	}

	@Test
	public void 基本テスト() throws Exception {
        tester.request.setMethod("GET");
        tester.start(baseUrl + "test");

        ScenicPage page = tester.getPage();
        assertThat(page, is(instanceOf(BladeWorksPage.class)));
        assertThat(tester.getActionMethodName(), is("getTestResults"));
	}

}
