package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.models.request.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { // wrapper for class Assured!!
	//Base URi, Creating the REQUEST, Handling the RESPONSE
	
	private static final String BASE_URI = "http://64.227.160.186:8080/";
	private RequestSpecification requestSpecification;
	
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URI);
	}
	
	protected Response postRequest(LoginRequest payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
