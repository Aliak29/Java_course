package Homework.Homework1.Homework2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
    // каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                // Записываем текущее состояние массива в лог-файл
                writer.write("Iteration " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    writer.write(arr[k] + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the log file.");
            e.printStackTrace();
        }

        // Выводим отсортированный массив
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
