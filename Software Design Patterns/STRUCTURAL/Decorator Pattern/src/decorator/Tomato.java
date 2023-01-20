
package decorator;

public class Tomato extends PizzaDecoration{

    Tomato(IPizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", tomato";
    }

    @Override
    public float getPrice() {
        return pizza.getPrice() + 50;
    }
    
}
