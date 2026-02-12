package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в приложение ConsoleNoteApp!\nРазработчик: Мифтахова Айгуль Айдаровна\n");
        String commandsSet = """
                Создать заметку - add
                Удалить заметку - delete
                Показать все заметки - show
                """;
        System.out.print("Cписок ваших команд:\n" + commandsSet + "\nВведите команду: ");
        Scanner console = new Scanner(System.in);
        String command = console.nextLine();
        System.out.println(command);
    }
}