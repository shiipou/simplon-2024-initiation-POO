package lamborghini;

public abstract class Vehicule implements SeDeplace {
    private String name;

    public Vehicule(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void start();
    public abstract void stop();

}
