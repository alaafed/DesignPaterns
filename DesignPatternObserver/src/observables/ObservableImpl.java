package observables;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int etat;
    private List<Observer> observers= new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
    observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(this);
        }

    }

    public int getEtat(){
    return etat;
    }

    public void setEtat(int etat){
    this.etat=etat;
    this.notifyObserver();
    }


}
