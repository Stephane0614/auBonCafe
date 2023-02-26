package partie_4;

import javax.swing.JOptionPane;
import javax.swing.JSlider;

public class MainPart4 {
    public static void main(String[] args) {
// Étape 1
        Restaurant restaurant = new Restaurant();
        String nomClient = JOptionPane.showInputDialog(null, "Bonjour, quel est votre nom ?");
        JOptionPane.showMessageDialog(null, "Bonjour " + nomClient + ", pouvez-vous me donner votre commande ?");

        // Étape 2
        TypeCafe[] typesCafe = TypeCafe.values();
        TypeCafe choixCafe = (TypeCafe) JOptionPane.showInputDialog(null, "Quel est votre type de café ?", "Choix du café", JOptionPane.QUESTION_MESSAGE, null, typesCafe, typesCafe[0]);
        if (choixCafe.name().equals("BATARD")) {
            JOptionPane.showMessageDialog(null, "Désolé, je vais vous demander de partir ");
            System.exit(0);
        }

        // Étape 3
        int reponseTasse = JOptionPane.showConfirmDialog(null, "Avez-vous votre propre tasse ?");
        boolean haveTasse = (reponseTasse == JOptionPane.YES_OPTION);
        int tailleCafe;
        if (haveTasse) {
            tailleCafe = Integer.parseInt(JOptionPane.showInputDialog(null, "Quelle est la taille de votre tasse (en ml) ?"));
        } else {
            tailleCafe = calculerTailleCafe(choixCafe.name());
        }

        // Étape 4
        JSlider slider = new JSlider(0, 500, 0);
        slider.setMajorTickSpacing(50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JOptionPane.showMessageDialog(null, slider, "Quantité de café (en ml)", JOptionPane.PLAIN_MESSAGE);
        int quantiteCafe = slider.getValue();

        // Étape 5
        Cafe cafe = new Cafe(choixCafe, quantiteCafe);
        double montant = cafe.calculerPrix(choixCafe, quantiteCafe);
        double montantPaye = Integer.parseInt(JOptionPane.showInputDialog(null, "Le prix de votre commande est " + montant + " centimes. Combien voulez-vous payer ?"));
        while (montantPaye != montant) {
            if (montantPaye > montant) {
                double rendu = montantPaye - montant;
                JOptionPane.showMessageDialog(null, "Merci, vous avez payé " + rendu + " centimes en trop. Voici votre monnaie.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Il vous reste " + (montant - montantPaye) + " centimes à payer.");
                montantPaye += Double.parseDouble(JOptionPane.showInputDialog(null, "Combien voulez-vous ajouter ?"));
            }
            if (montantPaye < montant) {
                JOptionPane.showMessageDialog(null, "Au voleur, au voleur ! Mais que fait la police ?");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Merci de votre visite !");
    }

    private static int calculerTailleCafe(String choixCafe) {
        int tailleCafe =
                switch (choixCafe) {
                    case "JAVA" -> 50;
                    case "MOKA" -> 100;
                    case "TYPICA" -> 150;
                    case "BOURBON" -> 200;
                    default -> 100;

                };
        return tailleCafe;

    }
}


