package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class UserDB {
	
	@Getter static List<User> users;
	
	static {
		users= new ArrayList<>();
		users.add(new User(1,"Filali Firas","1234","firas@gmail.com",LocalDate.of(2002, 12, 12)));
		users.add(new User(2,"Filali Farah","1274","firas@gmail.com",LocalDate.of(2003, 11, 10)));
	}
	
	public static void remove(int id) {
		users.removeIf(user-> user.getId()==id);
	}

}
