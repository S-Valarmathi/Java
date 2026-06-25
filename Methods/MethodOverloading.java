package Methods;

public class MethodOverloading {
    static void add (int a, int b){
        System.out.println(a+b);
    }
    static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        add (10, 20);
        add (10, 20, 30);
    }
    
}
