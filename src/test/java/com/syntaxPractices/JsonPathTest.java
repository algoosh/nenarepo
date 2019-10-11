package com.syntaxPractices;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Retrieve value of specific key from JSON object

public class JsonPathTest {

	 @Test
	public void test1() {

		RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

		Response resp1 = given().pathParam("studentId", 123).when().get("/api/getStudentProfile/{studentId}");

		resp1.prettyPrint();
		resp1.then().assertThat().statusCode(200).and().body("firstName", equalTo("Vladimir"));

		JsonPath jPath = resp1.jsonPath();

		String fistName = jPath.get("firstName");
		System.out.println(fistName);

		String lastName = jPath.get("lastName");
		System.out.println(lastName);
	}

	@Test
	public void getALlStudents() {

		RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

		Response resp = given().when().get("/api/getAllStudentProfiles");

		resp.prettyPrint();

		JsonPath jPath = resp.jsonPath();
		// get value of last name in 3 object
		String name = jPath.get("lastName[2]");
		System.out.println(name);

		List<String> fName = jPath.get("firstName");

		for (String name1 : fName) {
			System.out.println(name1);
		}

	}
	/*
	 * Retreive all students and verify that GET response code is 200 and retrieve
	 * first name of a second student Retrieve all students lastName;
	 */

}