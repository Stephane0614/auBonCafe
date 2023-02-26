package partie_1;

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



}
