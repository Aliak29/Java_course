package Homework.Homework1;

public class Task2 {
    public static void main(String[] args) {
        // Задача 2. Вывести все простые числа от 1 до 1000
        boolean[] primes = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    primes[j] = false;
                }
            }
        }
        System.out.println("Все простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}