package partie_4;


public class Cafetiere {
    public void remplirTasse(Tasse tasse) {
        tasse.cafe = new Cafe(TypeCafe.MOKA, tasse.quantiteCafeMax);

    }

    public void remplirTasse(Tasse tasse, TypeCafe typeCafe, double quantite) {
        tasse.cafe = new Cafe(typeCafe, quantite);
    }
}
