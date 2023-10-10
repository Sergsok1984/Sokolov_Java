//2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String message = "Привет, Вячеслав";
        sayHiVyacheslav(message);
    }

    public static void sayHiVyacheslav(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println(message);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
