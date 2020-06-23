package com.ca.business;

public class Flower{
	
	private int id;
	private String image;
	private String flowerName;
	private String description;
	private String season;
	private String habitat;
	private String userNotes;

	public Flower(String image, String flowername2, String description2, String season2, String habitat2) {
		// TODO Auto-generated constructor stub
		setImage(image);
		setFlowerName(flowername2);
		setDescription(description2);
		setSeason(season2);
		setHabitat(habitat2);
	}

	public Flower(String image2, String flowername2) {
		setImage(image2);
		setFlowerName(flowername2);
		// TODO Auto-generated constructor stub
	}

	private void setImage(String image2) {
		this.image = image2;
		
	}
	public String getImage() {
		return image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getUserNotes() {
		return userNotes;
	}

	public void setUserNotes(String userNotes) {
		this.userNotes = userNotes;
	}
}
