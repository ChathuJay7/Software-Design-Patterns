
package template;

public abstract class CoffeeProduction {
    
    abstract void addWater();
    abstract void addMilk();
    abstract void addCoffee();
    abstract void addFlavours();
    
    public final void makeCoffee(){
        addWater();
        addMilk();
        addCoffee();
        addFlavours();
    }
}
