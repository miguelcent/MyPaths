package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.myPaths.shared.PathSummaryDTO;

@RemoteServiceRelativePath("searchPathsService")
public interface SearchPathsService extends RemoteService {
	public ArrayList<PathSummaryDTO> searchPathsBy2Params(String pathsPlace, String category);
	public ArrayList<PathSummaryDTO> searchPathsByPlace(String pathsPlace);
//	public ArrayList<PathSummaryDTO> searchPathsByCategory(String category);
}
