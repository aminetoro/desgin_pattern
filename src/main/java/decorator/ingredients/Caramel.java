package decorator.ingredients;

import decorator.boissons.Boisson;

public class Caramel extends IngredientDeco {

    public Caramel(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+"Au Caramel";
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }
}
