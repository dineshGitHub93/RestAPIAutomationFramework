package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	@Test(description = "Verify if sign-up API is working..!")
	public void createAccountTest() {
		
		//To implement builder Design pattern
		SignupRequest singupRequest =new SignupRequest.Builder()
		.userName("jane_smit2")
		.password("mypassword4562")
		.email("jane.smith@example2.com")
		.firstName("Jane2")
		.lastName("Smith2")
		.mobileNumber("9876543214")
		.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signup(singupRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
	}

}
