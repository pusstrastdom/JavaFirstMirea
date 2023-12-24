package ru.mirea.task6.task6_10;

import java.util.ArrayList;
import java.util.List;

class Shop {
    public List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(ComputerBrand brand, String processorModel, int searchProcessorSpeed, int memorySizeGB, String memoryType, int monitorSizeInches) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand &&
                    computer.getProcessor().toString().equals(processorModel) &&
                    computer.getMemory().toString().equals(memorySizeGB + "GB " + memoryType + " RAM") &&
                    computer.getMonitor().toString().equals(monitorSizeInches + "\"")) {
                return computer;
            }
        }
        return null;
    }
}