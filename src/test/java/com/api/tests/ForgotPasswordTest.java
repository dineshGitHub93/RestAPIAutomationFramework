package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.ForgotPasswordRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test
	public void forgotPasswordTest() {
		
		ForgotPasswordRequest fpRequest = new ForgotPasswordRequest("kunja@gmail.com");
		
		AuthService authservice = new AuthService();
		Response response = authservice.forget_password(fpRequest);
		System.out.println(response.asPrettyString());
	}

}
