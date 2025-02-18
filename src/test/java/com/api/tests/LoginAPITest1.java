package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class LoginAPITest1 {
	
	@Test(description = "Verify if login API is working..!")
	public void loginTest() {
		
		LoginRequest loginRequest = new LoginRequest("string", "string");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		System.out.println(response.asPrettyString());
	}
	

}
