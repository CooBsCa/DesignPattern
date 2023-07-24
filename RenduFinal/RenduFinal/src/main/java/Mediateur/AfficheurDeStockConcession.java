package Mediateur;

import Bridge.Concession;
import Bridge.ConcessionImpl;

public class AfficheurDeStockConcession implements Affiche {
    private Afficheur afficheur;

    @Override
    public void setAfficheur(Afficheur afficheur) {
        this.afficheur = afficheur;
    }

    @Override
    public String getAfficheType() {
        return "AfficheurDeStockConcession";
    }

    @Override
    public void affiche(ConcessionImpl concession, String marque){
        afficheStockConcession(concession);
    }

    protected void afficheStockConcession(ConcessionImpl concession){
        System.out.println("Stock de la concession : " + concession.getVehicules());
    }
}
