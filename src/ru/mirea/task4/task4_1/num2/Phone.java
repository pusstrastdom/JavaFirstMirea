package ru.mirea.task4.task4_1.num2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public void displayInfo() {
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " г");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "Samsung", 150);
        Phone phone2 = new Phone("987-654-321", "iPhone");
        Phone phone3 = new Phone();

        System.out.println("Информация о телефоне 1:");
        phone1.displayInfo();
        System.out.println();

        System.out.println("Информация о телефоне 2:");
        phone2.displayInfo();
        System.out.println();

        System.out.println("Информация о телефоне 3:");
        phone3.displayInfo();
        System.out.println();

        phone1.receiveCall("Анна");
        phone2.receiveCall("Петр", "555-555-555");
        phone3.sendMessage("111-111-111", "222-222-222", "333-333-333");
    }
}