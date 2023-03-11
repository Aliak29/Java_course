
структура простой программы

public class program {
    public static void main(String[] args) {
        System.out.println("buy world!");
        float e = 123.45f;
        double pi = 3.1415;
        char ch = '1';
        int i = 3;
        double x = i;
        boolean f = true ^ false;
        var u = 123;
        System.out.println(u);

        String msg = "Hello world";
        System.out.println(msg);

        System.out.println(ch);
        System.out.println(e);
        System.out.println(pi);
        System.out.println(x);
        System.out.println(f);

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        String s = "qwer";
        s.charAt(1);// обращение к одному символу

        Операции Java
        ● Присваивание: =
        ● Арифметические: *, /, +, -, %, ++, --
        ● Операции сравнения: <, >, ==, !=, >=, <=
        ● Логические операции: ||, &&, ^, !
        ● Побитовые операции <<, >>, &, |, ^

        int a = 123;
        a++;// 124
        System.out.println(a++); // 123
        System.out.println(a);// 124
        System.out.println(++a); // 124

        массивы одномерные
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        System.out.println(arr[3]);

        массивы многомерные
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();

            int[][] arr = new int[3][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();

                Преобразования

                int i = 123;
                double d = i;
                System.out.println(i); // 123
                System.out.println(d); // 123.0
                d = 3.1415;
                i = (int) d;
                System.out.println(d); // 3.1415
                System.out.println(i); // 3
                d = 3.9415;
                i = (int) d;
                System.out.println(d); // 3.9415
                System.out.println(i); // 3
                byte b = Byte.parseByte("123");
                System.out.println(b); // 123
                b = Byte.parseByte("1234");
                System.out.println(b); // NumberFormatException: Value out of range

                Получение данных из терминала

                Некоторые примитивы

import java.util.Scanner;

public class Program {
                public static void main(String[] args) {
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("int a: ");
                int x = iScanner.nextInt();
                System.out.printf("double a: ");
                double y = iScanner.nextDouble();
                System.out.printf("%d + %f = %f", x, y, x + y);
                iScanner.close();
                }}Строки
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }}

    Форматированный вывод

    public class Program {
                public static void main(String[] args) {
                int a = 1, b = 2;
                int c = a + b;
                String res = a + " + " + b + " = " + c;
                System.out.println(res);

                int a = 1, b = 2;
                int c = a + b;
                String res = String.format("%d + %d = %d \n", a, b, c);
                System.out.printf("%d + %d = %d \n", a, b, c);
                System.out.println(res);
                }
                }

}

}}}