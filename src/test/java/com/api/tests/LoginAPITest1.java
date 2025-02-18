package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class LoginAPITest1 {
	
	@Test(description = "Verify if login API is working..!")
	public void loginTest() {
		AuthService authService = new AuthService();
		Response response = authService.login("{\"email\": \"user@example.com\",\"password\": \"password\"}");
		System.out.println(response.asPrettyString());
	}
	

}
