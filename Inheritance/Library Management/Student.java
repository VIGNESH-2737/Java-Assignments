public class Student extends User {
    private String studentClass;

    public Student(String name, String id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void borrowBook(Book book) {
        System.out.println("Student " + getName() + " is borrowing: " + book.getTitle());
        getAccount().updateBorrowedBooks();
    }

    public void returnBook(Book book) {
        System.out.println("Student " + getName() + " is returning: " + book.getTitle());
        getAccount().updateReturnedBooks();
    }
}


//Vignesh D Java Assignment Library Management
