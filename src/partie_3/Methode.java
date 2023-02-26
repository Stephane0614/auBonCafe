package partie_3;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Random;


public class Methode {
  public static  Client getClient()
  {
      Random random = new Random();
     String clientName = BanqueDeDonne.listeNoms.get(random.nextInt(BanqueDeDonne.listeNoms.size()));
     Cafe commande = BanqueDeDonne.listeCommandes.get(random.nextInt(BanqueDeDonne.listeCommandes.size()));
     Tasse tasse = BanqueDeDonne.listeTasses.get(random.nextInt(BanqueDeDonne.listeTasses.size()));
      return new Client(clientName, commande, tasse);
  }

//  methode qui retourne une liste de clients
    public static ArrayList<Client> getClientListe(int ClientNbr)
    {
        ArrayList<Client> clientListe = new ArrayList<Client>();
        for (int i = 0; i < ClientNbr ; i++)
        {
            clientListe.add(getClient());
        }
        return clientListe;
    };
// methode pour afficher les donnees client dans la console
  public static void  ViewDataList(ArrayList<Client> clientList)
  {
      for (Client client : clientList)
      {
          System.out.println(client.nom);
          System.out.println(client.commandeCafe.typeCafe );
          System.out.println( client.tasse.quantiteCafeMax);
      }
  }

  public static void  serviceListe(ArrayList<Client> listeClient, Restaurant[]  listeRestaurant,  ArrayList<Client> listClientExpluse)
  {
      Random rand = new Random();

      for(Client client : listeClient) {
          boolean expulse = listeRestaurant[rand.nextInt(listeRestaurant.length)].servir(client) ;

          if(expulse) {
              listClientExpluse.add(client) ;
          }
      }
  }

  public  static void viewRestaurantInfo(Restaurant[] listeRestaurants, ArrayList<Client> listeClientExpulser)
  {
      for(Restaurant restaurant : listeRestaurants)
      {
          System.out.println("Le resto " + restaurant.nom + " a servit : " + restaurant.listeClientServi.size() + " clients et realiser " +   restaurant.profit + " euros de profit");
      }

      System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

      System.out.println("il y à " + listeClientExpulser.size() + " clients interdit d'entrer ici , voici leur noms : ");
      for (Client client : listeClientExpulser)
          System.out.println(client.nom);
  }

}
