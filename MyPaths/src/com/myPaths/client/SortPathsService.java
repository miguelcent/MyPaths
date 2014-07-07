package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.myPaths.shared.PathSummaryDTO;

@RemoteServiceRelativePath("sortPathsService")
public interface SortPathsService extends RemoteService {
	public ArrayList<PathSummaryDTO> sortPathsByRating(String rating);
	public ArrayList<PathSummaryDTO> sortPathsByCategory(String category);
	public ArrayList<PathSummaryDTO> sortPathsByName(String name);
}
