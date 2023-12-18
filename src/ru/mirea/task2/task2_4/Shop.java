package ru.mirea.task2.task2_4;


import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> inventory;

    public Shop() {
        inventory = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        inventory.add(computer);
    }

    public void removeComputer(Computer computer) {
        inventory.remove(computer);
    }

    public Computer findComputer(String brand, String model) {
        for (Computer computer : inventory) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null;
    }

    public ArrayList<Computer> getInventory() {
        return inventory;
    }
}