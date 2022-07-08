// Шиповалов Артемий

package Hw1;

public class Main {
    public static void main(String[] args) {
	    //Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2:
        //S1 = π·(R1)^2, S2 = π·(R2)^2, S3 = S1 − S2
        /*
        int R1 = 5;
        int R2 = 3;
        final double pi = 3.14;
        double S1 = pi*R1*R1, S2 = pi*R2*R2;
        double S3 = S1 - S2;
        System.out.println("Площадь круга 1: " + S1);
        System.out.println("Площадь круга 2: " + S2);
        System.out.println("Площадь кольца: " + S3);
        */

        //Begin16. Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 − x1|
        /*
        int x1 = 3;
        int x2 = 5;
        int dist = Math.abs(x2 - x1);
        System.out.println("Расстояние: " + dist);
        */

        //Begin19. Даны координаты двух противоположных вершин прямоугольника:
        //(x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
        //Найти периметр и площадь данного прямоугольника
        /*
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;

        int a = Math.abs(x2-x1);
        int b = Math.abs(y2-y1);

        int P = (a+b)*2;
        int S = a*b;

        System.out.println("Периметр: " + P);
        System.out.println("Площадь: " + S);
        */

        //Begin20. Найти расстояние между двумя точками с заданными координатами (x1, y1) и (x2, y2) на плоскости.
        //Расстояние вычисляется по формуле sqrt(x2 − x1)^2 + (y2 − y1)^2
        /*
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;

        double dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Расстояние: " + dist);
        */

        //Begin21. Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
        //Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости (см. задание Begin20). Для нахождения
        //площади треугольника со сторонами a, b, c использовать формулу Герона:
        //S = √p·(p − a)·(p − b)·(p − c)
        /*
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;
        int x3 = 5;
        int y3 = 2;

        double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double b = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        double c = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));

        double P = a+b+c;
        double p = P/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Периметр: " + P);
        System.out.println("Площадь: " + S);
        */
    }
}
