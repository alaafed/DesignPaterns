package Decorateur;

import composants.Boisson;

public class Caramel extends DecorateurAbstract {


    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.8+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Caramel";
    }
}
