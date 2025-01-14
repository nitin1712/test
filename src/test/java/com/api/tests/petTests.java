package com.api.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.api.model.category;
import com.api.model.createPet;
import com.api.model.tag;
import com.api.utility.apiUtils;

public class petTests {
	createPet createpet=new createPet();
	@Test
	public void testCreatePet() {
		tag addTagDetails=new tag();
		List<tag> tag =new ArrayList<>();
		category categoryDetails =new category();
		List<String> photoUrls=new ArrayList<String>();
		
		addTagDetails.setId(1);
		addTagDetails.setName("tag1");
		tag.add(addTagDetails);
		
		categoryDetails.setId(1);
		categoryDetails.setName("category1");
		
		photoUrls.add("new photo");
		
		createpet.setCategory(categoryDetails);
		createpet.setId(1);
		createpet.setName("pet1");
		createpet.setPhotoUrls(photoUrls);
		createpet.setStatus("pending");
		createpet.setTags(tag);
		apiUtils.createPet(this.createpet);
	}
	
	@Test
	public void getPetByStatus() {
		apiUtils.getPetByStatus("pending");
	}
	
	
	@Test
	public void getPetByID() {
		apiUtils.getPetByPetID("1");
	}
	
	@Test
	public void updatePetDetailsByID() {
		apiUtils.updatePetDetailsByID("3");
	}
	
	
	@Test
	public void deletePetByID() {
		apiUtils.deletePetByID("1");
	}

}
