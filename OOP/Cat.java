

public class Cat {
    void eat(){
        System.out.println("Animal is eating");
    } 

    static  class dog extends Cat{
        void meow(){
        System.out.println("Cat says Meow");
        }
    }

    public static void main(String[] args) {
        dog  a1 = new dog();

       a1.eat();
       a1.meow();
    }
    
    
}
