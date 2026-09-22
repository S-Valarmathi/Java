import java.util.Scanner;
public class CheckDivisibilityByTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Divisible by 2");
        }else{
            System.out.println("Not Divisible by 2");
        }
        sc.close();
    }
    
}
