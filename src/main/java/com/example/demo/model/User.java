package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	private String name;
	
	private String password;
	
	private String email;
	
	private LocalDate dateOfBirth;




}
