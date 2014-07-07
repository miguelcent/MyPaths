package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.myPaths.shared.PathDTO;
import com.myPaths.shared.PathSummaryDTO;

public interface PathsServiceAsync {
	public void editPath(PathDTO path, AsyncCallback<PathDTO> callback);
	public void deletePath(String id, AsyncCallback<Boolean> callback);
	public void ratePath(Integer rating, AsyncCallback<Float> callback);
	public void viewPath(PathDTO path, AsyncCallback<PathDTO> callback);
	public void getPathsSummaries(AsyncCallback<ArrayList<PathSummaryDTO>> callback);
	public void getPath(String id, AsyncCallback<PathDTO> callback);
}