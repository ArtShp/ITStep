package Hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Series1. Даны 5 вещественных чисел. Найти их сумму
        /*
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += in.nextDouble();
        }
        System.out.println(sum);
        */

        // Series2. Даны 5 вещественных чисел. Найти их произведение
        /*
        Scanner in = new Scanner(System.in);
        double sum = 1;
        for (int i = 0; i < 5; i++) {
            sum *= in.nextDouble();
        }
        System.out.println(sum);
        */

        // Series3. Даны 5 вещественных чисел. Найти их среднее арифметическое
        /*
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += in.nextDouble();
        }
        System.out.println(sum/5);
        */

        // Series4. Дано целое число N и набор из N вещественных чисел.
        // Вывести сумму и произведение чисел из данного набора
        /*
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum = 0;
        double prod = 1;
        for (int i = 0; i < N; i++) {
            double read = in.nextDouble();
            sum += read;
            prod *= read;
        }
        System.out.println(sum);
        System.out.println(prod);
        */

        // Series5. Дано целое число N и набор из N положительных вещественных чисел.
        // Вывести в том же порядке целые части всех чисел из данного
        // набора (как вещественные числа с нулевой дробной частью), а также сумму всех целых частей
        /*
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double read = Math.floor(in.nextDouble());
            sum += read;
            System.out.println(read);
        }
        System.out.println(sum);
        */
    }
}
