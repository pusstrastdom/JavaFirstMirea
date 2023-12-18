package ru.mirea.task4.task4_1.num3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        fullName = "Unknown";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 25);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}