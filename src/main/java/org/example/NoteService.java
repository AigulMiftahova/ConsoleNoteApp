package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<Note> notes = new ArrayList<>();

    private int nextId = 1;

    //геттер для списка заметок
    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    //Функции для добавления и удаления заметок
    public void addNote(String title, String body) {
        notes.add(new Note(nextId, title, LocalDateTime.now(), body));
        nextId++;
        System.out.println("Заметка добавлена!");
    }
    public void deleteNote(int id) {
        notes.removeIf(note -> note.getId() == id);
        System.out.println("Заметка удалена!");
    }
}
