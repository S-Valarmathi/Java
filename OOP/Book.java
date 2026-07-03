package OOP;

public class Book {
    String title = "Java Programming";
    String author = "James Gosling";
    int price = 550;

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

    public static void main (String[] args){
        Book b1 = new Book();
        b1.display();
    }
    
}
