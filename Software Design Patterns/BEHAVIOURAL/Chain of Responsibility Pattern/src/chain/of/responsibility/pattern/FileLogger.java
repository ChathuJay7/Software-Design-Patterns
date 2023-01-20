
package chain.of.responsibility.pattern;

public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }
    
    @Override
    public void write(String message) {
        System.out.println("File Console::Logger " + message);
    }
    
}
