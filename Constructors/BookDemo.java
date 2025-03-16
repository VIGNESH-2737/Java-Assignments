//package com.vignesh.zohotask;

import java.util.*;

public class BookDemo {
	
	public static void main(String[] args) {
// 		Book compRefJava = new Book();
		
// 		compRefJava.setBookId(1);
// 		compRefJava.setTitle("Java: The Complete Reference");
// 		compRefJava.setAuthor("Herbert Schildt");
// 		compRefJava.setIsbn("978-93-5532-647-8");;
// 		compRefJava.setPublisher("McGrawHill");
// 		compRefJava.setPublisherYear(2024);
// 		compRefJava.setPrice(1780);
// 		compRefJava.setGenre("Technical Book");
// 		compRefJava.setLanguage("English");
// 		compRefJava.setPageCount(1246);
// 		compRefJava.setAvailable(true);
		
		//System.out.println(compRefJava.toString());
		
		        Book compRefJava = new Book(1, "Java: The Complete Reference", "978-93-5532-647-8", "Herbert Schildt",
                "McGrawHill", 2024, 1780, "Technical Book", "English", 1246, true);

        Book crackCode = new Book(2, "Cracking the Coding Interview", "978-0-9847828-5-7", "Gayle Laakmann Mcdowell",
                "CareerCup", 2015, 400, "Technical Book", "English", 696, true);

        Book atomicHabits = new Book(3, "Atomic Habits", "978-0-7352-1129-1", "James Clear",
                "Penguin Random House", 2018, 700, "Self-Help", "English", 320, true);

        Book twentyOneLessons = new Book(4, "21 Lessons for the 21st Century", "978-1-7847-0541-1", "Yuval Noah Harari",
                "Jonathan Cape", 2018, 800, "Non-Fiction", "English", 372, true);

		
		//System.out.println(crackCode.toString());
		
		//Book.printList();
		Book.printAllList();
		
		
	}
}

public class Book {
	
	private int bookId;
	
	private String title;
	private String isbn;
	private String author;
	private String publisher;
	private int publisherYear;
	private int price;
	private String genre;
	private String language;
	private int pageCount;
	private boolean available;
		
	private static List<Book> bookList = new ArrayList<>();

	public Book() {} // default constructor or parameterless constructor
	
	public Book(int bookId, String title, String isbn, String author, String publisher, int publisherYear, int price,  // parameterized constructor
			String genre, String language, int pageCount, boolean available) {
		//super();
		this.bookId = bookId;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.publisherYear = publisherYear;
		this.price = price;
		this.genre = genre;
		this.language = language;
		this.pageCount = pageCount;
		this.available = available;
		
		bookList.add(this);
		
	}

	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPublisherYear() {
		return publisherYear;
	}
	
	public void setPublisherYear(int publisherYear) {
		this.publisherYear = publisherYear;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public static void printList(){
	    System.out.println(bookList);
	}
	
	public static void printAllList(){
	    for(Book x: bookList)
	    System.out.println(x);
	    System.out.println();
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	// toString() method
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", isbn=" + isbn + ", author=" + author + ", publisher="
				+ publisher + ", publisherYear=" + publisherYear + ", price=" + price + ", genre=" + genre
				+ ", language=" + language + ", pageCount=" + pageCount + ", available=" + available + "]";
	}

}


//package com.vignesh.zohotask;
