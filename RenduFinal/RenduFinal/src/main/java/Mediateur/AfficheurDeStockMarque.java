package Mediateur;

import Bridge.ConcessionImpl;

public class AfficheurDeStockMarque implements Affiche{
    private Afficheur afficheur;
    @Override
    public void setAfficheur(Afficheur afficheur) {
        this.afficheur = afficheur;
    }

    @Override
    public String getAfficheType() {
        return null;
    }

    @Override
    public void affiche(ConcessionImpl concession, String marque) {
        afficheStockMarque(concession, marque);
    }

    public void afficheStockMarque(ConcessionImpl concession, String marque){
        for (int i = 0; i < concession.getVehicules().size(); i++) {
            if (concession.getVehicules().get(i).getMarque().equals(marque)){
                concession.getVehicules().get(i).afficheCaracteristiques();
            }
        }
    }
}
