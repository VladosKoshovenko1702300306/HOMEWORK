package Lason2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] agrs) {
        Scanner point = new Scanner(System.in);
        System.out.println("Ведіть значення х від точки 1");
        double x1 = point.nextDouble();
        System.out.println("Ведіть значення y від точки 1");
        double y1 = point.nextDouble();
        System.out.println("Ведіть значення х від точки 2");
        double x2 = point.nextDouble();
        System.out.println("Ведіть значення y від точки 2");
        double y2 = point.nextDouble();
        double ab = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // сторона 1
        System.out.println("Ведіть значення х від точки 3");
        double x3 = point.nextDouble();
        System.out.println("Ведіть значення y від точки 3");
        double y3 = point.nextDouble();
        double bc = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); //сторона 2
        double ac = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // сторона 3
        double p = (ab + ac + bc) / 2; // пів перемитер
        double s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        System.out.println(s);
    }
}