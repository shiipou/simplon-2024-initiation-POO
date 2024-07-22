import java.util.Optional;

class Application {
    public static void main(String[] args) {
        Voiture voitureT = new Voiture(null, "rouge");
        Voiture voitureF = new Voiture("Farery", "rouge");

        voitureT.start();
        voitureF.crash(voitureT);
        voitureT.stop();

        VoitureElectrique voitureE = new VoitureElectrique("Tasla", "Blanche", 3000);

        voitureE.charge(30);

        voitureF.crash(voitureE);
    }
}

/**
 * Voiture
 */
public class Voiture {

    private String marque;
    private String couleur;

    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    public Optional<String> getMarque() {
        return this.marque != null ? Optional.of(this.marque) : Optional.empty();
    }
    public void start(){
        System.out.println("La voiture "+ this.getMarque().orElse("Custom") +" démarre.");
    }

    public void stop() {
        System.out.println("La voiture "+ this.marque +" s'arrête.");
    }

    public void crash(Voiture voitureVictime) {
        System.out.println("La voiture "+ this.marque +" crash sur la voiture "+ voitureVictime.marque +".");
    }

    public void crash(VoitureElectrique voitureVictime){
        System.out.println("La voiture "+ this.marque +" crash sur la voiture "+ voitureVictime.getMarque().orElse("Custom") +".");
        System.out.println("La batterie explose.");
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
