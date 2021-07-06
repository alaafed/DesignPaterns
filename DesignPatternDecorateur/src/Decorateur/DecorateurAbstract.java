package Decorateur;

import composants.Boisson;

public abstract class DecorateurAbstract extends Boisson {
    protected Boisson boisson;

    public DecorateurAbstract(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();

}
