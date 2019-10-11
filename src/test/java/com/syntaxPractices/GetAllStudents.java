package com.syntaxPractices;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllStudents {

	 @Test
		public void test1() {

			RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

			Response resp1 = given().pathParam("studentId", 123).when().get("/api/getStudentProfile/{studentId}");

	
	
	
	
}}
