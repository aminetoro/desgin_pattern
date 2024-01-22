package decorator;

import decorator.boissons.Boisson;
import decorator.boissons.Espresso;
import decorator.ingredients.Chocolat;
import decorator.ingredients.Lait;

public class Mainapp {
    public static void main(String[] args) {
        Boisson espresso = new Espresso();
        espresso = new Lait(espresso);
        System.out.println(espresso.getDescription());
        espresso = new Chocolat(espresso);
        System.out.println(espresso.getDescription());
    }
}
