package partie_1;

public class Cafe {
    TypeCafe typeCafe;
    double quantiteLiquideMl;

    Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }

    Cafe(TypeCafe typecafe, double quantite) {

        this.typeCafe = typecafe;
        this.quantiteLiquideMl = quantite;
    }
}
