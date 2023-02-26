//package partie_4;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.TimerTask;
//
//public class MartinLeServeur {
//
//    public static Boolean ClientIsReady(Restaurant restaurant) {
//        JFrame frame = new JFrame();
//        String clientName = JOptionPane.showInputDialog(frame, "bonjour, bienvenu au " + restaurant.nom + " quel est votre nom ?");
//        if (clientName != null) {
//            int isClientReady = JOptionPane.showConfirmDialog(null, "enchanté " + clientName + " je peu prendre votre commande ?");
//            if (isClientReady % 2 == 0) {
//
//                JOptionPane.showMessageDialog(null,  "tres bien " + clientName + " je vous ecoute !");
//                MartinLeServeur.getCommande();
//                return true;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "tres bien " + clientName + " prenez votre temps , je reviens dans un instant ");
////        System.out.println();
//        return false;
//    }
//
//
//    public static Boolean getCommande(String name) {
//
//        int haveOwnTasse = JOptionPane.showConfirmDialog(null, "enchanté " + name + " je peu prendre votre commande ?");
//        if(haveOwnTasse % 2 == 0)
//        {
//
//
//        }
//
//        System.out.println("commande");
//
//        return  false;
//    }
//}
//


