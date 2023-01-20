
package template;

public class Cappuccinos extends CoffeeProduction{

    @Override
    void addWater() {
        System.out.println("Add boiled 50ml water");
    }

    @Override
    void addMilk() {
        System.out.println("Add steamed milk and foamed milk 50ml");
    }

    @Override
    void addCoffee() {
        System.out.println("Add coffee 50ml");
    }

    @Override
    void addFlavours() {
        System.out.println("Add 5ml sugar");
    }
    
}
