package com.api.base;

import com.api.models.request.AccountCreationRequest;

import io.restassured.response.Response;

public class AccountService extends BaseService{
	
	private static final String BASE_PATH = "/api/accounts";
	
	public Response createAccount(AccountCreationRequest payload, String token ) {
		setAuthToken(token);
		return postRequest(payload, BASE_PATH);
	}

	public Response getAccounts(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH+"/user");
	}
	
	public Response getAccountByID(String token, String AccountNumber ) {
		setAuthToken(token);
		return getRequest(BASE_PATH+"/AccountNumber");
	}
}
