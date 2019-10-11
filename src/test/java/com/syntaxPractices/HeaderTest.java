package com.syntaxPractices;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HeaderTest {
	@Test
		public void test1() {

			RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

			Response resp = given().
					when().
					get("/api/getAllStudentProfiles");

	//resp.then().assertThat().statusCode(200).
			resp.then().assertThat().statusCode(200).
	and().header("Content-Type", equalTo("application/json;charset=UTF-8"));
	
		}
}
