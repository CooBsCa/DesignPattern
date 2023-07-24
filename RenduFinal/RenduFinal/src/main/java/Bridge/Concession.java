package Bridge;

import Vehicules.Vehicule;

import java.util.List;

public interface Concession {
    public void Add(Vehicule vehicule);
    public void Remove(Vehicule vehicule);
    public List<Vehicule> getVehicules();
    public void afficheVehicules();
}
