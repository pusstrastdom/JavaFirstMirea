package ru.mirea.task9.task9_2;

import java.util.Comparator;

public class QuickSort {
    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int partitionIndex = partition(students, low, high, comparator);
            quickSort(students, low, partitionIndex - 1, comparator);
            quickSort(students, partitionIndex + 1, high, comparator);
        }
    }

    public static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.9),
                new Student("Bob", 3.7),
                new Student("Charlie", 4.0),
                new Student("David", 3.8),
                new Student("Eva", 4.0)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending):");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}