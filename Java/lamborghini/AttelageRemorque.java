package lamborghini;

public class AttelageRemorque {

    private Remorque remorqueAttache;

    public void attache(Remorque remorque) {
        this.remorqueAttache = remorque;
    }

    public Remorque getRemorqueAttache() {
        return this.remorqueAttache;
    }
}
