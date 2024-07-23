package coffemachine;

public class Coffee {
    private CoffeeType coffeeType;

    public Coffee(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getType() {
        return this.coffeeType.name();
    }
}
