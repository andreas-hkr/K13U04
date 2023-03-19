public class Main {
    static RatNum simplify(RatNum num) {
        int m = num.p;
        int n = num.q;

        // Från 6.2
        while (true) {
            int r = m % n;
            if (r == 0) {
                break;
            }
            m = n;
            n = r;
        }

        RatNum res = new RatNum();
        res.p = num.p / n;
        res.q = num.q / n;

        return res;
    }

    public static void main(String[] args) {
        // Skriv en metod som försöker förenkla ett rationellt tal genom att se ifall
        // täljare och nämnare har en gemensam faktor och dividera med denna. Returnera
        // ett nytt RatNum-objekt (förenklat)
        //
        // Använd RatNum från upg. 13.3
        // Hitta största gemensamma delare som i upg. 6.2

        RatNum num = new RatNum();
        num.p = 5;
        num.q = 15;

        RatNum simplified = simplify(num);

        System.out.format("%d/%d", simplified.p, simplified.q);
    }
}

// Från 13.3
class RatNum {
    // p/q
    int p;
    int q;
}