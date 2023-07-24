import Bridge.Concession;
import Bridge.ConcessionImpl;
import Factory.MotoFactory;
import Factory.VehiculeFactory;
import Factory.VoitureFactory;
import Mediateur.Affiche;
import Mediateur.Afficheur;
import Mediateur.AfficheurImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de vehicules voulez-vous créer ? ");
        int nbVehiculeACreer = scanner.nextInt();
        //scanner.close();

        ConcessionImpl concession = new ConcessionImpl();
        VehiculeFactory vehiculeFactory = new VoitureFactory();
        vehiculeFactory.creerVehicule(nbVehiculeACreer).forEach(concession::Add);
        vehiculeFactory = new MotoFactory();
        vehiculeFactory.creerVehicule(nbVehiculeACreer).forEach(concession::Add);

        Afficheur afficheur = new AfficheurImpl();
        System.out.println("Si vous voulez afficher le stock de la concession, tapez 1");
        System.out.println("Si vous voulez afficher le stock d'une marque, tapez 2");
        int choix = scanner.nextInt();
        Affiche affiche;
        switch (choix){
            case 1:
                afficheur.setAfficheur("AfficheurDeStockConcession");
                affiche = afficheur.getAffiche();
                affiche.affiche(concession,null);
                break;
            case 2:
                System.out.println("De quelle marque voulez-vous afficher le stock ?");
                String marque = scanner.next();
                afficheur.setAfficheur("AfficheurDeStockMarque");
                affiche = afficheur.getAffiche();
                affiche.affiche(concession,marque);
                break;
            default:
                System.out.println("Choix non reconnu");
        }

    }
}
