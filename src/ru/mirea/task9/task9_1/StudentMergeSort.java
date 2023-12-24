package ru.mirea.task9.task9_1;

import java.util.Arrays;

public class StudentMergeSort {
    public static void mergeSort(Student[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Массив уже отсортирован или пустой
        }

        int middle = arr.length / 2;
        Student[] left = Arrays.copyOfRange(arr, 0, middle);
        Student[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(Student[] result, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Alice"),
                new Student(101, "Bob"),
                new Student(102, "Charlie"),
                new Student(105, "David"),
                new Student(104, "Eva")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        mergeSort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}