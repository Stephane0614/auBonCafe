package partie_1;

public class Cafetiere {
    public void remplirTasse(Tasse tasse) {
        tasse.cafe = new Cafe(TypeCafe.MOKA, tasse.quantiteCafeMax);

    }

    public void remplirTasse(Tasse tasse, TypeCafe typeCafe, double quantité) {
        tasse.cafe = new Cafe(typeCafe, quantité);
    }
}
