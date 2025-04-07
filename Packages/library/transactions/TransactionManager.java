package library.transactions;

import library.books.Book;
import library.members.Member;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;
    
    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }
    
    public Transaction issueBook(String transactionId, Book book, Member member, LocalDate issueDate) {
        if (!book.isAvailable()) {
            return null;
        }
        
        book.setAvailable(false);
        Transaction transaction = new Transaction(transactionId, book, member, issueDate);
        transactions.add(transaction);
        return transaction;
    }
    
    public boolean returnBook(Transaction transaction, LocalDate returnDate) {
        if (transaction.getReturnDate() != null) {
            return false; 
        }
        
        transaction.setReturnDate(returnDate);
        transaction.getBook().setAvailable(true);
        return true;
    }
    
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
    
    public List<Transaction> getActiveTransactions() {
        List<Transaction> activeTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getReturnDate() == null) {
                activeTransactions.add(transaction);
            }
        }
        return activeTransactions;
    }
}
