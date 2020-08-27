import hjelpeklasser.*;

public class Program {
    public static void main(String ... args)      // hovedprogram
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        int [] test = {1,2,3,4,3,2,5,6,7};

        System.out.println(Tabell.maks(a,2,3));

        int[] b={};
        System.out.println(Tabell.maks(b));
    }
}
