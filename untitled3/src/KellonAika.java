public class KellonAika {
    public static void main(String[] args) {
        long millisekunnitYht = System.currentTimeMillis();
        long sekunnitYht = millisekunnitYht / 1000;
        long sekunnitNyt = (int) (sekunnitYht % 60);
        long minuutitYht = sekunnitYht / 60;
        long minuutitNyt = (int) (minuutitYht % 60);
        long tunnitYht = minuutitYht / 60;
        long tunnitNyt = (int) (tunnitYht % 24);

        System.out.println("Kellonaika on " + tunnitNyt + ":" + minuutitNyt + ":" + sekunnitNyt + "GMT");

    }
}
