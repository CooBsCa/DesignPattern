package Vehicules;

public class MotoElectrique extends Moto{
    private static final String energie = "Electrique";
    public MotoElectrique(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix, energie);
    }
}
