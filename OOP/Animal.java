public class Animal {
    void sound(){
        System.out.println("Animal makes Sound");
    }
    static class Dog extends Animal{
        @Override
        void sound(){
            super.sound();
            System.out.println("Dog barks");
            
        }

        public static void main(String[] args){
            Dog d1 = new Dog();

            d1.sound();


        }

        
    } 
    
}
