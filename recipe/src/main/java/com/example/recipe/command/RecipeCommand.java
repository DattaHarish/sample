package com.example.recipe.command;

import java.util.HashSet;
import java.util.Set;

import com.example.recipe.domain.Difficulty;

public class RecipeCommand extends BaseEntityCommand{
	
	private String name;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	private String directions;
	private Byte[] image;
	private Set<IngredientCommand> ingredients = new HashSet<>();
	private Set<CategoryCommand> categories = new HashSet<>();
	private Difficulty difficulty;
	private NotesCommand notes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}
	public Integer getCookTime() {
		return cookTime;
	}
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Set<IngredientCommand> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<IngredientCommand> ingredients) {
		this.ingredients = ingredients;
	}
	public Set<CategoryCommand> getCategories() {
		return categories;
	}
	public void setCategories(Set<CategoryCommand> categories) {
		this.categories = categories;
	}
	public Difficulty getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	public NotesCommand getNotes() {
		return notes;
	}
	public void setNotes(NotesCommand notes) {
		this.notes = notes;
	}

}
