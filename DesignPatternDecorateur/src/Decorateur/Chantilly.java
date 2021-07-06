package Decorateur;

import composants.Boisson;

public class Chantilly extends DecorateurAbstract {


    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.7+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" avec Chantilly";
    }
}
