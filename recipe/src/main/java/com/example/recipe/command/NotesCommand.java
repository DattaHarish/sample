package com.example.recipe.command;

public class NotesCommand extends BaseEntityCommand{
	
	private String recipeNotes;

	public String getRecipeNotes() {
		return recipeNotes;
	}

	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}

}
