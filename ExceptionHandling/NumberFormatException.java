package ExceptionHandling;
import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            int number = Integer.parseInt(input);
            System.out.println(number);
        }catch(java.lang.NumberFormatException e){
            System.out.println("Invalid number");

        }
        sc.close();
    }
    
}
