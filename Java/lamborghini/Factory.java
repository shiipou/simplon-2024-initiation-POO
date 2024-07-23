package lamborghini;

public abstract class Factory {
    public abstract Vehicule creerVehicule(VehiculeChoice type);

    public static void main(String[] args) {
        Factory factory = new LamborghiniFactory();

        Vehicule voiture = factory.creerVehicule(LamborghiniVehiculeChoice.URUS);

        voiture.start();

        if(voiture instanceof WithGearBox) {
            WithGearBox voitureWithGearBox = (WithGearBox)voiture;
            voitureWithGearBox.setGear(1);
        }

        voiture.move();

        voiture.stop();

        Vehicule tracteur = factory.creerVehicule(LamborghiniVehiculeChoice.CRONO);

        tracteur.start();

        if(tracteur instanceof WithGearBox) {
            WithGearBox tracteurWithGearBox = (WithGearBox)tracteur;
            tracteurWithGearBox.setGear(1);
        }
        if(tracteur instanceof WithAttlage) {
            WithAttlage tracteurWithAttlage = (WithAttlage)tracteur;
            tracteurWithAttlage.attacheRemorque(new Remorque());
        }

        tracteur.move();

        tracteur.stop();

    }
}
