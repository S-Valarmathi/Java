package Operators;
public class AssignmentOperators {
    public static void main(String[] args) {

        int number = 20;   // = assignment operator

        System.out.println("Initial Value: " + number);

        number += 10;      // Add and assign
        System.out.println("After += : " + number);

        number -= 5;       // Subtract and assign
        System.out.println("After -= : " + number);

        number *= 2;       // Multiply and assign
        System.out.println("After *= : " + number);

        number /= 5;       // Divide and assign
        System.out.println("After /= : " + number);

        number %= 3;       // Modulus and assign
        System.out.println("After %= : " + number);
    }
}