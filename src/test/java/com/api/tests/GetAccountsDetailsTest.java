package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AccountService;
import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.AccountCreationResponse;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class GetAccountsDetailsTest {

	@Test
	public void getAccountsDetailsTest() {
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("Gayathri123", "Kunja123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("------------------------------------------------------");
		AccountService accountService = new AccountService();
		response = accountService.getAccounts(loginResponse.getToken());
		AccountCreationResponse accountCreationResponse = response.as(AccountCreationResponse.class);
		System.out.println(response.asPrettyString());
		
	}
}
