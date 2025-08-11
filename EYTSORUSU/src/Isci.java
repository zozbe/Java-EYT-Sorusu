public class Isci extends Ucret {



    public double setMaas(int primGunu, double primTL){
        if(primGunu > 5000 * 0.11 && primGunu < 5000 * 0.2){
            primTL = 5500 + (primTL * 0.11);
        } else if(primGunu > 5000 * 0.21 && primGunu < 5000 * 0.5){
            primTL=6750 + (primTL * 0.13);
        }
        return primTL;
    }
}
