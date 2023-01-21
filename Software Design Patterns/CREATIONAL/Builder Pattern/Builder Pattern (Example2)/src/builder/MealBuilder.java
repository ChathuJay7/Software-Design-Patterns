
package builder;

public abstract class MealBuilder {
    public abstract void addCurry();
    public abstract void addBread();
    public abstract void addCoolDrink();
    public abstract void addBriryani();
    public abstract Meal build();
}
