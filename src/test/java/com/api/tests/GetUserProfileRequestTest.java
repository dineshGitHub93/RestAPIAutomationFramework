package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetUserProfileRequestTest {

	@Test
	public void getProfileInfoTest() {
		
		AuthService auth = new AuthService();
		Response response = auth.login(new LoginRequest("Gayathri123", "Kunja123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		UserProfileManagementService userprofilemanagementservice = new UserProfileManagementService();
		response = userprofilemanagementservice.getProfile(loginResponse.getToken());
		UserProfileResponse userprofile = response.as(UserProfileResponse.class);
		Assert.assertEquals(userprofile.getUsername(), "Gayathri123");
	}
}
