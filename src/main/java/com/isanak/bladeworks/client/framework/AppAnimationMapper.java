package com.isanak.bladeworks.client.framework;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;

public class AppAnimationMapper implements AnimationMapper {


    public Animation getAnimation(Place oldPlace, Place newPlace) {

        return Animation.SLIDE;
    }

}
