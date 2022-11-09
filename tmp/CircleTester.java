




package tmp;

import java.util.Random;

class Circle {
    double  radius;

    Circle() {}

    double  getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

public class CircleTester {
    public static void main(String[] args) {
        Random  random  =   new Random();

        Circle circle1  =   new Circle();
        circle1.radius  =   random.nextInt();
        System.out.println("\nCircle1:\nRadius: " + circle1.radius + "\nArea: " + circle1.getArea());

        Circle circle2  =   new Circle();
        circle2.radius  =   random.nextInt();
        System.out.println("\nCircle 2:\nRadius: " + circle2.radius + "\nArea: " + circle2.getArea());

        int[][] array   =   {
            {2, 4, 6, 8, 10, 12},
            {1, 3, 5, 7, 9, 11},
            {33,4,67,8,1},
            {}
        };

        System.out.println(array[3][-1]);
    }
}





