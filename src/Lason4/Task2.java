package Lason4;
import java.util.Random;
public class Task2 {
    public static void main (String[] args){
        int Arry = 1000;
        int[] randArry = new int [Arry];
        Random rand = new Random();
        for (int i = 0; i<Arry; i++){
            randArry[i]= rand.nextInt(1000);
        }
        int first = 0;

        for (int num : randArry){
            if (isFirst (num)){
                first ++;
            }
        }
        System.out.println("Масив згенеровано");
        for (int num : randArry){
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("Кількість простих чисел в масиві: "+ first);
    }
    public static boolean isFirst (int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++){
            if (num% i == 0 ){
                return false;
            }
        }
        return true;

    }
}