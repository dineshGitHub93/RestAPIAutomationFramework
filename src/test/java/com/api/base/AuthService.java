package com.api.base;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response login(String payload) {
		return postRequest(payload, BASE_PATH+"login");
	}
}
