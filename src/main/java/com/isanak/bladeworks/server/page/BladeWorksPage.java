package com.isanak.bladeworks.server.page;

import java.io.IOException;

import org.slim3.controller.Navigation;

import scenic3.ScenicPage;
import scenic3.annotation.ActionPath;
import scenic3.annotation.GET;
import scenic3.annotation.Page;

@Page("/bladeworks")
public class BladeWorksPage extends ScenicPage {

    @GET
    @ActionPath("test")
    public Navigation getTestResults() throws IOException {
        return response("OK.");
    }


}
