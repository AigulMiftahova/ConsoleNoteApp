package org.example;

import java.time.LocalDateTime;

public class Note {
    private String title;
    private LocalDateTime date;
    private String description;

    //конструкторы
    Note() {}
    Note(String title, LocalDateTime date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    //геттеры и сеттеры
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return this.date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
