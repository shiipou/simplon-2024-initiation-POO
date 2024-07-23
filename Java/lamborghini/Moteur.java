package lamborghini;

public class Moteur {

    private boolean state = false;

    public boolean isOn() {
        return this.state;
    }

    public void start() {
        this.state = true;
    }

    public void stop() {
        this.state = false;
    }

}
