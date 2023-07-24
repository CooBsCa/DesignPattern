package Factory;

import Vehicules.Vehicule;

import java.util.List;

public interface VehiculeFactory {
    public List<Vehicule> creerVehicule(int nbVehiculeACreer);
}
