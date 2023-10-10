import java.util.Scanner;
public class L2T4 {
    public  static void main (String [] ags) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть перше число"); int a = num.nextInt();
        System.out.println("Введіть друге число"); int b = num.nextInt();
        System.out.println("Введіть третє число"); int c = num.nextInt();
        int am= Math.abs(a);
        int bm= Math.abs(b);
        int cm= Math.abs(c);
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