package partie_4;

import javax.swing.*;


import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainPart4 {
    public static void main(String[] args) {
// Étape 1

        Restaurant  restaurant = new Restaurant();


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
        Cafe cafe = new Cafe(choixCafe,  quantiteCafe);
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


//        public class Cafe {
//
//            public static void main(String[] args) {
//                // Etape 1 : Demander le nom du client
//                String nomClient = JOptionPane.showInputDialog(null, "Bonjour, quel est votre nom ?");
//
//                // Demander si on peut prendre la commande
//                int reponse = JOptionPane.showConfirmDialog(null, "Bonjour " + nomClient + ", voulez-vous passer une commande ?");
//
//                // Si la réponse est non, sortir du programme
//                if (reponse == JOptionPane.NO_OPTION || reponse == JOptionPane.CLOSED_OPTION) {
//                    JOptionPane.showMessageDialog(null, "D'accord, à une prochaine fois !");
//                    System.exit(0);
//                }
//
//                // Etape 2 : Demander le type de café
//                TypeCafe[] typesCafe = TypeCafe.values();
//                String[] optionsCafe = new String[typesCafe.length];
//                for (int i = 0; i < typesCafe.length; i++) {
//                    optionsCafe[i] = typesCafe[i].name();
//                }
//                String typeCafeChoisi = (String) JOptionPane.showInputDialog(null, "Quel type de café voulez-vous ?", "Choix du café", JOptionPane.PLAIN_MESSAGE, null, optionsCafe, optionsCafe[0]);
//
//                // Vérifier que le type de café n'est pas "BATARD"
//                if (typeCafeChoisi.equals("BATARD")) {
//                    JOptionPane.showMessageDialog(null, "Désolé, nous ne servons pas ce type de café.");
//                    System.exit(0);
//                }
//
//                TypeCafe typeCafe = TypeCafe.valueOf(typeCafeChoisi);
//
//                // Etape 3 : Demander si le client a sa propre tasse
//                boolean possedeTasse = JOptionPane.showConfirmDialog(null, "Avez-vous votre propre tasse ?") == JOptionPane.YES_OPTION;
//
//                int tailleTasse = 0;
//                if (!possedeTasse) {
//                    // Si le client n'a pas sa propre tasse, calculer la taille
//                    tailleTasse = (int) Math.ceil(quantiteCafe() / 100);
//                    JOptionPane.showMessageDialog(null, "Nous vous fournirons une tasse de " + tailleTasse + " cl.");
//                } else {
//                    // Sinon, demander la taille de la tasse
//                    String[] optionsTailleTasse = {"10 cl", "15 cl", "20 cl", "25 cl"};
//                    tailleTasse = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Quelle est la taille de votre tasse ?", "Taille de la tasse", JOptionPane.PLAIN_MESSAGE, null, optionsTailleTasse, optionsTailleTasse[0]).split(" ")[0]);
//                }
//
//                // Etape 4 : Demander la quantité de café
//                int quantiteCafe = quantiteCafe();
//
//                // Etape 5 : Calculer le coût et demander le paiement
//                Cafe cafe = possedeTasse ? new Cafe(typeCafe, quantiteCafe, tailleTasse) : new Cafe(typeCafe, quantiteCafe);
//                int cout = cafe.calculerCout();
//                String montantPayeStr = JOptionPane.showInputDialog(null, "Le coût total est de " + (cout / 100) + "." + (cout % 100) + " €
//
//            }
