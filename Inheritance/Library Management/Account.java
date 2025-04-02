public class Account {
    private int borrowedBooks;
    private int reservedBooks;
    private int returnedBooks;
    private int lostBooks;
    private double fineAmount;

    public Account() {
        borrowedBooks = 0;
        reservedBooks = 0;
        returnedBooks = 0;
        lostBooks = 0;
        fineAmount = 0.0;
    }

    public void updateLostBooks(int count) {
        this.lostBooks += count;
        calculateFine();
    }

    private void calculateFine() {
        fineAmount = lostBooks * 10.0;
    }

    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Borrowed: " + borrowedBooks + ", Reserved: " + reservedBooks);
        System.out.println("Returned: " + returnedBooks + ", Lost: " + lostBooks);
        System.out.println("Fine Amount: $" + fineAmount);
    }
}
