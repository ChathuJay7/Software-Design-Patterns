
package decorator;

public class Chicken extends PizzaDecoration{

    Chicken(IPizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", chicken";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice() + 600;
    }
    
    
    
}
