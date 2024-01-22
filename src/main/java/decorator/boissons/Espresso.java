package decorator.boissons;

public class Espresso extends Boisson{

    public Espresso() {
        this.description = "espresso";
    }

    @Override
    public double cout() {
        return 16;
    }
}
