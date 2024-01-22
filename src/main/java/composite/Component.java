package composite;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    public String tab(){
        String tab = "";
        for(int i=0;i<level;i++){
            tab = tab + "\t";
        }
        return tab;
    }

    public int getLevel(){
        return level;
    }

    public abstract void afficher();
}
