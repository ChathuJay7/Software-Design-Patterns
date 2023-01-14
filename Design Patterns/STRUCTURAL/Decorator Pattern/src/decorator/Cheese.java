
package decorator;

public class Cheese extends PizzaDecoration{

    Cheese(IPizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice() + 200;
    }
    
}
