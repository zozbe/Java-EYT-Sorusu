public class Kadin extends Emeklilik {






    @Override
    public double Sorgula(double CalismaSuresi, String meslek, EYT eyt){
        if (CalismaSuresi > 5000 && eyt.SGKGirisYil > 20)
            System.out.println("Tebrikler Emekli Oldunuz!");
        if ( meslek=="4A")
        {
            CalismaSuresi=CalismaSuresi+CalismaSuresi*(15/100);
        } else if (meslek=="4B" || meslek== "4C") {
            return CalismaSuresi;
        }

        return CalismaSuresi;

    }

}
