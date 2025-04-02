public class Staff extends User {
    private String department;

    public Staff(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public void manageBooks() {
        System.out.println("Staff member " + getName() + " is managing books.");
    }

    public void addBook(LibraryDatabase library, Book book) {
        library.addBook(book);
    }

    public void removeBook(LibraryDatabase library, Book book) {
        library.deleteBook(book);
    }
}
