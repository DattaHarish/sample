package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.CategoryCommand;
import com.example.recipe.domain.Category;

@Mapper
public interface CategoryCommandToCategoryMapper {

	Category categoryCommandToCategory(CategoryCommand categoryCommand);
	
}
