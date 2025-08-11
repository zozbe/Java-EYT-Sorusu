public class Erkek extends Emeklilik {


    @Override

    public double Sorgula(double CalismaSuresi, String meslek, EYT eyt){
        
        if (CalismaSuresi > 5500 && eyt.SGKGirisYil > 25)
            System.out.println("Tebrikler Emekli Oldunuz!");
        if (meslek== "4A") {
            CalismaSuresi = CalismaSuresi + CalismaSuresi * (1 / 5);
        } else if (meslek=="4B" || meslek=="4C") {
            CalismaSuresi = CalismaSuresi + CalismaSuresi * (7/100);
        }

        return CalismaSuresi;
    }


    }

