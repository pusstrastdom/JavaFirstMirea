package ru.mirea.task4.task4_1.num7;

public class Student extends Member{
    String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}