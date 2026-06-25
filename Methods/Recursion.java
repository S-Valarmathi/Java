package Methods;

public class Recursion {
    static void show(){
        System.out.println("Hello");
        show();
    }
    public static void main(String[] args){
        show();
    }
}
