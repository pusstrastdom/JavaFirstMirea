package ru.mirea.task4.num3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore {
    private static Map<Catalog, List<Product>> products = new HashMap<>();
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        initializeProducts();
        createUser("user1", "password1");
        createUser("user2", "password2");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Вход");
            System.out.println("2. Просмотр каталогов");
            System.out.println("3. Просмотр товаров в каталоге");
            System.out.println("4. Добавить товар в корзину");
            System.out.println("5. Купить товары в корзине");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    authenticateUser(scanner);
                    break;
                case 2:
                    viewCatalogs();
                    break;
                case 3:
                    viewProductsInCatalog(scanner);
                    break;
                case 4:
                    addToCart(scanner);
                    break;
                case 5:
                    checkout(scanner);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void initializeProducts() {
        products.put(Catalog.ELECTRONICS, new ArrayList<>());
        products.put(Catalog.CLOTHING, new ArrayList<>());
        products.put(Catalog.BOOKS, new ArrayList<>());

        products.get(Catalog.ELECTRONICS).add(new Product("Смартфон", 500.0));
        products.get(Catalog.ELECTRONICS).add(new Product("Ноутбук", 800.0));
        products.get(Catalog.CLOTHING).add(new Product("Футболка", 20.0));
        products.get(Catalog.CLOTHING).add(new Product("Джинсы", 40.0));
        products.get(Catalog.BOOKS).add(new Product("Роман", 10.0));
        products.get(Catalog.BOOKS).add(new Product("Поэзия", 5.0));
    }

    private static void createUser(String username, String password) {
        users.add(new User(username, password));
    }

    private static void authenticateUser(Scanner scanner) {
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                System.out.println("Вход выполнен успешно.");
                return;
            }
        }
        System.out.println("Неверное имя пользователя или пароль.");
    }

    private static void viewCatalogs() {
        for (Catalog catalog : Catalog.values()) {
            System.out.println(catalog.ordinal() + 1 + ". " + catalog.name());
        }
    }

    private static void viewProductsInCatalog(Scanner scanner) {
        System.out.print("Выберите номер каталога: ");
        int catalogChoice = scanner.nextInt();
        if (catalogChoice >= 1 && catalogChoice <= Catalog.values().length) {
            Catalog selectedCatalog = Catalog.values()[catalogChoice - 1];
            List<Product> productList = products.get(selectedCatalog);
            for (int i = 0; i < productList.size(); i++) {
                System.out.println((i + 1) + ". " + productList.get(i).getName() + " - $" + productList.get(i).getPrice());
            }
        } else {
            System.out.println("Неверный выбор каталога.");
        }
    }

    private static void addToCart(Scanner scanner) {
        System.out.print("Выберите номер каталога: ");
        int catalogChoice = scanner.nextInt();
        if (catalogChoice >= 1 && catalogChoice <= Catalog.values().length) {
            Catalog selectedCatalog = Catalog.values()[catalogChoice - 1];
            List<Product> productList = products.get(selectedCatalog);
            for (int i = 0; i < productList.size(); i++) {
                System.out.println((i + 1) + ". " + productList.get(i).getName() + " - $" + productList.get(i).getPrice());
            }

            System.out.print("Выберите номер товара для добавления в корзину: ");
            int productChoice = scanner.nextInt();
            if (productChoice >= 1 && productChoice <= productList.size()) {
                User user = getCurrentUser();
                user.addToCart(selectedCatalog, productList.get(productChoice - 1));
                System.out.println("Товар добавлен в корзину.");
            } else {
                System.out.println("Неверный выбор товара.");
            }
        } else {
            System.out.println("Неверный выбор каталога.");
        }
    }

    private static void checkout(Scanner scanner) {
        User user = getCurrentUser();
        double total = user.checkout();
        System.out.println("Общая стоимость товаров в корзине: $" + total);
        System.out.println("Спасибо за покупку!");
    }

    private static User getCurrentUser() {
        return users.get(0);
    }
}