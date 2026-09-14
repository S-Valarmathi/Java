package Strings;
import java.util.Scanner;
public class ConvertToLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toLowerCase());
        sc.close();
    }
    
}
