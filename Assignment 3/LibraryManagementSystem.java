import java.util.*;

class Book {
    private int bookId;
    private String title;
    private String authorName;
    private boolean status;

    static int totalBooks = 0;

    public Book(int bookId, String title, String authorName, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.status = status;
        totalBooks++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void issueBook() {
        if (status == true) {
            status = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued (Not available).");
        }
    }

    public void returnBook() {
        if (status == false) {
            status = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author Name: " + authorName);
        System.out.println("Availability Status: " + status);
    }
}

public class LibraryManagementSystem {

    public static Book findBookById(ArrayList<Book> books, int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Enter total number of books: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Book Details of book " + (i + 1) + ": ");

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author Name: ");
            String name = sc.nextLine();

            System.out.print("Availability Status: ");
            boolean status = sc.nextBoolean();

            Book b = new Book(id, title, name, status);

            books.add(b);
        }

        System.out.println("\n--- Product Details ---");

        for (Book b : books) {
            b.display();
        }

        while (true) {
            System.out.println("\n1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    Book bookToIssue = findBookById(books, issueId);

                    if (bookToIssue != null) {
                        bookToIssue.issueBook();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    Book bookToReturn = findBookById(books, returnId);

                    if (bookToReturn != null) {
                        bookToReturn.returnBook();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}