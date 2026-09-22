class BankAccount {
    String owner;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) { balance = balance - amount;
        } else {
            System.out.println("Not enough money***Kunal**.");
					}
 }

    void displayBalance() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}

public class Practice7_BankAccount {
    public static void main(String[]  attr) {
        BankAccount account1 = new BankAccount();
        account1.owner = "John";
		
        account1.balance = 500;
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayBalance();
    }
}
