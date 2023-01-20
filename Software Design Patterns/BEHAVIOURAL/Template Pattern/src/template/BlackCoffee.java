
package template;

public class BlackCoffee extends CoffeeProduction{

    @Override
    void addWater() {
        System.out.println("Add boiled 100ml water");
    }

    @Override
    void addMilk() {
        System.out.println("Do not add milk");
    }

    @Override
    void addCoffee() {
        System.out.println("Add coffee 50ml");
    }

    @Override
    void addFlavours() {
        System.out.println("Do not add sugar");
    }
    
}
