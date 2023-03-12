package Homework.Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Введите первое число: ");
        num1 = input.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Введите второе число: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Неверный оператор!");
                break;
        }
    }
}
