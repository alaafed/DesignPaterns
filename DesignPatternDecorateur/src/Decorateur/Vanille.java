package Decorateur;

import composants.Boisson;

public class Vanille extends DecorateurAbstract {


    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" avec Vanille";
    }
}
