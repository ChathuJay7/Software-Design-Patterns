
package builder;

public class NonVegMealBuilder extends MealBuilder{

    private Meal meal;
    
    public NonVegMealBuilder(){
        meal = new Meal();
    }
    
    @Override
    public void addCurry() {
        meal.setCurry("NonVeg");
    }

    @Override
    public void addBread() {
        meal.setBread("Roti");
    }

    @Override
    public void addCoolDrink() {
        meal.setCoolDrink("Coke");
    }

    @Override
    public void addBriryani() {
        meal.setBiriyani("Chicken");
    }

    @Override
    public Meal build() {
        return meal;
    }
    
}
