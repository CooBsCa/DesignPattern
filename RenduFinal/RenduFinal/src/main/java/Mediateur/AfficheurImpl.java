package Mediateur;

import Bridge.ConcessionImpl;

public class AfficheurImpl implements Afficheur {
    private Affiche affiche;
    @Override
    public void setAfficheur(String afficheurSelectionne) {
        switch (afficheurSelectionne){
            case "AfficheurDeStockConcession":
                this.affiche = new AfficheurDeStockConcession();
                affiche.setAfficheur(this);
                break;
            case "AfficheurDeStockMarque":
                this.affiche = new AfficheurDeStockMarque();
                affiche.setAfficheur(this);
                break;
            default:
                System.out.println("Afficheur non reconnu");
        }
    }

    @Override
    public Affiche getAffiche() {
        return this.affiche;
    }
}
