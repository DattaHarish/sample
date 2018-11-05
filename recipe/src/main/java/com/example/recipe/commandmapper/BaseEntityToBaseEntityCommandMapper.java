package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.recipe.command.BaseEntityCommand;
import com.example.recipe.domain.BaseEntity;

@Mapper
public interface BaseEntityToBaseEntityCommandMapper {
	
	BaseEntityToBaseEntityCommandMapper INSTANCE = Mappers.getMapper(BaseEntityToBaseEntityCommandMapper.class);
	
	BaseEntityCommand baseEntityToBaseEntityCommand(BaseEntity baseEntity);

}
