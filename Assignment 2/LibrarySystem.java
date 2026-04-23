import java.util.*;

class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }
}

class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println("Book ID: " + b.getBookId());
            System.out.println("Book Name: " + b.getBookName());
            System.out.println("----------------------");
        }
    }
}

public class LibrarySystem {
    public static void main(String args[]) {

        Book b1 = new Book(1, "Swami");
        Book b2 = new Book(2, "Wings of Fire");

        Book[] bookList = {b1, b2};

        Library lib = new Library(bookList);

        lib.displayBooks();
    }
}