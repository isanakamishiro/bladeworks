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
package com.github.isanakamishiro.bladeworks.client.bladecreation;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link BladeCreationView}.
 */
public class BladeCreationViewImpl extends Composite implements
		BladeCreationView {

	interface Binder extends UiBinder<Widget, BladeCreationViewImpl> {
	}

	private static final Binder binder = GWT.create(Binder.class);

	private Presenter listener;

	@UiField
	HasVisibility methods;
	@UiField
	HasVisibility spelling;

	public BladeCreationViewImpl() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter listener) {
		this.listener = listener;
	}

	@UiHandler("startCreationButton")
	public void onStartCreationClick(ClickEvent event) {
		methods.setVisible(false);
		spelling.setVisible(true);

		listener.goToBladeInfo();
		
		methods.setVisible(true);
		spelling.setVisible(false);
		
	}
}
