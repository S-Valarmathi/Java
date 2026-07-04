package OOP;

public class Bank {
    String accountHolderName;
    long accountNumber;
    int balance;


    Bank(String accountHolderName, long accountNumber, int balance ){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    public static void main(String[] args){
        Bank b1 = new Bank("aaaa", 123456789L, 50000);
        Bank b2 = new Bank("bbbb", 987654321L, 75000);
        b1.display();
        b2.display();
    }
    
    
}
