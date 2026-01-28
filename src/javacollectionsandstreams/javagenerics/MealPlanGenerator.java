package javacollectionsandstreams.javagenerics;

interface MealPlan {
    void prepare();
}

class VegetarianMeal implements MealPlan {
    public void prepare() {
        System.out.println("Preparing Vegetarian Meal");
    }
}

class Meal<T extends MealPlan> {
    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void generate() {
        meal.prepare();
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> m = new Meal<>(new VegetarianMeal());
        m.generate();
    }
}