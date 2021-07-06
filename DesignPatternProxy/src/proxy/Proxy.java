package proxy;

import metier.Imetier;
import metier.ImetierImpl;

public class Proxy implements Imetier {
    private ImetierImpl imetier;

    @Override
    public double calcul() {
        if (imetier == null) imetier=new ImetierImpl();
        System.out.println("Ouverture d'une transaction");
        double res;
        try {
             res= imetier.calcul();
            System.out.println("Commit");
        }catch (Exception e){
            System.out.println("Roll back");
            throw (e);
        }

        return res;
    }
}
