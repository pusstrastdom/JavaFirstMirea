package ru.mirea.task4.task4_1.num6;

public class Main {
    public static void main(String[] args) {
        Employer[] employees = new Employer[2];

        employees[0] = new Employer("John", "Doe", 50000);
        employees[1] = new Manager("Jane", "Smith", 60000, 5000);

        for (Employer employee : employees) {
            System.out.println(employee.getIncome());
        }
    }
}