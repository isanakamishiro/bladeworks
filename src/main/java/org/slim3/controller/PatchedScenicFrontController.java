package org.slim3.controller;


public class PatchedScenicFrontController extends ScenicFrontController {

    @Override
    protected String getControllerPackageName() {
        return "server.controller";
    }

}
