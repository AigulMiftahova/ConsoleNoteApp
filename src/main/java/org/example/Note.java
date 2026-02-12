package org.example;

import java.time.LocalDateTime;

public class Note {
    private final int id;
    private String title;
    private LocalDateTime date;
    private String description;

    //конструктор
    Note(int id, String title, LocalDateTime date, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;

    }

    //геттеры и сеттеры
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
