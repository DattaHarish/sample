package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.BaseEntityCommand;
import com.example.recipe.domain.BaseEntity;

@Mapper
public interface BaseEntityCommandToBaseEntityMapper {

	BaseEntity baseEntityCommandToBaseEntity(BaseEntityCommand baseEntityCommand);
	
}
