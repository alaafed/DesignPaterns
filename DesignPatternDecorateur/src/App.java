import Decorateur.Chocolat;
import Decorateur.Vanille;
import composants.Boisson;
import composants.Espresso;

public class App {
    public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------");
        boisson=new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------");

    }
    
}
