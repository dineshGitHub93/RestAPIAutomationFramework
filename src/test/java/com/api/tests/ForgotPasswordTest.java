package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.ForgotPasswordRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "Verify if sign-up API is working..!", priority = 1)
	public void forgotPasswordTest() {
		// approch-1 using pojo
		ForgotPasswordRequest fpRequest = new ForgotPasswordRequest("kunja@gmail.com");
		AuthService authservice = new AuthService();
		Response response = authservice.forget_password(fpRequest);
		System.out.println(response.asPrettyString());
		
		
	}
	@Test(description = "Verify if sign-up API is working..!",dependsOnMethods = "ForgotPasswordTest") 
	public void forgotPasswordBuilderTest() {
		// approch-2 using Builder class
		
		ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest.Builder()
		.email("kunja@gmail.com")
		.build(); // Pass payload using builder design pattern
		
		AuthService authservice = new AuthService();
		Response response = authservice.forget_password(forgotPasswordRequest);
		System.out.println(response.asPrettyString());
	
	}

	@Test(description = "Verify if sign-up API is working..!",dependsOnMethods = "forgotPasswordBuilderTest") 
	public void forgotPasswordHashMapTest() {
		// approch-3 Passing payload using Hashmap class
				
		AuthService authservice = new AuthService();
		Response response = authservice.forget_password("Kunja@gmail.com");
		System.out.println(response.asPrettyString());
	
	}
}
