package Lason2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = getInput("Введіть значення x від точки 1", scanner);
        double y1 = getInput("Введіть значення y від точки 1", scanner);
        double x2 = getInput("Введіть значення x від точки 2", scanner);
        double y2 = getInput("Введіть значення y від точки 2", scanner);

        double ab = calculateDistance(x1, y1, x2, y2);

        double x3 = getInput("Введіть значення x від точки 3", scanner);
        double y3 = getInput("Введіть значення y від точки 3", scanner);

        double bc = calculateDistance(x2, y2, x3, y3);
        double ac = calculateDistance(x1, y1, x3, y3);

        double s = calculateTriangleArea(ab, bc, ac);
        System.out.println(s);
    }

    public static double getInput(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double calculateTriangleArea(double ab, double bc, double ac) {
        double p = (ab + ac + bc) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
}
