package Operators;

public class Increment {
    public static void main(String[] args){
        int a = 4 , b= 5 ,  c;
        c= a + b + a++ + b++ + ++a + ++b;
        System.out.println("Value of c: " + c);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

    }
}
