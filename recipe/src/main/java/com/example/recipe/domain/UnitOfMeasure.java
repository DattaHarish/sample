package com.example.recipe.domain;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure extends BaseEntity{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
