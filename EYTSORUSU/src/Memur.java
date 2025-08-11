public class Memur extends Ucret {

    public double setMaas (int primGunu, double primTL){
        if(primGunu > 5200 * 0.11 && primGunu <5200 * 0.2){
            primTL=7500+(primTL*0.03);
        } else if (primGunu> 5000*0.21 && primGunu<5000*0.5) {
            primTL=8300+(primTL*0.06);

        }
        return primTL;
    }
}
