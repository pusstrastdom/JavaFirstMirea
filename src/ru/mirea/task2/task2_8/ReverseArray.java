package ru.mirea.task2.task2_8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
