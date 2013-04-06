package com.isanak.bladeworks.client.framework;

import com.google.gwt.place.shared.Place;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.googlecode.mgwt.dom.client.event.mouse.HandlerRegistrationCollection;
import com.googlecode.mgwt.mvp.client.history.HistoryHandler;
import com.googlecode.mgwt.mvp.client.history.HistoryObserver;

public class AppHistoryObserver implements HistoryObserver {


    public void onPlaceChange(Place place, HistoryHandler handler) {

    }

    public void onHistoryChanged(Place place, HistoryHandler handler) {

    }

    public void onAppStarted(Place place, HistoryHandler historyHandler) {

    }

    public HandlerRegistration bind(EventBus eventBus,
            final HistoryHandler historyHandler) {
//        HandlerRegistration register =
//            GoBackEvent.register(eventBus, new GoBackEvent.Handler() {
//
//                public void onGoBack(GoBackEvent event) {
//                    History.back();
//                }
//            });
//
//        HandlerRegistration register2 =
//            GoHomeEvent.register(eventBus, new GoHomeEvent.Handler() {
//
//                public void onGoHome(GoHomeEvent event) {
//                    historyHandler.goTo(new NavigationPlace());
//                }
//            });

        HandlerRegistrationCollection col = new HandlerRegistrationCollection();
		// col.addHandlerRegistration(register);
		// col.addHandlerRegistration(register2);

        return col;
    }

}
