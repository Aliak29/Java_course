package Seminars;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        int value_a = scanner.nextInt();
        System.out.printf("Inputed value: %d\n", value_a);
        scanner.close();

        Написать программу, которая запросит пользователя ввести
        <Имя> в консоли. Получит введенную строку и выведет в консоль
        сообщение “Привет, <Имя>!”
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        }

}}
