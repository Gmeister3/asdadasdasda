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

// TODO: Define Priority enum here (LOW, MEDIUM, HIGH) 

interface Informable {
    // TODO: Define abstract method getContent() 
    
    // TODO: Implement a default method preview() 
}

interface Sendable {
    // TODO: Define abstract method dispatch(String destination) [cite: 4]
}

interface Loggable {
    // TODO: Implement a static utility method logTimestamp(String info) [cite: 15, 17]
}

interface Prioritizable {
    // TODO: Define method getPriority() that returns a Priority enum 
}

// ==========================================
// PART 3: REFACTORED CLASSES
// ==========================================

// TODO: Implement UrgentPage (Informable, Sendable, Prioritizable) 
class UrgentPage {
    // Implementation goes here...
}

// TODO: Implement CustomerAlert (Informable, Sendable, Loggable)
class CustomerAlert {
    // Implementation goes here...
}

// ==========================================
// PART 4: GENERICS & BOUNDS
// ==========================================

/**
 * Requirement: Create a SecurityScanner that only accepts types 
 * that are BOTH Informable and Loggable. 
 */
class SecurityScanner<T> { 
    // TODO: Add multiple bounds to T 
    // TODO: Implement performAudit(T item)
}

/**
 * Requirement: Create a ProcessingResult class with two type parameters. 
 */
class ProcessingResult<K, V> {
    // TODO: Implement constructor and fields
    
    // TODO: Implement a generic method printMetadata(U info) 
}

// ==========================================
// PART 5: MAIN EXECUTION
// ==========================================
public class Lab3Runner {
    public static void main(String[] args) {
        System.out.println("--- Exercise 1: Polymorphism ---");
        // TODO: Create a List<Informable> and add different implementations 

        System.out.println("\n--- Exercise 2: Generics ---");
        // TODO: Instantiate SecurityScanner and ProcessingResult 
        // TODO: Use the Diamond Operator <> 
    }
}