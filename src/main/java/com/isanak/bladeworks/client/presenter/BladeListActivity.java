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
package com.isanak.bladeworks.client.presenter;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.isanak.bladeworks.client.inject.ClientInjector;
import com.isanak.bladeworks.client.view.BladeListView;

/**
 * Activities are started and stopped by an ActivityManager associated with a
 * container Widget.
 */
public class BladeListActivity extends AbstractActivity implements
		BladeListView.Presenter {

	private final ClientInjector injector;

	@Inject
	public BladeListActivity(ClientInjector injector) {
		this.injector = injector;
	}

	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		BladeListView view = injector.getBladeListView();
		view.setPresenter(this);
		containerWidget.setWidget(view.asWidget());
	}
}
