package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest1 {
	
	@Test(description = "Verify if login API is working..!")
	public void loginTest() {
				
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("Gayathri123", "Gayathri123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
	
		
		//Print the values after done the de-serialization
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getUsername());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(), "bac@gmail.com");
		Assert.assertEquals(loginResponse.getUsername(), "string");
		
	}
	

}
