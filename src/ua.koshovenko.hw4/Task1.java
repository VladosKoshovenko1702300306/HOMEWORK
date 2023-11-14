package ua.koshovenko.hw4;
import java.util.Random;
public class Task1 {
    public static void main (String [] agsr){
        int[] sven = RandArray(400);
        double SrArm = calculSrArm(sven);
        System.out.println("Середнє арефметичне: "+ SrArm );
        double SrGeo = CalculSrGeo(sven);
        System.out.println("Середнє геометричне: "+ SrGeo);
    }
    private static int [] RandArray(int langh){
        int[] array = new int[langh];
        Random rand = new Random();

        for (int i = 0 ; i< array.length; i++){
            array [i] = rand.nextInt(401);
        }
        return array;
    }
    private static double calculSrArm(int[] array){
        double sum = 0;

        for (int value : array){
            sum+=value;
        }
        return sum/array.length;
    }
    private static double CalculSrGeo(int[] array){
        double pr =1;
        for (int value : array){
            pr *= value;
        }
        return Math.exp(Math.log(pr))/ array.length;
    }
}