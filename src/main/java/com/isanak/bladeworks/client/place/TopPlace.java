package com.isanak.bladeworks.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.isanak.bladeworks.client.framework.ActivityPlace;
import com.isanak.bladeworks.client.presenter.TopActivity;

public class TopPlace extends ActivityPlace<TopActivity> {
	@Prefix("top")
	public static class Tokenizer extends ActivityPlace.Tokenizer<TopPlace>
			implements PlaceTokenizer<TopPlace> {
	}

}
