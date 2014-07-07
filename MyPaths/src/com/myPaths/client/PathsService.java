package com.myPaths.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.myPaths.shared.PathDTO;
import com.myPaths.shared.PathSummaryDTO;

@RemoteServiceRelativePath("pathsService")
public interface PathsService extends RemoteService {
	
	ArrayList<PathSummaryDTO> getPathsSummaries();
	
	Boolean deletePath(String id);
	
	PathDTO getPath(String id);
	
	PathDTO editPath(PathDTO path);
	
	Float ratePath(Integer rating);
	
	PathDTO viewPath(PathDTO path);
	
}
