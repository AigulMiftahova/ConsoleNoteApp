package org.example;
import java.util.Scanner;

//Класс для взаимодействия с пользователем
public class ConsoleUI {
    Scanner console = new Scanner(System.in);
    NoteService service = new NoteService();

    public void start() {
        System.out.println("Добро пожаловать в ConsoleNoteApp!\nРазработчик: Мифтахова Айгуль Айдаровна");
        while (true) {
            System.out.print("""
                \nСписок команд:
                Создать заметку - add
                Удалить заметку - delete
                Показать все заметки - show
                Выход из программы - exit
                
                Введите команду:  """);
            String command = console.nextLine().trim().toLowerCase();
            switch (command) {
                case "add":
                    readFieldsToAddNote();
                    break;
                case "delete":
                    readIdToDeleteNote();
                    break;
                case "show":
                    for (Note note : service.getAllNotes()) {
                        System.out.println(note + "\n");
                    }
                    break;
                case "exit":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Вы ввели некорректную команду(");
            }
        }
    }

    //Функция для считывания названия и тела заметки и передачи в NoteService
    private void readFieldsToAddNote() {
        System.out.println("Введите название заметки: ");
        String title = console.nextLine();
        System.out.println("Введите заметку: ");
        String body = console.nextLine();
        service.addNote(title, body);
    }
    private void readIdToDeleteNote() {
        System.out.println("Введите id заметки: ");
        int id = Integer.parseInt(console.nextLine());
        service.deleteNote(id);
    }
}
