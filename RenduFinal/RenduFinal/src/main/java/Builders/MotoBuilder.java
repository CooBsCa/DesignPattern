package Builders;


import Vehicules.MotoElectrique;
import Vehicules.MotoThermique;

public class MotoBuilder {
    public MotoThermique buildMotoThermique(String marque, String couleur, int puissance, int prix) {
        return new MotoThermique(marque, couleur, puissance, prix);
    }

    public MotoElectrique buildMotoElectrique(String marque, String couleur, int puissance, int prix) {
        return new MotoElectrique(marque, couleur, puissance, prix);
    }
}
