package partie_2;

public class Cafe {

    public TypeCafe typeCafe;
    public double quantiteLiquideMl;

    Cafe()
    {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }


    Cafe(TypeCafe typecafe, double quantite)
    {

        this.typeCafe = typecafe;
        this.quantiteLiquideMl = quantite;
    }


}

