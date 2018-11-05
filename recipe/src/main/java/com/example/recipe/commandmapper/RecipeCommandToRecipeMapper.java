package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.RecipeCommand;
import com.example.recipe.domain.Recipe;

@Mapper
public interface RecipeCommandToRecipeMapper {

	Recipe recipeCommandToRecipe(RecipeCommand recipeCommand);
	
}
