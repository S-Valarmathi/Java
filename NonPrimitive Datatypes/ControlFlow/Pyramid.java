import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int number = sc.nextInt();
        for(int i=0; i<=number; i++){
            for(int j=0; j<=number-i; j++){
                System.out.print("");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + "");
            }
            System.out.println();
        }
        sc.close();
    
    }
    
}
