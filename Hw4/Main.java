// Шиповалов Артемий

package Hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //If8. Даны два числа.
        //Вывести вначале большее, а затем меньшее из них
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a+" "+b);
        }
        else {
            System.out.println(b+" "+a);
        }
        */

        //If10. Даны две переменные целого типа: A и B.
        //Если их значения не равны, то присвоить каждой переменной сумму этих значений,
        //а если равны, то присвоить переменным нулевые значения.
        //Вывести новые значения переменных A и B
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a != b) {
            int sum = a+b;
            a = sum;
            b = sum;
        }
        else {
            a = 0;
            b = 0;
        }
        System.out.println(a+" "+b);
        */

        //If13. Даны три числа.
        //Найти среднее из них (то есть число, расположенное между наименьшим и наибольшим)
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a < b && b < c) || (c < b && b < a)) System.out.println(b);
        else if ((a < c && c < b) || (b < c && c < a)) System.out.println(c);
        else System.out.println(a);
        */

        //If20. На числовой оси расположены три точки: A, B, C.
        //Определить, какая из двух последних точек (B или C) расположена ближе к A,
        //и вывести эту точку и ее расстояние от точки A
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (Math.abs(a-b)<Math.abs(a-c)) {
            System.out.println(b);
            System.out.println(Math.abs(a-b));
        }
        else {
            System.out.println(c);
            System.out.println(Math.abs(a-c));
        }
        */

        //If21. Даны целочисленные координаты точки на плоскости.
        //Если точка совпадает с началом координат, то вывести 0.
        //Если точка не совпадает с началом координат, но лежит на оси OX или OY, то вывести соответственно 1 или 2.
        //Если точка не лежит на координатных осях, то вывести 3
        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x == 0 && y == 0) System.out.println(0);
        else if (y == 0) System.out.println(1);
        else if (x == 0) System.out.println(2);
        else System.out.println(3);
        */

        //If24. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //f (x) = 2·sin(x), если x > 0,
        //        6 − x, если x ≤ 0
        /*
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();

        if (x > 0) System.out.println(2*Math.sin(x));
        else System.out.println(6-x);
        */

        //If26. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //        −x, если x ≤ 0,
        //f (x) = x^2, если 0 < x < 2,
        //        4, если x ≥ 2
        /*
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();

        if (x <= 0) System.out.println(-x);
        else if (x < 2) System.out.println(x*x);
        else System.out.println(4);
        */
    }
}
