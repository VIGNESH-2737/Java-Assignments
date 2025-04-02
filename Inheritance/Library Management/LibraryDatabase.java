import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    private List<Book> books;

    public LibraryDatabase() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Deleted book: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBook(String keyword) {
        System.out.println("Searching for books related to: " + keyword);
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || 
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
