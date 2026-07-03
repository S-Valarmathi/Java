package OOP;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    int balance;

    void display(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("AccountHolderName: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        b1.accountNumber = 12345;
        b1.accountHolderName = "aaaa";
        b1.balance = 10000;

        b2.accountNumber = 23456;
        b2.accountHolderName = "bbbb";
        b2.balance = 20000;

        b3.accountNumber = 67890;
        b3.accountHolderName = "ccccc";
        b3.balance = 30000;

        b1.display();
        b2.display();
        b3.display();

    }

    
}
