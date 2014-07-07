package com.myPaths.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;


public class PathsList extends Composite {
	
	@UiField
	HorizontalPanel searchForm;
	@UiField
	HorizontalPanel sortForm;
	@UiField
	FlexTable pathsTable;
	
	private final PathsServiceAsync pathsService = GWT
			.create(PathsService.class);
	
	private final SearchPathsServiceAsync searchPaths = GWT
			.create(SearchPathsService.class);
	
	private static PathsListUiBinder uiBinder = GWT
			.create(PathsListUiBinder.class);

	interface PathsListUiBinder extends UiBinder<Widget, PathsList> {
	}

	public PathsList() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/**
	   * Constructor
	   * 
	   * @param user
	   *            the current logged in user
	   */
	  public PathsList(UserAccountDTO user) {
	    this();
	    getPathsSummaryList();
	  }

}
