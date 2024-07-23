package lamborghini;

public class Voiture extends Vehicule implements Roule, WithGearBox {

    private Moteur moteur;
    private TableauDeBordElectronique tableauDeBord;
    private BoiteDeVitesse boiteDeVitesse;

    public Voiture(String name) {
        super(name);

        this.moteur = new Moteur();
        this.tableauDeBord = new TableauDeBordElectronique();
        this.boiteDeVitesse = new BoiteDeVitesse(6);
    }
    
    @Override
    public void setGear(int gear) {
        this.boiteDeVitesse.setGear(gear);
    }

    @Override
    public void start() {
        this.tableauDeBord.start();
        if(this.boiteDeVitesse.isNeutral()) {
            this.moteur.start();
        } else {
            throw new IllegalStateException("Le moteur calle car une vitesse est enclanché.");
        }
    }

    @Override
    public void stop() {
        this.tableauDeBord.stop();
        this.moteur.stop();
    }

    @Override
    public boolean canMove() {
        return this.tableauDeBord.isOn() && this.moteur.isOn() && !this.boiteDeVitesse.isNeutral();
    }

}
