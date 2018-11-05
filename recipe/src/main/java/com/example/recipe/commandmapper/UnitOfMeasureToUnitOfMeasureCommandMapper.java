package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.UnitOfMeasureCommand;
import com.example.recipe.domain.UnitOfMeasure;

@Mapper
public interface UnitOfMeasureToUnitOfMeasureCommandMapper {

	UnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand(UnitOfMeasure unitOfMeasure);
	
}
