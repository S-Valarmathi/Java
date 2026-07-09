package ExceptionHandling;

public class BankTransaction {
    static void withdraw(int amount) throws Exception{
        if(amount > 50000){
            throw new Exception("Insufficient Balance");
        }
        System.out.println("Transaction Successful");
    }
    
    public static void main(String[] args){
        try{
            withdraw(7000);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Thank You for Banking");
        }
    }
}
