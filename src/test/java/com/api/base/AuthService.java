package com.api.base;

import java.util.HashMap;

import com.api.models.request.ForgotPasswordRequest;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH+"login");
	}
	
	public Response signup(SignupRequest payload) {
		return postRequest(payload, BASE_PATH+"signup");
	}
	
	public Response forget_password(ForgotPasswordRequest payload) {
		return postRequest(payload, BASE_PATH+"forgot-password");
	}
	
	//Pojo class is not required when we have only one parameter of payload to get api
	public Response forget_password(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH+"forgot-password");
	}
}
