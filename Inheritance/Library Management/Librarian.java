public class Librarian {
    private String name;
    private String id;
    private String password;

    public Librarian(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public boolean authenticate(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public void searchBook(String query) {
        System.out.println("Searching the library database for: " + query);
    }
}
