package Lason3;
import java.util.Scanner;
public class L3T3{
    public static void main (String [] ags) {
        System.out.println("Введіть фразу");
        Scanner scan = new Scanner(System.in);  String a = scan.nextLine();
        int words =0;
        if (a.length() !=0){
            words ++;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)== ' '){
                    words ++ ;

                }
            }

        }
        System.out.println("Ви ввели таку кількість слів"+" "+ (words));






                }
            }