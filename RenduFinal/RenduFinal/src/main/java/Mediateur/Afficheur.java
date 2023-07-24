package Mediateur;

import Bridge.ConcessionImpl;

public interface Afficheur {
    void setAfficheur(String afficheurSelectionne);
    Affiche getAffiche();
}
