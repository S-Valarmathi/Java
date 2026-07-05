package OOP;

public class LibraryBook {
    String bookTitle;
    String authorName;
    int price;
    boolean available;

    LibraryBook(String bookTitle, String authorName, int price, boolean available){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.available = available;

    }

    void display(){
        System.out.println("Book Ttile: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }

    public static void main(String[] args){
        LibraryBook l1 = new LibraryBook("Java Programming", "James Gosling", 650, true );
        LibraryBook l2 = new LibraryBook("Python Basics","Guido van Rossum",550, false );
        LibraryBook l3 = new LibraryBook("Data Structure", "MArk Allen", 700, true );

        l1.display();
        l2.display();
        l3.display();
    }
    
}
