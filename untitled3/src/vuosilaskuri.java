public class vuosilaskuri {
    public static void main(String[] args) {
        double kuukausimaxu = 100;
        double lainanMaara = 1000;
        double kuukausikorko = 10;
        double vuosienMaara = 5;
        double vuodet = vuosienMaara;

        double kuukausimaxuformula = lainanMaara * kuukausikorko / (1 - 1 / Math.pow(1 + kuukausikorko, vuodet * 12));
        double kokomaxu = kuukausimaxuformula * vuodet * 12;

        // Näytetään tulokset
        System.out.println("Kuukausimaksu on " +
                (int)(kuukausimaxu * 100) / 100.0);
        System.out.println("Maksat kaikkiaan " +
                (int)(kokomaxu * 100) / 100.0);



    }
}
