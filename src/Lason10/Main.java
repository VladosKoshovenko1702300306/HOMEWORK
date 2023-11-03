package Lason10;

import java.util.Scanner;

public class Main {
    public static void main (String[] ads){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть радіус кола:");
        double radius = scan.nextDouble();
        circle circle = new circle(radius);

        System.out.println("Введіть скорону квадрата");
        double side = scan.nextDouble();
        sqwear Sqwear =new sqwear (side);

        System.out.println("Введіть сорони трикутника: ");
        double SideA = scan.nextDouble();
        double SideB = scan.nextDouble();
        double SideC = scan.nextDouble();
        tringl Tringl = new tringl(SideA, SideB, SideC);

        System.out.println("Радіус кола" + circle.area());
        System.out.println("Периметер кола:" + circle.perimeter());

        System.out.println("Периметер квадрату: " + Sqwear.perimeter());
        System.out.println("Площа квадрату :" + Sqwear.area());

        System.out.println("Периметер трикутника " + Tringl.perimeter() );
        System.out.println("Площа трикутника " + Tringl.area());
        scan.close();






         }
    }
