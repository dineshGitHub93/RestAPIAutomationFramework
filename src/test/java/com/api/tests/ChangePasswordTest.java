package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UpdatePasswordRequest;
import com.api.models.request.UserProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class ChangePasswordTest {
	
	@Test
	public void updatePasswordTest() {
		//Login api call
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("Gayathri123", "Gayathri123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		
		System.out.println("--------------------------------------------------");
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getFirstName(), "Gayathri123");
		
		//Change password
		System.out.println("--------------------------------------------------");
		UpdatePasswordRequest updatePasswordRequest = new UpdatePasswordRequest.Builder()
														.currentPassword("Gayathri123")
														.newPassword("Kunja123")
														.confirmPassword("Kunja123")
														.build();
		response = userProfileManagementService.changePassword(updatePasswordRequest, loginResponse.getToken());
		System.out.println(response.asPrettyString());
		
	}

}
