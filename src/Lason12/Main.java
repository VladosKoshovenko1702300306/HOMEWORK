package Lason12;
import java.util.Scanner;
public class Main {
    public static void main (String[] agsr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть розмір масиву");
        int size = scan.nextInt();
        int [] array = new int[size];
        System.out.println("Введіть елементи масиву : ");
        for (int i = 0; i< size; i++){
            array[i]= scan.nextInt();
        }
        System.out.println("Ваш масив: ");
        for (int val:array){
            System.out.println(val);
        }

    }
}
