package com.myPaths.shared;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PathDTO implements Serializable {
	
	private Long id;
	private String name;
	private String category;
	private Double rating;
	private String owner;
	private String fileUrl;
	private String description;
	private Date createdDate;
	private String pathPlace;
	
	public PathDTO(Long id, String name, String category, Double rating,
			String owner, String fileUrl, String description,
			Date createdDate, String pathPlace) {
		
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
		new PathDTO(new Long(0), "", "", 0.0, "", "", "", new Date(), "");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public Double getRating() {
		return rating;
	}

	public String getOwner() {
		return owner;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getPathPlace() {
		return pathPlace;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setPathPlace(String pathPlace) {
		this.pathPlace = pathPlace;
	}

}
