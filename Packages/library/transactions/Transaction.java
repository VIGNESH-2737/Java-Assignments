package library.transactions;

import library.books.Book;
import library.members.Member;
import java.time.LocalDate;

public class Transaction {
    private String id;
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;
    
    public Transaction(String id, Book book, Member member, LocalDate issueDate) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.returnDate = null;
    }
    
    public String getId() { return id; }
    public Book getBook() { return book; }
    public Member getMember() { return member; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
    
    @Override
    public String toString() {
        return "Transaction [ID: " + id + ", Book: " + book.getTitle() + 
               ", Member: " + member.getName() + ", Issue Date: " + issueDate + 
               ", Return Date: " + (returnDate != null ? returnDate : "Not returned") + "]";
    }
}
