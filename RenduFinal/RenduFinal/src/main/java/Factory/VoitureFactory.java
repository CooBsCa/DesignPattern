package Factory;

import Builders.VoitureBuilder;
import Vehicules.Vehicule;
import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class VoitureFactory implements VehiculeFactory{

    @Override
    public List<Vehicule> creerVehicule(int nbVehiculeACreer) {
        List<Vehicule> vehicules = new ArrayList<>();
        for (int i = 0; i < nbVehiculeACreer; i++) {
            List randomData = new TraitementsDecorator().generateRandomDataVoiture();
            if (randomData.get(0).equals(0)){
                vehicules.add(new VoitureBuilder().buildVoitureThermique(randomData.get(1).toString(),
                        randomData.get(2).toString(),(Integer) randomData.get(3),(Integer) randomData.get(4)));
            } else {
                vehicules.add(new VoitureBuilder().buildVoitureThermique(randomData.get(1).toString(),
                        randomData.get(2).toString(),(Integer) randomData.get(3),(Integer) randomData.get(4)));
            }
        }
        return vehicules;
    }
}
