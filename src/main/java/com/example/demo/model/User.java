package com.example.demo.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private int Id;
	private String name;
	
	private String password;
	
	private String email;
	
	private LocalDate dateOfBirth;
	
	public void setDate(String date) {
		this.dateOfBirth = LocalDate.parse(date);
	}
	
	public String getDate() {
		return this.dateOfBirth.toString();
	}




}
