package com.myPaths.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserDTO implements Serializable {
	
	private String username;
	private String password;
	private String email;
	private String name;
	private String surname;
	private String country;
	private String province;
	private String profileImg;
	
	public UserDTO(){
		
	}

	public UserDTO(String username, String password, String email, String name,
			String surname, String country, String province, String profileImg) {
		this();
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.province = province;
		this.profileImg = profileImg;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	
	
	

}
