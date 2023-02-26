package partie_4;




public class Tasse {
    // quantité de liquide max ds une tasse
    double quantiteCafeMax;
         Cafe cafe;

    Tasse(){
        this.quantiteCafeMax = 100;
    }

    Tasse(float quantiteCafeMax){
        this.quantiteCafeMax = quantiteCafeMax;

    }

    public double boire(double quantiteBu)
    {
        cafe.quantiteLiquideMl -= quantiteBu ;
        return cafe.quantiteLiquideMl ;

    }

    public void boire()
    {
        cafe.quantiteLiquideMl  = 0;
    }

    public double getEspaceDisponible() {
        if(cafe == null)
            return quantiteCafeMax ;
        else
            return quantiteCafeMax - cafe.quantiteLiquideMl ;
    }

    public void addCafe(Cafe commandeCafe) {
        if(cafe == null) {
            cafe = commandeCafe ;
        } else {
            cafe.quantiteLiquideMl += commandeCafe.quantiteLiquideMl ;
            if(cafe.typeCafe != commandeCafe.typeCafe)
                cafe.typeCafe = TypeCafe.BATARD ;
        }

        checkQuantite() ;
    }

    public void checkQuantite() {
        if(cafe == null)
            return ;
        if(cafe.quantiteLiquideMl > quantiteCafeMax) {
            cafe.quantiteLiquideMl = quantiteCafeMax ;
            System.out.println("Il y a trop de cafe dans la tasse !");
        }

    }


}
