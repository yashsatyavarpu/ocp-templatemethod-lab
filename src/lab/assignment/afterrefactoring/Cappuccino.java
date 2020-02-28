package lab.assignment.afterrefactoring;

public class Cappuccino extends CoffeeTemplate {
    protected void addIngredients() {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    protected void finalTouch() {
        {
            System.out.println("Top with milk foam");
        }
    }
}
