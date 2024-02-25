package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account(-1000); // инициализация счета с балансом -1000
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }

        try {
            Account account = new Account(1000); // инициализация счета с балансом 1000
            System.out.println();
            account.deposit(100); //пополнение счета на 100
            System.out.println();
            account.withdraw(500); //перевод со счета 500
            System.out.println();
            account.withdraw(700); //перевод со счета при недостаточном количестве средств
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }

    }
}