package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	@Test(description = "Verify if sign-up API is working..!")
	public void createAccountTest() {
		
		//To implement builder Design pattern
		SignupRequest singupRequest =new SignupRequest.Builder()
		.userName("jane_smith")
		.password("mypassword456")
		.email("jane.smith@example.com")
		.firstName("Jane")
		.lastName("Smith")
		.mobileNumber("9876543210")
		.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signup(singupRequest);
		System.out.println(response.asPrettyString());
	}

}
