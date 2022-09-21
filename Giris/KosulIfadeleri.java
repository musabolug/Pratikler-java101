package Giris;

public class KosulIfadeleri {
    public static void main(String[] args){

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;

        System.out.println("Esittir operatoru denemesi");
        System.out.println(A == B);
        //Matematiksel ifademizi cümle haline getirelim. (10 Eşittir 20) bu cümle yanlış bir cümledir.10 sayısı
        // 20 sayısına eşit olamayacağından sonucumuz yanlış yani false'tur.
       // Ayni cümleleri diğer matematiksel ifadelerimiz içinde yazalım.
        System.out.println(A == C) ;
        // (10 Eşittir 10 ) evet bu cümle doğru sonucumuz true.
        System.out.println(D == A);
        // (10 Eşittir 40 ) bu cümle yanlıştır ve cevabımız false.

        System.out.println("Esit degildir operatoru denemesi");
        System.out.println(A != D) ; // (10 Eşit Değildir 40 ) Evet 10 sayısı 40'a eşit değildir ve sonucumuz true'dur.
        System.out.println (A != C) ; // (10 Eşit Değildir 10 ) Bu cümle doğru değildir.Bu yüzden cevabımız false'tur.
        System.out.println(C != B) ; // (10 Eşit Değildir 20 ) True.

        System.out.println("Buyuktur operatoru denemesi");
        System.out.println (A > D) ; // (10 Büyüktür 40 ) 10 sayısı 40 sayısından büyük değildir cümle yanlış olduğundan cevabımız false olacaktır.
        System.out.println (D > C) ; // (40 Büyüktür 10) 40 sayısı 20 sayısından büyüktür,ifade doğrudur sonucumuz true'dur.
        System.out.println (C > B) ; // (10 Büyüktür 20) False

        System.out.println("Buyuk Esittir operatoru denemesi");
        System.out.println(A >= D) ; // (10 Büyük Eşittir 40 ) 10 sayısı 40 sayısından büyük veya eşit değildir cümle yanlış olduğundan cevabımız false olacaktır.
        System.out.println(A >= C) ; // (10 Büyük Eşittir 10) Burada 10 sayısı 10 sayısından büyük değildir ancak ona eşit olduğundan sonucumuz true olacaktır.
        System.out.println(C >= B) ; // (10 Büyük Eşittir 20) False

        // <  Küçüktür Operatörü
        System.out.println("Kucuktur operatoru");
        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);


        // <= Küçük-Eşittir Operatörü
        System.out.println("Kucuk Esittir operatoru");
        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);




    }
}
