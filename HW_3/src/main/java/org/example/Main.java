package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Freelancer("Bob", 20));
        employees.add(new Freelancer("Nick", 30));
        employees.add(new Worker("Anna", 2000));
        employees.add(new Worker("Mickael", 3200));

        for (Employee emp: employees) {
            System.out.println(emp.name + " monthly pay: " + emp.calculateAverageMonthlyPay() + "$");
        }
    }
}