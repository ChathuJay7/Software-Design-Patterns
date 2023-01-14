
package decorator;

public abstract class PizzaDecoration implements IPizza{
    
    protected IPizza pizza;
    
    public PizzaDecoration(IPizza pizza){
        this.pizza = pizza;
    }
}
