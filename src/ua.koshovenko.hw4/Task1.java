package ua.koshovenko.hw4;
import java.util.Random;
public class Task1  {
    public static void main (String[] args) {
        int[] sven = new int[400];
        Random rand = new Random();
        for (int i = 0; i < sven.length; i++) {
            sven[i] = rand.nextInt(401);
        }
        double sr =0;
        for (int i = 0; i< sven.length; i++){
            sr += sven[i]/sven.length;
            System.out.println("Середнє"+ (sr));
        }
    }

}