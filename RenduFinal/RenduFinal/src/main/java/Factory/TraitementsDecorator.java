package Factory;

import java.util.List;
import java.util.Random;

public class TraitementsDecorator {
    public List generateRandomDataVoiture() {
        int prix = new Random().nextInt(30000);
        String marque = MarqueDeVoiture.values()[new Random().nextInt(MarqueDeVoiture.values().length)].toString();
        String couleur = Couleur.values()[new Random().nextInt(Couleur.values().length)].toString();
        int puissance = new Random().nextInt(300);
        int random = new Random().nextInt(2);
        return List.of(random, marque, couleur, puissance, prix);
    }

    public List generateRandomDataMoto() {
        int prix = new Random().nextInt(15000);
        String marque = MarqueDeMoto.values()[new Random().nextInt(MarqueDeVoiture.values().length)].toString();
        String couleur = Couleur.values()[new Random().nextInt(Couleur.values().length)].toString();
        int puissance = new Random().nextInt(100);
        int random = new Random().nextInt(2);
        return List.of(random, marque, couleur, puissance, prix);
    }
}
