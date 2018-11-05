package com.example.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
