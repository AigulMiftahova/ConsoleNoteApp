package org.example;

import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public void deleteNote(Note note) {
        notes.remove(note);
    }

    public void deleteAllNotes() {
        notes.removeAll(notes);
    }

}
