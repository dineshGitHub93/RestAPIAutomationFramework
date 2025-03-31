package com.api.learnrepo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthTest {
	
	@Test
	public void testBasicAuth() {
		RestAssured.baseURI = "https://postman-echo.com/basic-auth";
		
		given()
			.auth().preemptive().basic("postman", "password")
		.when()
			.get()
		.then()
			.statusCode(200)
			.log().all();
	}

}
