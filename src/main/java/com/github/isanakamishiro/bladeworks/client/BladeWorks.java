/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.github.isanakamishiro.bladeworks.client;

import com.github.isanakamishiro.bladeworks.client.inject.ClientInjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link BladeWorks}.
 */
public class BladeWorks extends Composite implements EntryPoint {

	ClientInjector injector;
	
	@UiField(provided = true)
	SimplePanel main;

	interface Binder extends UiBinder<Widget, BladeWorks> {
	}

	private static final Binder binder = GWT.create(Binder.class);

	public BladeWorks() {
	}

	@Override
	public void onModuleLoad() {

		final ClientInjector injector = GWT.create(ClientInjector.class);

		main = injector.getContentsPanel();

		initWidget(binder.createAndBindUi(this));

		injector.getActivityManager();

		RootPanel.get("contents").add(this);

		injector.getPlaceHistoryHandler().handleCurrentHistory();
		
		this.injector = injector;

	}

	@UiHandler("brand")
	public void onBrandClick(ClickEvent event) {
		injector.getPlaceController().goTo(injector.getTopPlace());
	}

}
