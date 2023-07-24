package Vehicules;

public class Vehicule {
    protected String marque;
    protected String typeDeVehicule;
    protected String couleur;
    protected int puissance;
    protected int prix;
    protected String energie;

    public Vehicule(String marque, String typeDeVehicule, String couleur, int puissance, int prix, String energie) {
        this.marque = marque;
        this.typeDeVehicule = typeDeVehicule;
        this.couleur = couleur;
        this.puissance = puissance;
        this.prix = prix;
        this.energie = energie;
    }

    @Override
    public String toString() {
        return  typeDeVehicule + " de la marque " + marque + " " + couleur + " de " + puissance +
                " chevaux, au prix de " + prix + " euros."  + "Ce véhicule fonctionne à l'énergie " + energie + "." ;
    }

    public void afficheCaracteristiques() {
        System.out.println(this.toString());
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeVehicule() {
        return typeDeVehicule;
    }

    public void setTypeDeVehicule(String typeDeVehicule) {
        this.typeDeVehicule = typeDeVehicule;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }
}
