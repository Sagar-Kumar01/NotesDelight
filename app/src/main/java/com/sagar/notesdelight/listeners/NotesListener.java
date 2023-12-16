package com.sagar.notesdelight.listeners;

import com.sagar.notesdelight.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
