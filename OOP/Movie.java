package OOP;

public class Movie {
    String movieName;
    String hero;
    double rating;

    void display(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Hero: " + hero );
        System.out.println("Rating: " + rating);
        System.out.println();
    }

    public static void main(String[] args){
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();

        m1.movieName = "Leo";
        m1.hero = "Vijay";
        m1.rating = 4.5;

        m2.movieName = "Amaran";
        m2.hero = "SivaKarthikeyan";
        m2.rating = 4.8;

        m3.movieName = "Dragon";
        m3.hero = "Pradeep Ranganathan";
        m3.rating = 4.6;


        m1.display();
        m2.display();
        m3.display();




    }
    
}
