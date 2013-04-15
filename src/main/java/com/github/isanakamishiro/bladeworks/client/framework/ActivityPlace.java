package com.github.isanakamishiro.bladeworks.client.framework;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.inject.Inject;
import com.google.inject.Provider;

public abstract class ActivityPlace<T extends Activity> extends Place {

	@Inject
	Provider<T> provider;

	private String token = "";

	public ActivityPlace<T> init(String token) {
		this.token = token;
		return this;
	}

	public T getActivity() {
		return provider.get();
	}

	public String getToken() {
		return this.token;
	}

	public abstract static class Tokenizer<E extends ActivityPlace<?>>
			implements PlaceTokenizer<E> {
		@Inject
		Provider<E> provider;

		@Override
		public E getPlace(String token) {
			E place = provider.get();
			place.init(token);
			return place;
		}

		@Override
		public String getToken(E place) {
			return place.getToken();
		}

	}
}
