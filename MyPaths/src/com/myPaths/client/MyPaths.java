package com.myPaths.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;


public class MyPaths implements EntryPoint {
	
	@UiField
	HeaderPanel headerPanel;
	@UiField
	PathsList pathsList;
//	@UiField
//	PathPanel pathPanel;
	
	interface MyPathsUiBinder extends UiBinder<DockLayoutPanel, MyPaths> {
	}
	
	private static MyPathsUiBinder binder = GWT.create(MyPathsUiBinder.class);
	
	RootLayoutPanel root;
	
	private static MyPaths singleton;
	
	public void onModuleLoad() {
		singleton = this;
		DockLayoutPanel outer = binder.createAndBindUi(this);
		
		root = RootLayoutPanel.get();
		root.add(outer);
	}
	
	/**
	   * Gets the singleton application instance.
	   */
	  public static MyPaths get() {
	    return singleton;
	  }

//	public MyPaths() {
//		initWidget(uiBinder.createAndBindUi(this));
//	}

//	@UiField
//	Button button;

//	public MyPaths(String firstName) {
//		initWidget(uiBinder.createAndBindUi(this));
//		button.setText(firstName);
//	}

//	@UiHandler("button")
//	void onClick(ClickEvent e) {
//		Window.alert("Hello!");
//	}

//	public void setText(String text) {
//		button.setText(text);
//	}

//	public String getText() {
//		return button.getText();
//	}

}
