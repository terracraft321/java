public class Ohjelma {
    public static void main[String[] args]
    {
            double x;
    }
}
// Lasketaan kuukausimaksu
double kuukausiMaksu = lainaMaara *
        kuukausiKorko / (1 - 1 /
        Math.pow(1 + kuukausiKorko, vuodet * 12));
double maksuYhteensa = kuukausiMaksu *
        vuodet * 12;
// Näytetään tulokset
System.out.println("Kuukausimaksu on " +
                           (int)(kuukausiMaksu * 100) / 100.0);
        System.out.println("Maksat kaikkiaan " +
                                   (int)(maksuYhteensa * 100) / 100.0);
