package ua.koshovenko.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(400);

        double averageArithmetic = calculateAverageArithmetic(array);
        System.out.println("Середнє арифметичне: " + averageArithmetic);

        double averageGeometric = calculateAverageGeometric(array);
        System.out.println("Середнє геометричне: " + averageGeometric);
    }

    private static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(401);
        }
        return array;
    }

    private static double calculateAverageArithmetic(int[] array) {
        double sum = 0;

        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    private static double calculateAverageGeometric(int[] array) {
        double product = 1;

        for (int value : array) {
            product *= value;
        }

        return geometricMean(product, array.length);
    }

    private static double geometricMean(double product, int length) {
        return Math.pow(product, 1.0 / length);
    }
}