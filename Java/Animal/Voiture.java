package Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Application {
    public static void main(String[] args) {
        List<Voiture> mesVoitures = new ArrayList<>();

        Voiture voitureT = new Voiture(null, "rouge");
        mesVoitures.add(voitureT);

        Voiture voitureF = new Voiture("Farery", "rouge");
        mesVoitures.add(voitureF);

        voitureT.start();
        voitureF.crash(voitureT);
        voitureT.stop();

        VoitureElectrique voitureE = new VoitureElectrique("Tasla", "Blanche", 3000);
        mesVoitures.add(voitureE);

        voitureE.charge(30);

        voitureF.crash(voitureE);

        Volant avion = new AvionCommercial();
        if(avion instanceof AvionCommercial) {
            System.out.println("L'avion va partir");
        }
        avion.voler();
    }
}

abstract class Vehicule {

}

class Moteur {
    public void demarrer() {
        System.out.println("Le moteur démarre.");
    }
    public void arreter(){
        System.out.println("Le moteur s'arrête.");
    }
}

/**
 * Voiture
 */
public class Voiture extends Vehicule {

    private String marque;
    private String couleur;

    private List<Voiture> constats;

    // Composants
    private Moteur moteur;


    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.constats = new ArrayList<>();

        this.moteur = new Moteur();
    }

    public Optional<String> getMarque() {
        return this.marque != null ? Optional.of(this.marque) : Optional.empty();
    }
    public void start(){
        this.moteur.demarrer();
        System.out.println("La voiture "+ this.getMarque().orElse("Custom") +" démarre.");
    }

    public void stop() {
        this.moteur.arreter();
        System.out.println("La voiture "+ this.marque +" s'arrête.");
    }

    public void crash(Voiture voitureVictime) {
        System.out.println("La voiture "+ this.marque +" crash sur la voiture "+ voitureVictime.marque +".");
        voitureVictime.constats.add(this);
        this.constats.add(voitureVictime);
        System.out.println("Cette voiture a "+ this.constats.size() +" a son actif.");
    }

    public void crash(VoitureElectrique voitureVictime){
        System.out.println("La voiture "+ this.marque +" crash sur la voiture "+ voitureVictime.getMarque().orElse("Custom") +".");
        System.out.println("La batterie explose.");
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public List<Voiture> getConstats() {
        return constats;
    }

    public void setConstats(List<Voiture> constats) {
        this.constats = constats;
    }

    public int getNombreConstats(){
        return this.constats.size();
    }

    public Boolean hasConstatWith(Voiture voiture) {
        return this.constats.contains(voiture);
    }

    public void addConstat(Voiture voiture) {
        this.constats.add(voiture);
    }

}

/**
 * VoitureElectrique Véhicule qui roule grace a une batterie et non a l'essence.
 */
class VoitureElectrique extends Voiture {
    
    private int batteryCapacity;


    public VoitureElectrique(String marque, String couleur, int batteryCapacity) {
        super(marque, couleur);

        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    public void charge(int minutes) {
        System.out.println("La Voiture "+ this.getMarque().orElse("Custom") +" recharge pendant "+minutes+ " minutes.");
    }

    
}


interface Volant {
    public default void voler() {

    }
}

abstract class Avion extends Vehicule implements Volant {

    private Moteur moteur;

    public Avion() {
        this.moteur = new Moteur();
    }

    @Override
    public void voler() {
        System.out.println("L'avion vole dans le ciel.");
    }

    public void demarrer() {
        this.moteur.demarrer();
        System.out.println("Le moteur de l'avion démarre.");
    }
    
}

class AvionCommercial extends Avion {

}

class AvionDePlaisance extends Avion {

}
