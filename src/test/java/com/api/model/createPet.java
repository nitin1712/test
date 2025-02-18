package com.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class createPet {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"id",
	"category",
	"name",
	"photoUrls",
	"tags",
	"status"
	})

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("category")
	private category category;
	@JsonProperty("name")
	private String name;
	@JsonProperty("photoUrls")
	private List<String> photoUrls;
	@JsonProperty("tags")
	private List<tag> tags;
	@JsonProperty("status")
	private String status;

	@JsonProperty("id")
	public Integer getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
	this.id = id;
	}

	@JsonProperty("category")
	public category getCategory() {
	return category;
	}

	@JsonProperty("category")
	public void setCategory(category category) {
	this.category = category;
	}

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("photoUrls")
	public List<String> getPhotoUrls() {
	return photoUrls;
	}

	@JsonProperty("photoUrls")
	public void setPhotoUrls(List<String> photoUrls) {
	this.photoUrls = photoUrls;
	}

	@JsonProperty("tags")
	public List<tag> getTags() {
	return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<tag> tags) {
	this.tags = tags;
	}

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}
}
