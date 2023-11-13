package ua.koshovenko.hw4;
import java.util.Random;
public class Task3 {
    public static void main (String[] args){
        int Arry = 2000;
        int[]randomArry= new int[Arry];
        Random rand = new Random();
        for (int i =0; i<Arry; i++){
            randomArry[i] = rand.nextInt(2000);
        }
        for (int i = 0; i<Arry; i++){
            if (randomArry[i] % 2==0){
                randomArry[i] =0;
            }
        }
        System.out.println("Массив піля перетворення: ");
        for (int num : randomArry){
            System.out.println(num+ "");
        }
    }
}
