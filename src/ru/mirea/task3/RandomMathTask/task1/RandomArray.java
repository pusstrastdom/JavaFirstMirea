package ru.mirea.task3.RandomMathTask.task1;


import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int arrayLength = 10;

        double[] randomArray1 = generateArrayUsingMathRandom(arrayLength);
        double[] randomArray2 = generateArrayUsingJavaRandom(arrayLength);

        System.out.println("Исходный массив (Math.random()):");
        printArray(randomArray1);

        System.out.println("\nИсходный массив (java.util.Random):");
        printArray(randomArray2);

        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        System.out.println("\nОтсортированный массив (Math.random()):");
        printArray(randomArray1);

        System.out.println("\nОтсортированный массив (java.util.Random):");
        printArray(randomArray2);
    }

    public static double[] generateArrayUsingMathRandom(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static double[] generateArrayUsingJavaRandom(int length) {
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}