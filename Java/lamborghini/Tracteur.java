package lamborghini;

public class Tracteur extends Vehicule implements Roule, WithGearBox, WithAttlage {

    private AttelageRemorque attelage;
    private Moteur moteur;
    private BoiteDeVitesse boiteDeVitesse;

    public Tracteur(String name) {
        super(name);

        this.attelage = new AttelageRemorque();
        this.moteur = new Moteur();
        this.boiteDeVitesse = new BoiteDeVitesse(3);
    }

    
    @Override
    public void setGear(int gear) {
        this.boiteDeVitesse.setGear(gear);
    }
    
    @Override
    public boolean canMove() {
        return this.moteur.isOn() && !this.boiteDeVitesse.isNeutral();
    }

    @Override
    public void attacheRemorque(Remorque remorque) {
        this.attelage.attache(remorque);
    }

    @Override
    public boolean remorqueEstAttache() {
        return this.attelage.getRemorqueAttache() != null;
    }

    @Override
    public void start() {
        if(this.boiteDeVitesse.isNeutral()) {
            this.moteur.start();
        } else {
            throw new IllegalStateException("Le moteur calle car une vitesse est enclanché.");
        }
    }
    
    @Override
    public void stop() {
        this.moteur.stop();
    }
}
