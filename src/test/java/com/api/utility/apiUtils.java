package com.api.utility;

import org.testng.Assert;

import com.api.model.createPet;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiUtils {

	public static void createPet(createPet createPetBody) {
		RequestSpecification reqSpec=RestAssured.given().contentType(ContentType.JSON).body(createPetBody);
		System.out.println(createPetBody);
		Response response=	reqSpec.when().post(restEndPoints.newPet);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	public static void getPetByStatus(String status) {
		RequestSpecification reqSpec=RestAssured.given().contentType(ContentType.JSON).queryParam("status", status);
		Response response=	reqSpec.when().get(restEndPoints.petByStatus);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	public static void getPetByPetID(String petID) {
		RequestSpecification reqSpec=RestAssured.given().contentType(ContentType.JSON).pathParam("petID", petID);
		System.out.println(restEndPoints.petByID);
		Response response=	reqSpec.when().get(restEndPoints.petByID);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	public static void updatePetDetailsByID(String petID) {
		RequestSpecification reqSpec=RestAssured.given().contentType(ContentType.URLENC).pathParam("petID", petID)
				.formParam("name", "johnny")
				.formParam("status", "pending");
		System.out.println(restEndPoints.petByID);
		Response response=	reqSpec.when().post(restEndPoints.petByID);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	public static void deletePetByID(String petID) {
		RequestSpecification reqSpec=RestAssured.given().contentType(ContentType.JSON).pathParam("petID", petID);
		//		.header("api_key1","nitindeletepet");
		System.out.println(restEndPoints.petByID);
		Response response=	reqSpec.when().delete(restEndPoints.petByID);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
