//3. Составить алгоритм: на входе есть числовой массив,
//необходимо вывести элементы массива кратные 3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        getElementsMultipleThree();
    }

    public static void getElementsMultipleThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> resultArr = new ArrayList<>();
        System.out.println("Введите элементы массива через пробел: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 3 == 0) {
                resultArr.add(arr[i]);
            }
        }
        System.out.println("Введенный массив: " + Arrays.toString(arr));
        if (resultArr.isEmpty()) {
            System.out.println("В массиве нет элементов кратных 3");
        } else {
            System.out.println("Элементы массива, кратные 3:");
            for (int elem : resultArr) {
                System.out.println(elem);
            }
        }
    }
}
