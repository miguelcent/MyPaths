package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.myPaths.shared.PathSummaryDTO;

public interface SortPathsServiceAsync {
	
	public void sortPathsByRating(String rating, AsyncCallback<ArrayList<PathSummaryDTO>> paths);
	public void sortPathsByCategory(String category, AsyncCallback<ArrayList<PathSummaryDTO>> paths);
	public void sortPathsByName(String name, AsyncCallback<ArrayList<PathSummaryDTO>> paths);

	
	
}
