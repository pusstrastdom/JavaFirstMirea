/*

//Task1_3
package ru.mirea.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = sc.nextInt();
        }
        float sum = 0;
        float average = 0;
        if (array.length > 0){
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        }
        average = sum / array.length;
        System.out.printf("%.2f", average);
    }
}


//Task1_4
package ru.mirea.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int [] array = new int [n];
        for (int j = 0; j < array.length; j++){
            System.out.print("Введите элемент массива: ");
            array [j] = sc.nextInt();
        }
        int i = 0;
        int sum = 0;
        while(n > 0) {
           sum += array[i];
           n--;
           i++;
        }
        System.out.printf("Сумма элементов массива: %d\n", sum);
        int max = 0;
        for (int a = 0; a < array.length; a++){
            if(array[a] > max) max = array[a];
        }
        System.out.printf("Максимальный элемент в массиве: %d\n", max);
        int min = max;
        for (int a = 0; a < array.length; a++){
            if(array[a] < min) min = array[a];
        }
        System.out.printf("Минимальный элемент в массиве: %d\n", min);
    }
}


//Task1_5
package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Всего аргументов в командной строке: " +args.length);
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}


//Task1_6
package ru.mirea.task1;
public class Main {
    public static void main(String[] args) {
        for (float i = 1; i < 11; i++) {
            float num = 1/i;
            System.out.printf("%.3f\n", num);
        }
    }
}


//Task1_7
package ru.mirea.task1;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите число для поиска факториала: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

*/