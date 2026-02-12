package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<Note> notes = new ArrayList<>();

    private int nextId = 1;

    public void addNote(String title, LocalDateTime date, String description) {
        notes.add(new Note(nextId, title, date, description));
        nextId++;
    }

    public void deleteNote(Note note) {
        notes.remove(note);
    }

}
