package com.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetTest {

	@Test
	public void test_01() {		
		given()
		//.header(header)
		//.param(parameterName, parameterValues)
		.when()
		//.log().all()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7))
		.body("data.first_name", hasItems("Michael","Lindsay"));		
	}
	
	@Test
	public void test_02() {
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200).log().all();
	}
	
	
	
}
