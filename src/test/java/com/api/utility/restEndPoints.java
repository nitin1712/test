package com.api.utility;

public class restEndPoints {

	public static String base_url="https://petstore.swagger.io/v2";
	public static String newPet=base_url+"/pet";
	public static String newPetImage=base_url+"/pet/{petId}/uploadImage";
	public static String petByStatus=base_url+"/pet/findByStatus";
	public static String petByID=base_url+"/pet/{petID}";
	
	public static String inventory=base_url+"/store/inventory";
	public static String newOrder=base_url+"/store/order";
	public static String purchaseOrder=base_url+"/store/order/{orderId}";
	
	public static String createUser=base_url+"/user/createWithList";
	public static String user=base_url+"/user/{username}";
}
