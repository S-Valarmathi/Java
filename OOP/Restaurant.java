

public class Restaurant {
    String restaurantName;
    String location;
    double rating;

    Restaurant(String a, String b, double c){
        restaurantName = a;
        location = b;
        rating = c;
    }

    void display(){
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
        System.out.println();
    }

    public static void main(String[] args){
        Restaurant r1 = new Restaurant("A2B", "Coimbatore", 4.5);
        Restaurant r2 = new Restaurant("SS Hyderabad Biryani",  "Chennai", 4.7 );
        r1.display();
        r2.display();

    }

    
}
