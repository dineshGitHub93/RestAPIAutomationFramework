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
		Response response = authService.login(new LoginRequest("Gayathri123", "Gayathri123"));
	    LoginResponse loginResponse =	response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("-------------------------------------------------------");
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "Gayathri123");
		
		System.out.println("----------------------------------------------------------");
		UserProfileRequest userProfileupdate = new UserProfileRequest.Builder()
												.firstName("Gayathri123")
												.lastName("Gayathri123")
												.email("Gayathri123@gmail.com")
												.mobileNumber("8888888889")
												.build();
		
		response=userProfileManagementService.updateProfile(userProfileupdate, loginResponse.getToken());
		System.out.println(response.asPrettyString());
	}

}
