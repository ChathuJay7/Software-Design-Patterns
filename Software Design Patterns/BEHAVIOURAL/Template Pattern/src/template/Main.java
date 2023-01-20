
package template;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cappuccinos");
        CoffeeProduction cappuccinos = new Cappuccinos();
        cappuccinos.makeCoffee();
        
        System.out.println("\nLatte");
        CoffeeProduction latte = new Latte();
        latte.makeCoffee();
        
        System.out.println("\nBlack Coffee");
        CoffeeProduction blackCoffee = new BlackCoffee();
        blackCoffee.makeCoffee();
        
        System.out.println("\nNescafe");
        CoffeeProduction nescafe = new Nescafe();
        nescafe.makeCoffee();
    }
    
}
