package Vehicules;

public class Voiture extends Vehicule{
    private static final String typeDeVehicule = "Voiture";
    public Voiture(String marque, String couleur, int puissance, int prix, String energie) {
        super(marque, typeDeVehicule, couleur, puissance, prix, energie);
    }
}
