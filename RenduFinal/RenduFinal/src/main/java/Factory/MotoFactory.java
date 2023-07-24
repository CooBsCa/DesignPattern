package Factory;

import Builders.MotoBuilder;
import Vehicules.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class MotoFactory implements VehiculeFactory{
    public List<Vehicule> creerVehicule(int nbVehiculeACreer) {
        List<Vehicule> vehicules = new ArrayList<>();
        List randomData = new TraitementsDecorator().generateRandomDataMoto();
        if (randomData.get(0).equals(0)){
            vehicules.add(new MotoBuilder().buildMotoThermique(randomData.get(1).toString(),
                    randomData.get(2).toString(),(Integer) randomData.get(3),(Integer) randomData.get(4)));
        } else {
            vehicules.add(new MotoBuilder().buildMotoElectrique(randomData.get(1).toString(),
                    randomData.get(2).toString(),(Integer) randomData.get(3),(Integer) randomData.get(4)));
        }
        return vehicules;
    }

}
