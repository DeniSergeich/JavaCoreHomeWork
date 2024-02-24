package org.example;

public abstract class Employee {
    String name;
    double hourlyRate;

    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public abstract double calculatePay(int hoursWorked);
    public abstract double calculateAverageMonthlyPay();
}
