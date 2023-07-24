package Bridge;

import Vehicules.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class ConcessionImpl implements Concession {
    List<Vehicule> vehicules = new ArrayList<Vehicule>();
    @Override
    public void Add(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    @Override
    public void Remove(Vehicule vehicule) {
        vehicules.remove(vehicule);
    }

    @Override
    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    @Override
    public void afficheVehicules() {
        for (Vehicule vehicule : vehicules) {
            vehicule.afficheCaracteristiques();
        }
    }
}
