package OOP;

public class Fan {
    String brand;
    int speed;

    Fan(){
        System.out.println("Fan Object Created Successfully");
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Spped: " + speed);
        System.out.println();
    }

    public static void main(String[] args){
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.brand = "Usha";
        f1.speed = 3;

        f2.brand = "Crompton";
        f2.speed = 4;

        f1.display();
        f2.display();
    }

}