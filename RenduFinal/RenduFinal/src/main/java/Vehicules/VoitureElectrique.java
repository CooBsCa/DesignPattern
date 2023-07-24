package Vehicules;

public class VoitureElectrique extends Voiture{
    private static final String energie = "Electrique";
    public VoitureElectrique(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix, energie);
    }
}
