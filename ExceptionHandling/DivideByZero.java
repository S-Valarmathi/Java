package ExceptionHandling;
import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a/b;
        System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }   
        sc.close(); 

    }
    
    
}
