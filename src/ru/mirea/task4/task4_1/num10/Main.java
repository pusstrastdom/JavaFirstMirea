package ru.mirea.task4.task4_1.num10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Легковой автомобиль", 100.0, 0.1); // 100 км/ч, 0.1 руб. за км
        Airplane airplane = new Airplane("Пассажирский самолет", 900.0, 1.5); // 900 км/ч, 1.5 руб. за км
        Train train = new Train("Поезд", 120.0, 0.05); // 120 км/ч, 0.05 руб. за км
        Ship ship = new Ship("Круизный корабль", 30.0, 0.2); // 30 км/ч, 0.2 руб. за км

        double distance = 500.0; // в км
        int numPassengers = 50;
        double cargoWeight = 1000.0; // в кг

        double carTravelTime = car.calculateTravelTime(distance);
        double carPassengerCost = car.calculatePassengerTransportCost(distance, numPassengers);
        double carCargoCost = car.calculateCargoTransportCost(distance, cargoWeight);

        double airplaneTravelTime = airplane.calculateTravelTime(distance);
        double airplanePassengerCost = airplane.calculatePassengerTransportCost(distance, numPassengers);
        double airplaneCargoCost = airplane.calculateCargoTransportCost(distance, cargoWeight);

        double trainTravelTime = train.calculateTravelTime(distance);
        double trainPassengerCost = train.calculatePassengerTransportCost(distance, numPassengers);
        double trainCargoCost = train.calculateCargoTransportCost(distance, cargoWeight);

        double shipTravelTime = ship.calculateTravelTime(distance);
        double shipPassengerCost = ship.calculatePassengerTransportCost(distance, numPassengers);
        double shipCargoCost = ship.calculateCargoTransportCost(distance, cargoWeight);

        System.out.println("Результаты для расстояния " + distance + " км:");
        System.out.println("Автомобиль: Время = " + carTravelTime + " ч, Стоимость пассажирской перевозки = " + carPassengerCost + " руб, Стоимость грузовой перевозки = " + carCargoCost + " руб");
        System.out.println("Самолет: Время = " + airplaneTravelTime + " ч, Стоимость пассажирской перевозки = " + airplanePassengerCost + " руб, Стоимость грузовой перевозки = " + airplaneCargoCost + " руб");
        System.out.println("Поезд: Время = " + trainTravelTime + " ч, Стоимость пассажирской перевозки = " + trainPassengerCost + " руб, Стоимость грузовой перевозки = " + trainCargoCost + " руб");
        System.out.println("Корабль: Время = " + shipTravelTime + " ч, Стоимость пассажирской перевозки = " + shipPassengerCost + " руб, Стоимость грузовой перевозки = " + shipCargoCost + " руб");
    }
}