package com.example.recipe.service;

import com.example.recipe.command.RecipeCommand;

public interface RecipeService {

	RecipeCommand saveRecipeCommand(RecipeCommand recipe);

	RecipeCommand findById(String id);

}
