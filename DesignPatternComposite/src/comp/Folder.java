package comp;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {

    private List<Composant> childs=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Composant addComponent(Composant composant){
        composant.level=this.level+1;
        childs.add(composant);

        return composant;
    }

    @Override
    public void show() {
        System.out.println(tab()+"Folder :"+name);
        for(Composant c:childs){
            c.show();
        }
    }

}
