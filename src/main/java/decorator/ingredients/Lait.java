package decorator.ingredients;

import decorator.boissons.Boisson;

public class Lait extends IngredientDeco{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"Au lait";
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }

}
