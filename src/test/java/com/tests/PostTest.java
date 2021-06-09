package com.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostTest {
	
	@Test
	public void test_1() {
				
		JSONObject request = new JSONObject();
		request.put("name", "rita");
		request.put("job", "Teacher");
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
	}

}
