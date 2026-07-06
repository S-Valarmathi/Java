package OOP;

public class ElectronicDevice {
    void powerOn(){
        System.out.println("Device is powered on");
    }

    static class Laptop extends ElectronicDevice{
        void code(){
            System.out.println("Coding is Java");
        }
    }

    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.powerOn();
        l1.code();
    }
    
}
