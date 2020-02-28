package lab.assignment.afterrefactoring.clientcode;
import lab.assignment.afterrefactoring.CoffeeTemplate;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new Mocha();

        coffeeType.makeCoffee();
        System.out.println("************");

        coffeeType = new Cappuccino();
        coffeeType.buildHouse();

        System.out.println("************");

        coffeeType = new Americano();
        coffeeType.buildHouse();
    }

}
