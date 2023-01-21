
package builder;

public class Main {

    public static void main(String[] args) {
        
        Burger burger = new Burger.BurgerBuilder()
                                    .size("Large")
                                    .egg(true)
                                    .extraCheese(true)
                                    .mayonese(true)
                                    .lettuce(true)
                                    .onion(true)
                                    .build();
        
        System.out.println("Burger Creation");
        System.out.println("\nSize : " + burger.getSize());
        System.out.println("Eggs : " + burger.isEgg());
        System.out.println("Extra Cheese : " + burger.isExtraCheese());
        System.out.println("Mayonese : " + burger.isMayonese());
        System.out.println("Lettuce : " + burger.isLettuce());
        System.out.println("Onion : " + burger.isOnion());
    }
    
}
