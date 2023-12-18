package ru.mirea.task4.task4_1.num10;

abstract class TransportVehicle {
    private String name;
    private double speed;
    private double costPerKilometer;

    public TransportVehicle(String name, double speed, double costPerKilometer) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCostPerKilometer() {
        return costPerKilometer;
    }

    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    public double calculatePassengerTransportCost(double distance, int numPassengers) {
        return costPerKilometer * distance * numPassengers;
    }

    public double calculateCargoTransportCost(double distance, double cargoWeight) {
        return costPerKilometer * distance * cargoWeight;
    }
}