package decorator.ingredients;

import decorator.boissons.Boisson;

public class Chocolat extends IngredientDeco{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+"Au Chocolat";
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }
}
