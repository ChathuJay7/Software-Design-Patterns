
package mediator;

public class Main {

    public static void main(String[] args) {
        
        User emma = new User("Emma");
        User jack = new User("Jack");
        
        emma.sendMessage("Hi! Jack!");
        jack.sendMessage("Hello! Emma!");
    }
    
}
