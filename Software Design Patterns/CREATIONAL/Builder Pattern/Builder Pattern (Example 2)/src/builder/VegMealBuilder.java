
package builder;

public class VegMealBuilder extends MealBuilder{

    private Meal meal;
    
    public VegMealBuilder(){
        meal = new Meal();
    }
    
    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");
    }

    @Override
    public void addCoolDrink() {
        this.meal.setCoolDrink("Sprite");
    }

    @Override
    public void addBriryani() {
        this.meal.setBiriyani("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
    
}
