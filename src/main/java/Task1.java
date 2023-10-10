//1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String message = "Привет";
        sayHi(message);
    }

    public static void sayHi(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число больше 7: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 7) {
                System.out.println(message);
            } else {
                System.out.println("Введенное Вами число " + num + " не больше 7!");
            }
        } else {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
