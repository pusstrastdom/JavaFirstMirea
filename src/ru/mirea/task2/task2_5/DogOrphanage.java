package ru.mirea.task2.task2_5;

public class DogOrphanage {
    private Dog[] dogs;
    private int count;

    public DogOrphanage(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("Питомник полон, невозможно добавить больше собак.");
        }
    }

    public void listDogs() {
        System.out.println("Собаки в питомнике:");
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogOrphanage kennel = new DogOrphanage(5);

        Dog dog1 = new Dog("Рекс", 3);
        Dog dog2 = new Dog("Белла", 5);
        Dog dog3 = new Dog("Макс", 2);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        kennel.listDogs();
    }
}