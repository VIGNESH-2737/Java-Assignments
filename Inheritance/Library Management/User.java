public class User {
    private String name;
    private String id;
    private Account account;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.account = new Account();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void verify() {
        System.out.println("Verifying user " + name + " with ID " + id);
    }

    public void checkAccount() {
        account.displayAccountInfo();
    }

    public void getBookInfo(Book book) {
        System.out.println("Getting info for book: " + book.getTitle());
    }
}
