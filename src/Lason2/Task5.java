package Lason2;
import  java.util.Scanner;
public class Task5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scan.nextInt();
        int revers =revers(a);
        System.out.println("Перевернуте чсло:"+ revers);
    }
    public static int revers (int a){
        int revers =0;
        while (a !=0){
            int work = a % 10;
            revers= revers * 10 +work;
            a = a / 10 ;
        }
        return revers;
    }
}
