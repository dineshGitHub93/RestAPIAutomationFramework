package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AccountService;
import com.api.base.AuthService;
import com.api.models.request.AccountCreationRequest;
import com.api.models.request.LoginRequest;
import com.api.models.response.AccountCreationResponse;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class CreateAccountTypeTest {
	
	
	@Test(description = "To check user is able to create accounts")
	public void crateAccountType() {
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("Gayathri123", "Kunja123"));
		LoginResponse loginResponse= response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("---------------------------------------");
		AccountCreationRequest accountCreationRequest = new AccountCreationRequest.Builder()
														.accountType("SAVINGS")
														.branch("Madurai")
														.build();
		AccountService accountService = new AccountService();
		response = accountService.createAccount(accountCreationRequest, loginResponse.getToken());
		AccountCreationResponse accountCreationResponse = response.as(AccountCreationResponse.class);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(accountCreationResponse.getAccountType(), "SAVINGS");
	}

}
