package observers;

import observables.Observable;
import observables.ObservableImpl;

public class ObserverImpl1 implements Observer {
    private double somme;
    @Override
    public void update(Observable observable) {
        int etat=((ObservableImpl)observable).getEtat();
         somme+=etat;
        System.out.println("Observateur 1 Somme"+somme);
    }
}
