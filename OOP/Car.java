package OOP;

public class Car {
    String brand;
    String model;
    int price;

    void display(){
        System.out.println("Brand: " + brand);
        System.out.print("Model: " + model + "\n");
        System.out.println("Price: " + price  + "\n");
        System.out.println();
    }
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Toyota";
        c1.model = "Innova";
        c1.price = 2500000;

        c2.brand = "Hyundai";
        c2.model = "Creta";
        c2.price = 1800000;

        c1.display();
        c2.display();
    }
    
}
