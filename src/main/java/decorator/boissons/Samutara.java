package decorator.boissons;

public class Samutara extends Boisson{

    public Samutara() {
        this.description = "samutara";
    }
    @Override
    public double cout() {
        return 12;
    }
}
