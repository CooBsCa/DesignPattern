package Vehicules;

public class VoitureThermique extends Voiture{
    private static final String energie = "Thermique";
    public VoitureThermique(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix, energie);
    }
}
