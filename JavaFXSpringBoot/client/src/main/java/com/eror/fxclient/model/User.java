package com.eror.fxclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

	private long id;

	private String username;
	private String firstName;

	private String lastName;

	private LocalDate dob;

	private String gender;

	private Role role;

	private String email;

	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

//	@Override
//	public String toString() {
//		return "User{" +
//				"id=" + id +
//				", firstName='" + firstName + '\'' +
//				", lastName='" + lastName + '\'' +
//				", dob=" + dob +
//				", gender='" + gender + '\'' +
//				", role=" + role.getName().toString() +
//				", email='" + email + '\'' +
//				", password='" + password + '\'' +
//				'}';
//	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
