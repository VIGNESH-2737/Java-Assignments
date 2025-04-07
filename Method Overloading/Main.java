public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Alice");
        p1.displayInfo();

        
        Person p2 = new Person("Bob", 25);
        p2.displayInfo();

        
        Person p3 = new Person("Charlie", 30, "123 Street, City");
        p3.displayInfo();
    }
}
