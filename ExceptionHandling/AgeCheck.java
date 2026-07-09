package ExceptionHandling;

public class AgeCheck {
    public static void main(String[] args){
        int age = -5;
        try{
            
            if(age < 0){
                throw new ArithmeticException("Invalid age");
            }
                System.out.println("Valid age");
            } catch (ArithmeticException e){
                System.out.println("Invalid age");
            }
        }
    }
    
