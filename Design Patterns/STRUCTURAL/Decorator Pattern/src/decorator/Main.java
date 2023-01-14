
package decorator;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Basic Pizza");
        IPizza basicPizza = new BasicPizza();
        System.out.println("Flovour : " + basicPizza.getDescription());
        System.out.println("Price = " + basicPizza.getPrice());
        
        
        System.out.println("\nBasic Pizza + Cheese");
        IPizza cheesePizza = new Cheese(basicPizza);
        System.out.println("Flovour : " + cheesePizza.getDescription());
        System.out.println("Price = " + cheesePizza.getPrice());
        
        
        System.out.println("\nBasic Pizza + Chicken");
        IPizza chickenPizza = new Chicken(basicPizza);
        System.out.println("Flovour : " + chickenPizza.getDescription());
        System.out.println("Price = " + chickenPizza.getPrice());
        
        
        System.out.println("\nBasic Pizza + Cheese + Chicken");
        IPizza cheeseChickenPizza = new Cheese(chickenPizza);
        System.out.println("Flovour : " + cheeseChickenPizza.getDescription());
        System.out.println("Price = " + cheeseChickenPizza.getPrice());
        
        
        System.out.println("\nBasic Pizza + Cheese + Chicken + Tomato");
        IPizza cheeseChickenTomatoPizza = new Tomato(cheeseChickenPizza);
        System.out.println("Flovour : " + cheeseChickenTomatoPizza.getDescription());
        System.out.println("Price = " + cheeseChickenTomatoPizza.getPrice());
    }
    
}
