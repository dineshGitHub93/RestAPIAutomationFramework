package com.api.learnrepo;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class BearerAuthTest {

	@Test
	public void testBearerAuth() {
		String token = "Enter your token here";
		RestAssured.baseURI = "https://api.github.com/user/repos";
		
		given()
			.headers("Authorization", "Bearer "+token)
		.when()
			.get()
		.then()
			.statusCode(200)
			.log().all();
	}
}
