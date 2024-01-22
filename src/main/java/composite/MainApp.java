package composite;

import composite.Component;
import composite.File;
import composite.Folder;


public class MainApp {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder viewInstance = new Folder("view");
        Folder controllerInstance = new Folder("controller");
        Folder models = (Folder) root.addElement(new Folder("models"));
        Folder views = (Folder) root.addElement(viewInstance);
        Folder controllers = (Folder) root.addElement(controllerInstance);
        File controllerUser = new File("userController.php");
        File controllerfile = (File) controllers.addElement(controllerUser);

        root.afficher();

    }
}