package Lason3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть слова ");
        String input = scan.nextLine();
        int userCount = countWords(input);
        System.out.println("Кількість слів : " + userCount);
    }

    public static int countWords(String input) {
        String[] words = input.split(" ");
        int userCount = words.length;
        return userCount;
    }
}








