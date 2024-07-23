package lamborghini;

public class BoiteDeVitesse {

    private int currentGear;
    private int nbGears;

    public BoiteDeVitesse(int nbGears) {
        this.currentGear = 0;
        this.nbGears = nbGears;
    }

    public int getGear() {
        return this.currentGear;
    }

    public boolean isNeutral() {
        return this.currentGear == 0;
    }

    public void setGear(int gear) {
        if(gear <= this.nbGears && gear >= 0){
            this.currentGear = gear;
        }
    }

}
