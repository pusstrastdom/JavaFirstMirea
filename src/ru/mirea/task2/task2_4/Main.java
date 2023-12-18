package ru.mirea.task2.task2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера");
            System.out.println("4. Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Очистка буфера после ввода числа

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите бренд компьютера: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель компьютера: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите цену компьютера: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Очистка буфера после ввода числа
                    Computer newComputer = new Computer(brand, model, price);
                    shop.addComputer(newComputer);
                    System.out.println("Компьютер добавлен в магазин.");
                }
                case 2 -> {
                    System.out.print("Введите бренд компьютера для удаления: ");
                    String deleteBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера для удаления: ");
                    String deleteModel = scanner.nextLine();
                    Computer computerToRemove = shop.findComputer(deleteBrand, deleteModel);
                    if (computerToRemove != null) {
                        shop.removeComputer(computerToRemove);
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                }
                case 3 -> {
                    System.out.print("Введите бренд компьютера для поиска: ");
                    String searchBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера для поиска: ");
                    String searchModel = scanner.nextLine();
                    Computer foundComputer = shop.findComputer(searchBrand, searchModel);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                }
                case 4 -> {
                    System.out.println("Программа завершена.");
                    System.exit(0);
                }
                default -> System.out.println("Неверный выбор. Пожалуйста, выберите действие от 1 до 4.");
            }
        }
    }
}