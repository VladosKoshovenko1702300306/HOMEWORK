package ua.koshovenko.hw3;
import java.util.Scanner;
public class Task3 {
    public static void main (String [] agsr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть слова :");
        String in = scan.nextLine();
        int uconst = countWords(in);
        System.out.println("Кількість слів: "+ uconst);
    }
    public static int countWords(String in){
        String[] words =in.split("\\s+");
        int uconst = words.length;
        return uconst;
    }
}