package com.tests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutTest {

	@Test
	public void test_1() {
				
		JSONObject request = new JSONObject();
		request.put("name", "Riya");
		request.put("job", "Teacher");
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
