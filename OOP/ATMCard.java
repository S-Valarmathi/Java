package OOP;

public class ATMCard {
    private String cardHolderName;
    private long cardNumber;
    private int pin;
    private double balance;

    public void setCardHolderName(String cardHolderName){
        this.cardHolderName = cardHolderName;
    }

    public void setcardNumber(long cardNumber){
        this.cardNumber = cardNumber;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public String getCardHolderName(){
        return cardHolderName;
    }

    public long getCardNumber(){
        return cardNumber;
    }
    
    public int getPin(){
        return pin;
    }

    public double getbalance(){
        return balance;
    }

    public static void main(String[] args){
        ATMCard a1 = new ATMCard();

        a1.setCardHolderName("Valarmathi");
        a1.setcardNumber(98765432123456L);
        a1.setPin(1234);
        a1.setbalance(25000.50);

        System.out.println("Card Holder Name: " + a1.getCardHolderName());
        System.out.println("Card Number: " + a1.getCardNumber());
        System.out.println("PIN: " + a1.getPin());
        System.out.println("Balance: " + a1.getbalance());

    }
}
