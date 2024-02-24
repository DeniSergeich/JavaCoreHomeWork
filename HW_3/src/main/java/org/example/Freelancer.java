package org.example;

public class Freelancer extends Employee{
    public Freelancer(String name, double hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public double calculatePay(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateAverageMonthlyPay() {
        return 20.8 * 8 * hourlyRate;
    }
}
