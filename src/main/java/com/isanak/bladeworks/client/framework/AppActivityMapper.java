package com.isanak.bladeworks.client.framework;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {

	@Override
	public Activity getActivity(Place place) {
		if (!(place instanceof ActivityPlace<?>)) {
			return null;
		}
		ActivityPlace<?> activityPlace = (ActivityPlace<?>)place;

		return activityPlace.getActivity();
	}

}
