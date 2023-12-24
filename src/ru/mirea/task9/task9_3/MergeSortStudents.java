package ru.mirea.task9.task9_3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() >= list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static List<Student> mergeSortList(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int middle = students.size() / 2;
        List<Student> left = students.subList(0, middle);
        List<Student> right = students.subList(middle, students.size());

        left = mergeSortList(left);
        right = mergeSortList(right);

        return mergeSort(left, right);
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice", 3.9));
        students1.add(new Student("Bob", 3.5));
        students1.add(new Student("David", 3.8));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Charlie", 4.0));
        students2.add(new Student("Eva", 3.7));

        // Объединение двух списков и сортировка с использованием сортировки слиянием
        List<Student> mergedAndSorted = mergeSortList(mergeSort(students1, students2));

        System.out.println("Merged and Sorted List:");
        for (Student student : mergedAndSorted) {
            System.out.println(student);
        }
    }
}