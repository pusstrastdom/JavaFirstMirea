package ru.mirea.task4.task4_1.num7;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new Schooler("Иван", 10);
        members[1] = new Student("Мария", "Университет А");
        members[2] = new Schooler("Петр", 8);

        System.out.println("Студенты:");
        for (Member member : members) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println("Имя: " + student.getName() + ", Университет: " + student.getUniversity());
            }
        }

        System.out.println("\nШкольники:");
        for (Member member : members) {
            if (member instanceof Schooler) {
                Schooler schooler = (Schooler) member;
                System.out.println("Имя: " + schooler.getName() + ", Класс: " + schooler.getRoom());
            }
        }
    }
}