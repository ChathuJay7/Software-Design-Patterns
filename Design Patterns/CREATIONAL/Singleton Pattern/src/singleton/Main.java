
package singleton;

public class Main {

    public static void main(String[] args) {
        
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
        
    }
    
}
