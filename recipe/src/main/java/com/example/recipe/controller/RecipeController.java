package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.recipe.command.RecipeCommand;
import com.example.recipe.service.RecipeService;

@Controller
public class RecipeController {
	
	private final RecipeService recipeService;
	
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}
	
	@PostMapping("/recipe")
	public String saveOrUpdate(@ModelAttribute RecipeCommand recipe, Model model) {
		RecipeCommand recipeCommand = recipeService.saveRecipeCommand(recipe);
		model.addAttribute("recipe", recipeCommand);
		return "redirect:/recipe" + recipeCommand.getId() + "/display";
	}
	
	@GetMapping("/recipe/{id}/display")
	public String display(@PathVariable String id, Model model) {
		RecipeCommand recipeCommand = recipeService.findById(id);
		model.addAttribute("recipe", recipeCommand);
		return "/recipe/display";
	}
	
	@GetMapping("/recipe/new")
	public String newRecipe(Model model) {
		RecipeCommand recipeCommand = new RecipeCommand();
		model.addAttribute("recipe", recipeCommand);
		return "recipe/recipeForm";
	}
	
	@GetMapping("/recipe/{id}/update")
	public String update(@PathVariable String id, Model model) {
		RecipeCommand recipeCommand = recipeService.findById(id);
		recipeCommand = recipeService.saveRecipeCommand(recipeCommand);
		model.addAttribute("recipe", recipeCommand);
		return "recipe/display";
	}

}
