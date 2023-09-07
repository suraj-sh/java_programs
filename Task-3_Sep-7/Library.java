/*  Task 4: Library Management
    Create a Java class Library to manage books. 
    Include attributes like book title, author, and availability status. 
    Implement methods to check out and return books, and display available books.   */

import java.util.ArrayList;
import java.util.List;

class Book{
    
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author){

        this.title = title;
        this.author = author;
        this.available = true; // Newly added books are initially available
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }
}

public class Library{

    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author){

        Book book = new Book(title, author);
        books.add(book);
    }

    public void checkOutBook(String title){

        for(Book book : books){

            if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable()){

                book.setAvailable(false);
                System.out.println("Checked out: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not available for checkout: " + title);
    }

    public void returnBook(String title){

        for(Book book : books){

            if(book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()){

                book.setAvailable(true);
                System.out.println("Returned: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Invalid return: " + title);
    }

    public void displayAvailableBooks(){

        System.out.println("Available Books:");
        for(Book book : books){
            if(book.isAvailable()){
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public static void main(String[] args){

        Library lib = new Library();

        // Add some books to the library
        lib.addBook("Let Us C", "Yashavant Kanetkar");
        lib.addBook("Core Python Programming", "Dr. R. Nageswara Rao");
        lib.addBook("Django 2 by Example", "Antonio Mele");

        // Display available books
        lib.displayAvailableBooks();

        // Check out and return books
        lib.checkOutBook("Let Us C");
        lib.checkOutBook("Django 2 by Example");
        lib.returnBook("Let Us C");

        // Display available books after checkouts and returns
        lib.displayAvailableBooks();
    }
}
