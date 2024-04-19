package org.example;

public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Requested amount exceeds balance", amount);
        }
        amount -= sum;
    }
}
