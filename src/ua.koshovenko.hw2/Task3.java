package ua.koshovenko.hw2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введіть число. ");
        int number = scann.nextInt();
        termNumb(number);
    }

    public static void termNumb(int number) {
        if (isFinish(number)) {
            System.out.println("Число парне.");
        } else {
            System.out.println("Число не парне.");
        }
    }

    public static boolean isFinish(int number) {
        return number % 2 == 0;
    }
}