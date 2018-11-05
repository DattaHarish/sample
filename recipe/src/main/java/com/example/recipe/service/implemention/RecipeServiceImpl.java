package com.example.recipe.service.implemention;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.recipe.command.RecipeCommand;
import com.example.recipe.commandmapper.RecipeCommandToRecipeMapper;
import com.example.recipe.commandmapper.RecipeToRecipeCommandMapper;
import com.example.recipe.domain.Recipe;
import com.example.recipe.repository.RecipeRepository;
import com.example.recipe.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	private RecipeRepository recipeRepository;
	private RecipeToRecipeCommandMapper recipeToRecipeCommandMapper;
	private RecipeCommandToRecipeMapper recipeCommandToRecipeMapper;

	public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeToRecipeCommandMapper recipeToRecipeCommandMapper, RecipeCommandToRecipeMapper recipeCommandToRecipeMapper) {
		this.recipeRepository = recipeRepository;
		this.recipeToRecipeCommandMapper = recipeToRecipeCommandMapper;
		this.recipeCommandToRecipeMapper = recipeCommandToRecipeMapper;
	}

	@Override
	@Transactional
	public RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand) {
		Recipe recipe = recipeCommandToRecipeMapper.recipeCommandToRecipe(recipeCommand);
		Recipe savedRecipe = recipeRepository.save(recipe);
		recipeCommand = recipeToRecipeCommandMapper.recipeToRecipeCommand(savedRecipe);
		return recipeCommand;
	}

	@Override
	public RecipeCommand findById(String id) {
		Long longId = Long.parseLong(id);
		Optional<Recipe> optionalRecipe = recipeRepository.findById(longId);
		RecipeCommand recipeCommand = null;
		if(optionalRecipe.isPresent()) {
			Recipe recipe = optionalRecipe.get();
			recipeToRecipeCommandMapper.recipeToRecipeCommand(recipe);
		}else {
			throw new RuntimeException("Recipe not found");
		}
		return recipeCommand;
	}

}
