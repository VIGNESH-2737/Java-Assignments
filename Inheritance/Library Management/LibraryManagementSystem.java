import java.util.HashMap;
import java.util.Map;

public class LibraryManagementSystem {
    private Map<String, String> userDatabase;

    public LibraryManagementSystem() {
        this.userDatabase = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        userDatabase.put(username, password);
        System.out.println("User " + username + " registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            System.out.println("Login successful for user: " + username);
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }
}
