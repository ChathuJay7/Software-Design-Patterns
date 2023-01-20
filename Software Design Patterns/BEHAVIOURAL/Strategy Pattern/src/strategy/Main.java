
package strategy;

public class Main {

    public static void main(String[] args) {
        
        Context contextAdd = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + contextAdd.executeStrategy(10,5));
        
        Context contextSubtract = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + contextSubtract.executeStrategy(10,5));
        
        
        Context contextMultiply = new Context(new OperationMultiply());
        System.out.println("10 x 5 = " + contextMultiply.executeStrategy(10,5));
        
    }
    
}
