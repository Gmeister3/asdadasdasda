import java.util.*;

// ==========================================
// PART 1: LEGACY CODE (DO NOT MODIFY AS IS)
// ==========================================
// This represents the old inheritance-based design.
abstract class Notification {
    protected String message;
    public Notification(String message) { this.message = message; }
    public abstract void send();
}

class EmailNotification extends Notification {
    public EmailNotification(String message) { super(message); }
    @Override public void send() { System.out.println("Sending Email: " + message); }
}












// ==========================================
// PART 2: NEW INTERFACE DEFINITIONS
// ==========================================

enum Priority {
    LOW, MEDIUM, HIGH
} 

interface Informable {
    String getContent();
    
    default void preview() {
        String content = getContent();
        String snippet = content.length() > 50 ? content.substring(0, 50) + "..." : content;
        System.out.println("Preview: " + snippet);
    }
}

interface Sendable {
    void dispatch(String destination);
}

interface Loggable {
    static void logTimestamp(String info) {
        System.out.println("[" + java.time.LocalDateTime.now() + "] " + info);
    }
}

interface Prioritizable {
    Priority getPriority();
}

// ==========================================
// PART 3: REFACTORED CLASSES
// ==========================================

class UrgentPage implements Informable, Sendable, Prioritizable {
    private String content;
    private Priority priority;
    
    public UrgentPage(String content, Priority priority) {
        this.content = content;
        this.priority = priority;
    }
    
    @Override
    public String getContent() {
        return content;
    }
    
    @Override
    public void dispatch(String destination) {
        System.out.println("Dispatching urgent page to " + destination + ": " + content);
    }
    
    @Override
    public Priority getPriority() {
        return priority;
    }
}

class CustomerAlert implements Informable, Sendable, Loggable {
    private String content;
    
    public CustomerAlert(String content) {
        this.content = content;
    }
    
    @Override
    public String getContent() {
        return content;
    }
    
    @Override
    public void dispatch(String destination) {
        Loggable.logTimestamp("Sending alert to " + destination);
        System.out.println("Customer Alert to " + destination + ": " + content);
    }
}

// ==========================================
// PART 4: GENERICS & BOUNDS
// ==========================================

/**
 * Requirement: Create a SecurityScanner that only accepts types 
 * that are BOTH Informable and Loggable. 
 */
class SecurityScanner<T extends Informable & Loggable> { 
    public void performAudit(T item) {
        Loggable.logTimestamp("Starting security audit");
        System.out.println("Auditing content: " + item.getContent());
        Loggable.logTimestamp("Audit completed");
    }
}

/**
 * Requirement: Create a ProcessingResult class with two type parameters. 
 */
class ProcessingResult<K, V> {
    private K key;
    private V value;
    
    public ProcessingResult(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public <U> void printMetadata(U info) {
        System.out.println("Metadata: " + info);
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

// ==========================================
// PART 5: MAIN EXECUTION
// ==========================================
public class Lab3Runner {
    public static void main(String[] args) {
        System.out.println("--- Exercise 1: Polymorphism ---");
        List<Informable> messages = new ArrayList<>();
        messages.add(new UrgentPage("Critical system failure detected!", Priority.HIGH));
        messages.add(new CustomerAlert("Your order has been shipped."));
        messages.add(new UrgentPage("Scheduled maintenance tonight at 2 AM.", Priority.LOW));
        
        for (Informable msg : messages) {
            msg.preview();
        }

        System.out.println("\n--- Exercise 2: Generics ---");
        SecurityScanner<CustomerAlert> scanner = new SecurityScanner<>();
        CustomerAlert alert = new CustomerAlert("Security audit test message.");
        scanner.performAudit(alert);
        
        ProcessingResult<String, Integer> result = new ProcessingResult<>("Status", 200);
        result.printMetadata("HTTP Response");
    }
}