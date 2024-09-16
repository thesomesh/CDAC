package A7;

class BankAccount {
    private String Accountholder;
    private int Accountno;
    private double balance;

    public BankAccount(String Accountholder, int Accountno, double balance) {
        this.Accountholder = Accountholder;
        this.Accountno = Accountno;
        this.balance = balance;  
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: rs " + amount);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: rs " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return Accountholder;
    }

    public int getAccountNo() {
        return Accountno;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String Accountholder, int Accountno, double balance, double withdrawalLimit) {
        super(Accountholder, Accountno, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Cannot withdraw more than the limit of rs " + withdrawalLimit);
        } else if (amount > 0 && amount <= getBalance()) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrawn: rs " + amount + ". New balance: rs " + newBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}

public class Bank_account {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Somesh ", 12345, 5000.0, 3500.0);

        System.out.println("Account Holder Name  : " + myAccount.getAccountHolder());
        System.out.println("Account Number: " + myAccount.getAccountNo());
        System.out.println("Balance: rs " + myAccount.getBalance());

        myAccount.deposit(1000);
        System.out.println("Balance after deposit: rs " + myAccount.getBalance());

        myAccount.withdraw(2000);
        System.out.println("Balance after withdrawal: rs " + myAccount.getBalance());

        myAccount.withdraw(4000);  
    }
}
