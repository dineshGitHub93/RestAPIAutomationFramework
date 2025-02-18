package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description = "Verify if Log in API is working..!")
	public void loginTest() {
	//	baseURI = "http://64.227.160.186:8080/";
		
		/* Approach 1
		RestAssured.baseURI = "http://64.227.160.186:8080/";
		RequestSpecification x = RestAssured.given();	
		RequestSpecification y = x.header("Content-Type","application/json");
		RequestSpecification z = y.body("{\"username\": \"string\",\"password\": \"string\"}");
		Response response = z.post("api/auth/login");
		 */
		
		//Approach 2
		Response response =	given()
					.baseUri("http://localhost:3000/")
					.header("Content-Type","application/json")
					.body("{\"email\": \"user@example.com\",\"password\": \"password\"}")
					.post("api/auth/login");
	
		System.out.println(response.asPrettyString());	
		Assert.assertEquals(response.statusCode(), 200);
	}
}
