package com.myPaths.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderPanel extends Composite {
	
	@UiField
	Anchor addPathLink;
	@UiField
	Anchor profileLink;
	@UiField
	Anchor signOutLink;
	
	private static HeaderPanelUiBinder uiBinder = GWT
			.create(HeaderPanelUiBinder.class);

	interface HeaderPanelUiBinder extends UiBinder<Widget, HeaderPanel> {
	}

	public HeaderPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("addPathLink")
	void onAddPathClicked(ClickEvent event) {
		Window.alert("addPathClicked");
	}
	
	@UiHandler("profileLink")
	void onProfileClicked(ClickEvent event) {
		Window.alert("profileLinkClicked");
	}
	
	@UiHandler("signOutLink")
	void onSignOutClicked(ClickEvent event) {
		Window.alert("signOutClicked");
	}

}
