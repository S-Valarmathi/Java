

public class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }

    class Bike extends Vehicle{

    }

    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        v1.start();
    }
    
}
