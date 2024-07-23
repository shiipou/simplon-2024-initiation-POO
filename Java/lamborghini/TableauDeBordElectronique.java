package lamborghini;

public class TableauDeBordElectronique {

    private boolean state;

    public TableauDeBordElectronique() {
        this.state = false;
    }

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
