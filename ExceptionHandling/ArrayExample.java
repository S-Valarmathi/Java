package ExceptionHandling;

public class ArrayExample {
    public static void main(String[] args){
        int[] numbers = {10,20,30};
        try{
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid arrady index");

        }
    }
    
}
