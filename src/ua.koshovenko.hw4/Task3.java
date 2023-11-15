package ua.koshovenko.hw4;

import java.util.Random;

public class Task3 {
    public static void main (String[] agsr){
        int arraySize = 2000;
        int[] randomArray = genRandarray(arraySize);
        transformArray(randomArray);
        System.out.println("Масив пімля перетворення: ");
        printArray(randomArray);
    }
    private static int [] genRandarray (int size){
        int [] array= new int[size];
        Random rand = new Random();

        for (int i = 0; i<size; i++){
            array[i] = rand.nextInt(2000);
        }
        return array;
    }
    private static void transformArray (int[] array){
        for(int i = 0; i<array.length; i++ ){
            if (array[i] % 2==0){
                array[i] = 0;
            }
        }
    }
    private static void printArray (int[] array){
        for (int num : array){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}