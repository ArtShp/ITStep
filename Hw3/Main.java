// Шиповалов Артемий

package Hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Boolean17. Дано целое положительное число. Проверить истинность высказывания:
        //«Данное число является нечетным трехзначным»
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean res = (a % 2 != 0) && (a >= 100) && (a <= 999);
        System.out.println(res);
        */

        //Boolean19. Проверить истинность высказывания:
        //«Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных»
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean res = (-a == b) || (-b == c) || (-a == c);
        System.out.println(res);
        */

        //Boolean21. Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую последовательность»
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean res = ((a/100) < (a/10)%10) && ((a/10)%10 < a%10);
        System.out.println(res);
        */

        //Boolean24. Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант
        //D = B^2 − 4·A·C, проверить истинность высказывания:
        //«Квадратное уравнение A·x^2 + B·x + C = 0 имеет вещественные корни»
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean res = (b*b - 4*a*c > 0);
        System.out.println(res);
        */

        //Boolean25. Даны числа x, y. Проверить истинность высказывания:
        //«Точка с координатами (x, y) лежит во второй координатной четверти»
        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        boolean res = (x < 0 && y > 0);
        System.out.println(res);
        */
    }
}
