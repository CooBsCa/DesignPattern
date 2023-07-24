package Mediateur;

import Bridge.ConcessionImpl;

public interface Affiche {
    void setAfficheur(Afficheur afficheur);
    String getAfficheType();
    void affiche(ConcessionImpl concession, String marque);
}
