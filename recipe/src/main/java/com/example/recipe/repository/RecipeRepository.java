package com.example.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
