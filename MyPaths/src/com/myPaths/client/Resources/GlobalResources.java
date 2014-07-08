package com.myPaths.client.Resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;


public interface GlobalResources extends ClientBundle {

	public static final GlobalResources RESOURCE =  GWT.create(GlobalResources.class);

	ImageResource editar();
	

	@Source("GlobalStyles.css")
	GlobalStyles globalStyles();


	ImageResource search();

}
