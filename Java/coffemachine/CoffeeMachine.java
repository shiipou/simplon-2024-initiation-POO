package coffemachine;

public class CoffeeMachine {
    
    private Grinder grinder;
    private BrewingUnit brewingUnit;

    public CoffeeMachine() {
        this.grinder = new Grinder();
        this.brewingUnit = new BrewingUnit();
    }

    public Coffee prepareCoffee(CoffeeType coffeeType) {
        grinder.grinder();
        brewingUnit.brew();
        return new Coffee(coffeeType);
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee coffee = coffeeMachine.prepareCoffee(CoffeeType.CAPUCCHINO);
        System.out.println(coffee.getType());
    }
}
