package ExceptionHandling;
import java.util.Scanner;

public class ArrayException {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30};
        int index = sc.nextInt();
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");

        }
        sc.close();
    }
    
}
