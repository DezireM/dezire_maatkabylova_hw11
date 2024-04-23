package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);

        try {
            while (true) {
                account.withDraw(6000.0);
                System.out.println("Remaining amount: " + account.getAmount());
            }
        } catch (LimitException e) {
            System.out.println(e.getMessage());
            System.out.println("Remaining amount: " + e.getRemainingAmount());

            try {
                account.withDraw(e.getRemainingAmount());
            } catch (LimitException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}