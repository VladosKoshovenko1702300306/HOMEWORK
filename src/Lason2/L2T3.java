import java.util.Scanner;
public class L2T3 {
    public static void main(String[] ags) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введіть ціле чсло");
        int a = number.nextInt();
        if (a / 2 == 0) {

            System.out.println("Число парне");
        } else {
            System.out.println("Число не парне");
        }
    }
}