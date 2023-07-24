package Vehicules;

public class Moto extends Vehicule{
    private static final String typeDeVehicule = "Moto";
    public Moto(String marque, String couleur, int puissance, int prix, String energie) {
        super(marque, typeDeVehicule, couleur, puissance, prix, energie);
    }
}
