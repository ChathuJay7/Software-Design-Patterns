
package singleton;

public class SingletonObject {
    
    // Create an object of SingleObject
    private static SingletonObject instance = new SingletonObject();
    
    // Make constructor private so that this class can't be instantiated
    private SingletonObject(){
        
    }
    
    public static SingletonObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("This is Singleton design pattern");
    }
    
}
