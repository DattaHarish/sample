package com.example.recipe.commandmapper;

import org.mapstruct.Mapper;

import com.example.recipe.command.NotesCommand;
import com.example.recipe.domain.Notes;

@Mapper
public interface NotesCommandToNotesMapper {

	Notes notesCommandToNotes(NotesCommand notesCommand);
	
}
