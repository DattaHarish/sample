package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.NotesCommand;
import com.example.recipe.domain.Notes;

@Mapper
public interface NotesToNotesCommandMapper {

	NotesCommand notesToNotesCommandMapper(Notes notes);
	
}
