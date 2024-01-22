package composite;

import java.util.ArrayList;

public class Folder extends Component{

    ArrayList<Component> components = new ArrayList<Component>();
    public Folder(String name) {
        super(name);
    }
    @Override
    public void afficher() {
        System.out.println(tab()+"==> "+name);
        for(Component component:components){
           component.afficher();
        }
    }

    public Component addElement(Component component){
        int level = getLevel()+1;
        components.add(component);
        component.level = level;
        return component;
    }
}
