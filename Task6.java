import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public void setIssuedOn(Date issuedOn) {
        this.issuedOn = issuedOn;
    }
}

class Library {
    private HashMap<String, Book> bookCatalog;

    public Library() {
        this.bookCatalog = new HashMap<>();
    }

    public void addBook(String name, String author) {
        Book book = new Book(name, author);
        bookCatalog.put(name, book);
        System.out.println("Book added successfully: " + name);
    }

    public void issueBook(String bookName, String userName) {
        if (bookCatalog.containsKey(bookName)) {
            Book book = bookCatalog.get(bookName);
            if (book.getIssuedTo() == null) {
                book.setIssuedTo(userName);
                book.setIssuedOn(new Date());
                System.out.println("Book issued successfully: " + bookName + " to " + userName);
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void returnBook(String bookName) {
        if (bookCatalog.containsKey(bookName)) {
            Book book = bookCatalog.get(bookName);
            if (book.getIssuedTo() != null) {
                book.setIssuedTo(null);
                book.setIssuedOn(null);
                System.out.println("Book returned successfully: " + bookName);
            } else {
                System.out.println("Book is not issued.");
            }
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}

public class Task6 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(bookName, author);
                    break;
                case 2:
                    System.out.print("Enter book name to issue: ");
                    bookName = scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    library.issueBook(bookName, userName);
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    bookName = scanner.nextLine();
                    library.returnBook(bookName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}
