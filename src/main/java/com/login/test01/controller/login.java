package com.login.test01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
	
	@GetMapping("/login")
	public ResponseEntity<HttpStatus> checklogin(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		System.out.println("username"+username);
		System.out.println("password"+password);
		return ResponseEntity.ok(HttpStatus.OK);
	}

}
