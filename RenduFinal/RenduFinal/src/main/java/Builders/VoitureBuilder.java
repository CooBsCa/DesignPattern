package Builders;

import Vehicules.VoitureElectrique;
import Vehicules.VoitureThermique;

public class VoitureBuilder {
    public VoitureThermique buildVoitureThermique(String marque, String couleur, int puissance, int prix) {
        return new VoitureThermique(marque, couleur, puissance, prix);
    }

    public VoitureElectrique buildVoitureElectrique(String marque, String couleur, int puissance, int prix) {
        return new VoitureElectrique(marque, couleur, puissance, prix);
    }
}
