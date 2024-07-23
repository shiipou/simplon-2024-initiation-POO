package lamborghini;

public interface Roule extends SeDeplace {

    @Override
    public default void move() {
        if(this.canMove()) {
            System.out.println("Roule.");
        } else {
            System.out.println("Rien ne se passe.");
        }
    }
}
