package Lason2;
import java.util.Scanner;
public class Task4 {
    public  static void main (String [] ags) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть перше число"); int a = num.nextInt();
        System.out.println("Введіть друге число"); int b = num.nextInt();
        System.out.println("Введіть третє число"); int c = num.nextInt();
        int am = (a<0) ? -a : a;
        int bm = (b<0) ? -b : b;
        int cm = (c<0) ? -c : c;
        if (am<bm && am<cm) {
            System.out.println("Найменше по модулю число " + a);
        }
        if (bm<am && bm<cm) {
            System.out.println("Найменше по модулю число " + b);
        }
        if (cm<am && cm<am) {
            System.out.println("Найменше по модулю число " + c);
        }
    }
}