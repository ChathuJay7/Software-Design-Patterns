
package chain.of.responsibility.pattern;

public class Main {

    public static void main(String[] args) {
        
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        
        consoleLogger.logMessage(AbstractLogger.INFO, "This is and information.");
        System.out.println();
        
        consoleLogger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        System.out.println();
        
        consoleLogger.logMessage(AbstractLogger.ERROR, "This is an error information.");
        System.out.println();


    }
    
}
