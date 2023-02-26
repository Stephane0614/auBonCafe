package partie_4;


public class Client {

    Tasse tasse;

    Cafe commandeCafe;

    String nom;

    double valeurFacture;

    Client(String nom) {
        this.nom = nom;

    }

    Client(String nom, Cafe commande, boolean haveTasse) {
        this.nom = nom;
        this.commandeCafe = commande;

        if (haveTasse) {
            this.tasse = new Tasse();
        }

    }

    Client(String nom, Cafe commande, Tasse tasse) {
        this.nom = nom;
        this.commandeCafe = commande;
        this.tasse = tasse;
    }

    Client() {
        this.nom = "Jean";
        this.tasse = new Tasse();

    }
}
