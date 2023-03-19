public class Main {
    static RatNum simplify(RatNum num) {
        // ...

        // Från 6.2
        while (true) {
            int r = m % n;
            if (r == 0) {
                break;
            }
            m = n;
            n = r;
        }

        // ...
    }

    public static void main(String[] args) {
        // Skriv en metod som försöker förenkla ett rationellt tal genom att se ifall
        // täljare och nämnare har en gemensam faktor och dividera med denna. Returnera
        // ett nytt RatNum-objekt (förenklat)
        //
        // Använd RatNum från upg. 13.3
        // Hitta största gemensamma delare som i upg. 6.2


    }
}

// Från 13.3
class RatNum {
    // p/q
    int p;
    int q;
}