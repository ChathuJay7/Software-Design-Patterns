
package builder;

public class MealDirector {
    
    private MealBuilder mealBuilder;
    
    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }
    
    public Meal prepareMeal(){
        mealBuilder.addCurry();
        mealBuilder.addBread();
        mealBuilder.addCoolDrink();
        mealBuilder.addBriryani();
        
        return mealBuilder.build();
    }
}
