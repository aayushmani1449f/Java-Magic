public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public void credit(double amount) {
        if (amount > 0.0) {
            this.balance = this.balance + amount;
        }
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
