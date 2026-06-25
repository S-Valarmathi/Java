package Methods;

class CalculationOverloading{
    static void calculator (int a, int b){
        System.out.println("Addition = " + (a+b));
    }
    static void calculator (short a, short b){
        System.out.println ("Subtraction = " + (a-b)); 
    }
    static void calculator (double a, double b){
        System.out.println("Multiplication = " + (a*b));
    }
    static void calculator (float a, float b){
        System.out.println("Division = " +(a/b));

    }
    public static void main (String[] args){
        calculator(10 , 20);
        calculator(10, 15);
        calculator(6.0, 4.0);
        calculator(7.0, 16);

    }
}