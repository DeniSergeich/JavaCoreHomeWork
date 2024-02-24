package org.example;

public class Worker extends Employee{
    double fixedSalary;
    public Worker(String name, double fixedSalary) {
        super(name, 0);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay(int hoursWorked) {
        return fixedSalary;
    }

    @Override
    public double calculateAverageMonthlyPay() {
        return fixedSalary;
    }
}
