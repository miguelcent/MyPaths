package com.myPaths.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PathSummaryDTO implements Serializable {
	private Long id;
	private String displayName;
	private Double rating;
	private String category;
	private String owner;
	
	public PathSummaryDTO(){
		new PathSummaryDTO(new Long(0), "", 0.0, "", "");
	}
	
	public PathSummaryDTO(Long id, String displayName, Double rating, String category, String owner){
		this.id = id;
		this.displayName = displayName;
		this.rating = rating;
		this.category = category;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Double getRating() {
		return rating;
	}

	public String getCategory() {
		return category;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setRating(Double rating) {
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
