package com.myPaths.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PathDTO implements Serializable {
	
	private String id;
	private String name;
	private String category;
	private String rating;
	private String owner;
	private String fileUrl;
	private String description;
	private String createdDate;
	private String pathPlace;
	
	public PathDTO(String id, String name, String category, String rating,
			String owner, String fileUrl, String description,
			String createdDate, String pathPlace) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.rating = rating;
		this.owner = owner;
		this.fileUrl = fileUrl;
		this.setDescription(description);
		this.createdDate = createdDate;
		this.pathPlace = pathPlace;
	}
	
	public PathDTO(){
		new PathDTO("0", "", "", "", "", "", "", "", "");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getRating() {
		return rating;
	}

	public String getOwner() {
		return owner;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getPathPlace() {
		return pathPlace;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setPathPlace(String pathPlace) {
		this.pathPlace = pathPlace;
	}

}
