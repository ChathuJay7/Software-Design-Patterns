
package builder;

public class Main {

    public static void main(String[] args) {
        
        
        
        Meal vegMeal = new MealDirector(new VegMealBuilder()).prepareMeal();
        
        System.out.println("Veg Meal");
        System.out.println("Curry : " + vegMeal.getCurry());
        System.out.println("Bread : " + vegMeal.getBread());
        System.out.println("Cool Drink : " + vegMeal.getCoolDrink());
        System.out.println("Biriyani : " + vegMeal.getBiriyani());

        
        
        
        Meal nonVegMeal = new MealDirector(new NonVegMealBuilder()).prepareMeal();
        
        System.out.println("\n\nNon Veg Meal");
        System.out.println("Curry : " + nonVegMeal.getCurry());
        System.out.println("Bread : " + nonVegMeal.getBread());
        System.out.println("Cool Drink : " + nonVegMeal.getCoolDrink());
        System.out.println("Biriyani : " + nonVegMeal.getBiriyani());
        
    }
    
}
