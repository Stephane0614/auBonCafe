package partie_4;

public class Cafe {

    private int quantiteCafe;
    private int tailleCafe;
    private boolean haveTasse;
    private String choixCafe;
    public TypeCafe typeCafe;
    public double quantiteLiquideMl;

    Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }

    Cafe(TypeCafe typecafe, double quantite) {

        this.typeCafe = typecafe;
        this.quantiteLiquideMl = quantite;
    }


    public Cafe(String choixCafe, boolean haveTasse, int tailleCafe, int quantiteCafe) {
        this.choixCafe = choixCafe;
        this.haveTasse = haveTasse;
        this.tailleCafe = tailleCafe;
        this.quantiteCafe = quantiteCafe;
    }

    public double calculerPrix(TypeCafe typeCafe, int quantiteCafe) {
        double prix = typeCafe.coutParMl * quantiteCafe;
        return prix;
    }
}
