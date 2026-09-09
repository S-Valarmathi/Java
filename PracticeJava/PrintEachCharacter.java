package PracticeJava;

import java.util.Scanner;

public class PrintEachCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        sc.close();

    }
}