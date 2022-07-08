package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Boolean1. Дано целое число A. Проверить истинность высказывания: «Число A является положительным»
        /*
        int A = 5;
        boolean res = (A > 0);
        System.out.println(res);
        */

        //Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным»
        /*
        int A = 3;
        boolean res = (A % 2 != 0);
        System.out.println(res);
        */

        //Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A является четным»
        /*
        int A = 3;
        boolean res = (A % 2 == 0);
        System.out.println(res);
        */

        //Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (A > 2 && B <= 3);
        System.out.println(res);
        */

        //Boolean5. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (A >= 0 || B < -2);
        System.out.println(res);
        */

        //Boolean6. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Справедливо двойное неравенство A < B < C»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A < B && B < C);
        System.out.println(res);
        */

        //Boolean7. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Число B находится между числами A и C»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A < B && B < C) || (C < B && B < A);
        System.out.println(res);
        */

        //Boolean8. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Каждое из чисел A и B нечетное»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (A % 2 != 0) && (B % 2 != 0);
        System.out.println(res);
        */

        //Boolean9. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Хотя бы одно из чисел A и B нечетное»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (A % 2 != 0) || (B % 2 != 0);
        System.out.println(res);
        */

        //Boolean10. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Ровно одно из чисел A и B нечетное»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (A % 2 != 0) ^ (B % 2 != 0);
        System.out.println(res);
        */

        //Boolean11. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Числа A и B имеют одинаковую четность»
        /*
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        boolean res = (Math.abs(A % 2) == Math.abs(B % 2));
        System.out.println(res);
        */

        //Boolean12. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Каждое из чисел A, B, C положительное»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A > 0 && B > 0 && C > 0);
        System.out.println(res);
        */

        //Boolean13. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Хотя бы одно из чисел A, B, C положительное»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A > 0 || B > 0 || C > 0);
        System.out.println(res);
        */

        //Boolean14. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Ровно одно из чисел A, B, C положительное»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A > 0 && B <= 0 && C <= 0) || (A <= 0 && B > 0 && C <= 0) || (A <= 0 && B <= 0 && C > 0);
        System.out.println(res);
        */

        //Boolean15. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Ровно два из чисел A, B, C являются положительными»
        /*
        int A, B, C;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        boolean res = (A > 0 && B > 0 && C <= 0) || (A <= 0 && B > 0 && C > 0) || (A > 0 && B <= 0 && C > 0);
        System.out.println(res);
        */

        //Boolean16. Дано целое положительное число. Проверить истинность высказывания:
        //«Данное число является четным двузначным»
        /*
        int A;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();

        boolean res = (A % 2 == 0 && A > 9 && A < 100);
        System.out.println(res);
        */
    }
}
