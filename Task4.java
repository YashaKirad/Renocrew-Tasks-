import java.util.ArrayList;
import java.util.List;

class Library {
    private List<String> availableBooks;
    private List<String> issuedBooks;

    public Library() {
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println("Book added: " + bookTitle);
    }

    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println("Book issued: " + bookTitle);
        } else {
            System.out.println("Book not available for issuing: " + bookTitle);
        }
    }

    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println("Book returned: " + bookTitle);
        } else {
            System.out.println("Invalid return: " + bookTitle + " was not issued from this library.");
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : availableBooks) {
            System.out.println(book);
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook("Book1");
        library.addBook("Book2");
        library.addBook("Book3");

        // Showing available books
        library.showAvailableBooks();

        // Issuing and returning books 
        library.issueBook("Book1");
        library.issueBook("Book4");  // Book is not available

        library.showAvailableBooks();

        library.returnBook("Book1");
        library.returnBook("Book4");  // Invalid return (wasnt available)

        library.showAvailableBooks();
    }
}
