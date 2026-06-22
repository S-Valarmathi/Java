class Library {
    String libraryName;
    String[] books;
}

public class LibraryData {
    public static void main(String[] args) {

        Library l1 = new Library();

        l1.libraryName = "City Central Library";

        l1.books = new String[]{
            "Java Basics",
            "Data Structures",
            "DBMS",
            "Operating Systems"
        };

        System.out.println("----- LIBRARY DETAILS -----");
        System.out.println("Library Name: " + l1.libraryName);

        System.out.println("\nBooks Available:");

        for(int i = 0; i < l1.books.length; i++) {
            System.out.println(l1.books[i]);
        }
    }
}