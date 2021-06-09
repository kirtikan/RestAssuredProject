package com.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteTest {
	
	@Test
	public void test_001() {
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}
	

}
