public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publication;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
        this.isAvailable = true;
    }

    public void requestBook() {
        if (isAvailable) {
            System.out.println("Request approved for: " + title);
            isAvailable = false;
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}
