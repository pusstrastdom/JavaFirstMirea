package ru.mirea.task6.task6_10;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Марка компьютера (ASUS, HP, DELL, ACER, LENOVO): ");
                    ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine());
                    System.out.print("Модель процессора: ");
                    String processorModel = scanner.nextLine();
                    System.out.print("Скорость процессора (GHz): ");
                    int processorSpeed = scanner.nextInt();
                    System.out.print("Объем памяти (GB): ");
                    int memorySizeGB = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера
                    System.out.print("Тип памяти (DDR3, DDR4, etc.): ");
                    String memoryType = scanner.nextLine();
                    System.out.print("Размер монитора (дюймы): ");
                    int monitorSizeInches = scanner.nextInt();

                    Computer computer = new Computer(brand, new Processor(processorModel, processorSpeed), new Memory(memorySizeGB, memoryType), new Monitor("Generic", monitorSizeInches));
                    shop.addComputer(computer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    System.out.println("Список доступных компьютеров:");
                    for (int i = 0; i < shop.computers.size(); i++) {
                        System.out.println((i + 1) + ". " + shop.computers.get(i));
                    }
                    System.out.print("Введите номер компьютера для удаления: ");
                    int computerIndex = scanner.nextInt();
                    if (computerIndex >= 1 && computerIndex <= shop.computers.size()) {
                        shop.removeComputer(shop.computers.get(computerIndex - 1));
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Некорректный номер компьютера.");
                    }
                    break;
                case 3:
                    System.out.print("Марка компьютера (ASUS, HP, DELL, ACER, LENOVO): ");
                    ComputerBrand searchBrand = ComputerBrand.valueOf(scanner.nextLine());
                    System.out.print("Модель процессора: ");
                    String searchProcessorModel = scanner.nextLine();
                    System.out.print("Скорость процессора (GHz): ");
                    int searchProcessorSpeed = scanner.nextInt();
                    System.out.print("Объем памяти (GB): ");
                    int searchMemorySizeGB = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера
                    System.out.print("Тип памяти (DDR3, DDR4, etc.): ");
                    String searchMemoryType = scanner.nextLine();
                    System.out.print("Размер монитора (дюймы): ");
                    int searchMonitorSizeInches = scanner.nextInt();

                    Computer foundComputer = shop.findComputer(searchBrand, searchProcessorModel, searchProcessorSpeed, searchMemorySizeGB, searchMemoryType, searchMonitorSizeInches);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер в магазине: " + foundComputer);
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
    }
}