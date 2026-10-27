package com.collection;

// import java.util.Objects;

public class Account {
    private String accountNumber;
    private String owner;
    private double balance;

    public Account(String accountNumber, String owner, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account Number wajib diisi");
        }
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Owner wajib diisi");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance wajib diisi");
        }
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("Deposit harus Positif");
        }
        balance += amount;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || != o.getClass())
    // return false;

    // Account account = (Account) o;

    // return accountNumber.equals(account.accountNumber);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(accountNumber);
    // }
}
