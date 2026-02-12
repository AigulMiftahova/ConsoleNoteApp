package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private final int id;
    private String title;
    private LocalDateTime date;
    private String body;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "ID: " + id + "\nДата: " + date.format(formatter) + "\nНазвание: " + title + "\nЗаметка: " + body;
    }

    //Конструктор класса Note
    Note(int id, String title, LocalDateTime date, String body) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.body = body;
    }

    //Геттеры и сеттеры
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
    public String getBody() {
        return this.body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
