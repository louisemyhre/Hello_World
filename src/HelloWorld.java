public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello AlgDat!");

        int [] vals = {8, 4, 17, 10, 20, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int minste_tall = vals[0];

        for(int i =1; i<15; ++i){
            int verdi = vals[i];
            if(verdi<minste_tall){
                minste_tall=verdi;
            }
        }

        System.out.println(minste_tall);

        int indeks = minst(vals);
        System.out.println(vals[indeks]);

        int indeks_maks=maks(vals);
        System.out.println(indeks_maks);

        int[] minMaks = minmaks(vals);
        System.out.println(minMaks[0] +" "+ minMaks[1]);
    }

    public static int minst(int[] liste){  //liste er en heltallstabell

        if (liste.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  //indeks til foreløpig minste verdi

        for (int i = 1; i < liste.length; i++){ //obs: starter med i = 1
            if (liste[i] < liste[m]) m = i;  //indeksen oppdateres
        }

        return m;  //returnerer indeksen/posisjonen til minste verdi
    }

    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi
        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] >= a[m]) {
                m = i; // indeksen oppdateres
            }
        }
        return m;  // returnerer indeksen/posisjonen til største verdi

    }

    public static int min_index (int [] a){ //læreren sin metode
        int min_value = a[0];
        int min_index = 0;

        for(int i= 1; i< a.length; i++){
            int value = a[i];
            int index= i;

            if(value < min_value){
                min_value=value;
                min_index=index;
            }
        }
        return min_index;
    }

    public static int[] minmaks(int [] a){
        int minste_tall = a[0];
        int storste_tall = a[0];

        for(int i =1; i<a.length; ++i){
            int verdi = a[i];
            if(verdi<minste_tall){
                minste_tall=verdi;
            }
            if(verdi>storste_tall){
                storste_tall=verdi;
            }
        }
        int [] b = {minste_tall, storste_tall};

        return b;
    }
}
