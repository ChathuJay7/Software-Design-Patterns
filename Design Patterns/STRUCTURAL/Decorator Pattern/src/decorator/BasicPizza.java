
package decorator;

public class BasicPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Basic pizza";
    }

    @Override
    public float getPrice() {
        return 1000;
    }
    
}
