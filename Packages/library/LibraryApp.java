import library.books.Book;
import library.books.BookManager;
import library.members.Member;
import library.members.MemberManager;
import library.transactions.Transaction;
import library.transactions.TransactionManager;
import java.time.LocalDate;

public class LibraryApp {
    public static void main(String[] args) {
        
        BookManager bookManager = new BookManager();
        MemberManager memberManager = new MemberManager();
        TransactionManager transactionManager = new TransactionManager();
        
        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Python Basics", "Jane Smith");
        bookManager.addBook(book1);
        bookManager.addBook(book2);
        
        Member member1 = new Member("M001", "Alice Johnson", "alice@example.com");
        Member member2 = new Member("M002", "Bob Williams", "bob@example.com");
        memberManager.addMember(member1);
        memberManager.addMember(member2);
        
        Transaction transaction1 = transactionManager.issueBook("T001", book1, member1, LocalDate.now());
        Transaction transaction2 = transactionManager.issueBook("T002", book2, member2, LocalDate.now());
        
        System.out.println("All Books:");
        for (Book book : bookManager.getAllBooks()) {
            System.out.println(book);
        }
        
        System.out.println("\nAll Members:");
        for (Member member : memberManager.getAllMembers()) {
            System.out.println(member);
        }
        
        System.out.println("\nActive Transactions:");
        for (Transaction transaction : transactionManager.getActiveTransactions()) {
            System.out.println(transaction);
        }
        
        transactionManager.returnBook(transaction1, LocalDate.now().plusDays(7));
        
        System.out.println("\nAfter returning book1:");
        System.out.println("Book1 status: " + book1.isAvailable());
        System.out.println("Transaction1 return date: " + transaction1.getReturnDate());
    }
}
