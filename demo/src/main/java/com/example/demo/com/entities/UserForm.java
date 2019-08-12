package com.example.demo.com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserForm {
	
	private String username;
	private String password;
	private String repassword;

}
