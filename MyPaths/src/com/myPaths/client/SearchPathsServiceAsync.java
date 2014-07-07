package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.myPaths.shared.PathSummaryDTO;

public interface SearchPathsServiceAsync {
	
	public void searchPathsBy2Params(String pathsPlace, String category, AsyncCallback<ArrayList<PathSummaryDTO>> paths);
	public void searchPathsByPlace(String pathsPlace, AsyncCallback<ArrayList<PathSummaryDTO>> paths);
//	public void searchPathsByCategory(String category, AsyncCallback<ArrayList<PathSummaryDTO>> paths);
	
}
