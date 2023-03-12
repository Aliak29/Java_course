package Homework.Homework1;

public class Task1 {
    public static void main(String[] args) {
        // Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
        // (произведение
        // чисел от 1 до n)
        int n = 5;
        int triangleNumber = n * (n + 1) / 2;
        System.out.println("Треугольное число " + n + ": " + triangleNumber);
    }
}
