package com.myPaths.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PathSummaryDTO implements Serializable {
	private String id;
	private String displayName;
	private String rating;
	private String category;
	private String owner;
	
	public PathSummaryDTO(){
		new PathSummaryDTO("0", "", "", "", "");
	}
	
	public PathSummaryDTO(String id, String displayName, String rating, String category, String owner){
		this.id = id;
		this.displayName = displayName;
		this.rating = rating;
		this.category = category;
		this.owner = owner;
	}

	public String getId() {
		return id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getRating() {
		return rating;
	}

	public String getCategory() {
		return category;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
