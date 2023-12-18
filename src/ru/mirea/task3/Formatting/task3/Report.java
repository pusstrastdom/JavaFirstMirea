package ru.mirea.task3.Formatting.task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %-10s%n", "Имя", "Зарплата");
        for (Employee employee : employees) {
            System.out.printf("%-20s %10.2f%n", employee.fullname, employee.salary);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иван Петров", 3500.00),
                new Employee("Анна Иванова", 4200.50),
                new Employee("Петр Сидоров", 3200.75)
        };

        generateReport(employees);
    }
}