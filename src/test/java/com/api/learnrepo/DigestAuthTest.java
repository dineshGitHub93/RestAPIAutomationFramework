package com.api.learnrepo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class DigestAuthTest {
	
	@Test
	public void testDigestAuth() {
		
		RestAssured.baseURI = "https://postman-echo.com/digest-auth";
		
		given()
			.auth().digest("postman", "password")
		.when()
			.get()
		.then()
			.statusCode(200)
			.log().all();
	}

}
