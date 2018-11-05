package com.example.recipe.command;

import java.math.BigDecimal;

public class IngredientCommand extends BaseEntityCommand{
	
	private String name;
	private BigDecimal amount;
	private UnitOfMeasureCommand uom;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public UnitOfMeasureCommand getUom() {
		return uom;
	}
	public void setUom(UnitOfMeasureCommand uom) {
		this.uom = uom;
	}

}
