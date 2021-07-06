package observables;

import observers.Observer;

public interface Observable {
     void subscribe(Observer observer);
     void unSubscribe(Observer observer);
    void notifyObserver();

}
