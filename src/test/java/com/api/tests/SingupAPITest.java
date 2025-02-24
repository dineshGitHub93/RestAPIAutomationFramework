package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class SingupAPITest {

	@Test
	public void signupTest() {
		
		SignupRequest signupRequest = new SignupRequest("johnD", "securepasswordD123","johnD.doe@example.com","JohnD","DoeD","9679677698");
		
		AuthService auth = new AuthService();
		Response response = auth.signup(signupRequest);
		System.out.println(response.asPrettyString());
		
	}
}
