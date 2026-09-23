import java.util.Scanner;
public class CoundDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Count = 0;
        while(n!=0){
            n=n/10;
            Count++;
        }
        System.out.println(Count);
        sc.close();
    }
}