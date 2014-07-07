package com.myPaths.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class PathPanel extends Composite {

	private static PathPanelUiBinder uiBinder = GWT
			.create(PathPanelUiBinder.class);

	interface PathPanelUiBinder extends UiBinder<Widget, PathPanel> {
	}

	public PathPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
