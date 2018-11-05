package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.IngredientCommand;
import com.example.recipe.domain.Ingredient;

@Mapper
public interface IngredientCommandToIngredientMapper {

	Ingredient ingredientCommandToIngredient(IngredientCommand ingredientCommand);
	
}
