package observers;

import observables.Observable;

public interface Observer {
    public void update(Observable observable);
}
