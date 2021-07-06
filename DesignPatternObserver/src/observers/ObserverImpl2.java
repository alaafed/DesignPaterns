package observers;

import observables.Observable;
import observables.ObservableImpl;

public class ObserverImpl2 implements Observer {
    double lastState;
    @Override
    public void update(Observable observable) {
        int etat=((ObservableImpl)observable).getEtat();
    if (etat-lastState>0)
        System.out.println("Observateur 2 = > Ahgmentation de la pression");
    else if (etat-lastState<0)
        System.out.println("depression");
    else
        System.out.println("Observateur 2 = > stabelite");
    lastState=etat;
    }
}
