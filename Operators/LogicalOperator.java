package Operators;

public class LogicalOperator {
    public static void main(String[] args){
        int a = 20;
        int b = 10;
        System.out.println("Condition 1 = " + (a>10 && b>5));
        System.out.println("Condition 2 = " + (a>25 && b>5));
        System.out.println("Condition 3 = " + (a>25 || b>5));
        System.out.println("Condition 4 = " + (a<10 || b<5));
        System.out.println("Condition 5 = " + !(b>5));

    }
    
}
