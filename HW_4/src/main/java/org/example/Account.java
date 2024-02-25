package org.example;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0){
            throw new IllegalArgumentException ("Невозможно открыть счет с отрицательным балансом");
        }
        this.balance = initialBalance;
        System.out.printf("Счет открыт, текущий баланс %s: ", balance);
    }
    public void deposit(double amount) {
        if (amount < 0){
            throw new IllegalArgumentException ("Невозможно пополнить баланс на отрицательную сумму");
        }
        this.balance += amount;
        System.out.printf("Депозит на сумму %s успешно внесен, баланс: %s", amount,   balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException("Недостаточно средств. Текущий баланс: " + balance);
        }
        this.balance -= amount;
        System.out.printf("Перевод на сумму %s успешно выполнен, текущий баланс: %s", amount, balance);
    }
}
