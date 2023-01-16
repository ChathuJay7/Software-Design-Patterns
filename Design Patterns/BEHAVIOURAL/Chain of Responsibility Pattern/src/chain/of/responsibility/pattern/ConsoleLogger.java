
package chain.of.responsibility.pattern;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }
    
    @Override
    public void write(String message) {
        System.out.println("Standard Console::Logger " + message);
    }
    
}
