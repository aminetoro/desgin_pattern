package decorator.ingredients;

import decorator.boissons.Boisson;

public abstract class IngredientDeco extends Boisson {
    protected Boisson boisson;

    public IngredientDeco(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
