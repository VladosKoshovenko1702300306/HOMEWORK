package ua.koshovenko.hw4;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[]agsr){
        int arraySize = 1000;
        int[] randArray=genRandarray(arraySize);
        int firstCount = countFirst(randArray);
        System.out.println("Масив згенерованно: ");
        printArray(randArray);
        System.out.println("Кількість простих в масиві: "+ firstCount);
    }
    private static int[] genRandarray(int size ){
        int[] array = new int[size];
        Random rand = new Random();
        for (int i=0; i< size; i++){
            array[i]=rand.nextInt(1000);
        }
        return array;
    }
    private  static int countFirst(int[] array){
        int count = 0;
        for (int num: array){
            if (isFirst(num)){
                count ++;
            }
        }
        return count;
    }
    private static boolean isFirst (int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++){
            if (num % i==0 ){
                return false;
            }
        }
        return true;
    }
    private static void printArray (int [] array){
        for (int num: array){
            System.out.println(num + " ");
        }
    }
}