package composite;

public class File extends Component{
    public File(String name) {
        super(name);
    }
    @Override
    public void afficher() {
        System.out.println(tab()+"==> "+name);
    }
}
