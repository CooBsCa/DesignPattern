package Vehicules;

public class MotoThermique extends Moto{
    private static final String energie = "Thermique";
    public MotoThermique(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix, energie);
    }
}
