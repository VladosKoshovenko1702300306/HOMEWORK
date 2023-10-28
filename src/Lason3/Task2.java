
package Lason3;
import java.util.Scanner;
public class Task2 {
    public static void main (String [] ags) {
        System.out.println("Введіть фразу");
        Scanner scan = new Scanner(System.in);  String a = scan.nextLine();
        String b =(a.replaceAll("[\\s|\\u00A0]+", ""));
        System.out.println(b);
        System.out.println(isPalindrom (b) ? "Yes" : "No");


    }
private static boolean isPalindrom (String b){
        if(b.length()==1 || b.length()==0)
            return true;

        if (b.charAt(0)==b.charAt(b.length()-1))
            return isPalindrom(b.substring(1, b.length()-1));
return  false;}
}
