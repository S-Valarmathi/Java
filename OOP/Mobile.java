package OOP;

public class Mobile {
    String brand = "Samsung";
    int price = 26000;

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    
public static void main(String[] args){
    Mobile phone = new Mobile();
    phone.display();
}
}
