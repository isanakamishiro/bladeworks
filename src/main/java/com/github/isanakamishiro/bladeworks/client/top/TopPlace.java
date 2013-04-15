package com.github.isanakamishiro.bladeworks.client.top;

import com.github.isanakamishiro.bladeworks.client.framework.ActivityPlace;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class TopPlace extends ActivityPlace<TopActivity> {
	@Prefix("top")
	public static class Tokenizer extends ActivityPlace.Tokenizer<TopPlace>
			implements PlaceTokenizer<TopPlace> {
	}

}
