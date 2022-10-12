package com.auth.dto;

import javax.persistence.*;

public class UserDTO {
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String Password;

	public UserDTO() {
		super();
	}

	public UserDTO(String userName, Long userId, String firstName, String lastName, String email, String password) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.Password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserRegistration [userName=" + userName + ", userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", Password=" + Password + "]";
	}

}
