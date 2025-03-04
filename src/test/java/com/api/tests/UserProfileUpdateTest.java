package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UserProfileUpdateTest {
	
	@Test
	public void updateUserProfileTest() {
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("john_doe", "securepassword123"));
	    LoginResponse loginResponse =	response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("-------------------------------------------------------");
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "john_doe");
		
		System.out.println("----------------------------------------------------------");
		UserProfileRequest userProfileupdate = new UserProfileRequest.Builder()
												.firstName("Test123")
												.lastName("Test123") 
												.email("Test123@gmail.com")
												.mobileNumber("8888888889")
												.build();
		
		response=userProfileManagementService.updateProfile(userProfileupdate, loginResponse.getToken());
		System.out.println(response.asPrettyString());
	}

}
