
package template;

public class Nescafe extends CoffeeProduction{

    @Override
    void addWater() {
        System.out.println("Add boiled 50ml water");
    }

    @Override
    void addMilk() {
        System.out.println("Add boiled 50ml milk");
    }

    @Override
    void addCoffee() {
        System.out.println("Add Nescafe 50ml");
    }

    @Override
    void addFlavours() {
        System.out.println("Add 5ml sugar");
    }
    
}
