package ru.mirea.task4.num4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27.0);

        Computer computer = new Computer(ComputerBrand.Dell, processor, memory, monitor);

        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Процессор: " + computer.getProcessor().getModel() + " с частотой " + computer.getProcessor().getClockSpeed() + " ГГц");
        System.out.println("Оперативная память: " + computer.getMemory().getCapacity() + " ГБ " + computer.getMemory().getType());
        System.out.println("Монитор: " + computer.getMonitor().getModel() + " размером " + computer.getMonitor().getSize() + " дюймов");
    }
}