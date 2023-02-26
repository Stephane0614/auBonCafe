package partie_3;

import java.util.ArrayList;

public class MainPart3 {
    public static void main(String[] args) {

        Restaurant resto1 = new Restaurant("Latte sur les rochers");
        Restaurant resto2 = new Restaurant("Une tasse de joie");
        Restaurant resto3 = new Restaurant();

        ArrayList<Client> listeClient1 = Methode.getClientListe(20);
        ArrayList<Client> listeClient2 = Methode.getClientListe(20);
        ArrayList<Client> listeClient3 = Methode.getClientListe(20);

//        Methode.ViewDataList(listeClient1);

        ArrayList<Client> listeClientExpulse = new ArrayList<Client>();

        Restaurant[] listeResto = new Restaurant[3];
        listeResto[0] = resto1;
        listeResto[1] = resto2;
        listeResto[2] = resto3;


        Methode.serviceListe(listeClient1, listeResto, listeClientExpulse);
        Methode.serviceListe(listeClient2, listeResto, listeClientExpulse);
        Methode.serviceListe(listeClient3, listeResto, listeClientExpulse);

        Methode.viewRestaurantInfo(listeResto, listeClientExpulse);
    }
}
