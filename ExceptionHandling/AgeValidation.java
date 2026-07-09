package ExceptionHandling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class AgeValidation{
    public static void main(String[] args){
        int age = -5;
        try{
            if(age < 0){
                throw new InvalidAgeException("Age cannot be negative");

            }

            System.out.println("Valid Age");

        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}