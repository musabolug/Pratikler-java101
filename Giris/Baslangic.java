package Giris;

public class Baslangic {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("****\n***\n**\n*");
        System.out.println("Java 101\tbaslangic\tdersi");
        System.out.println("system\\programfiles\\photos\\steam.exe");
        System.out.println("Dadaloglu der ki;\n \"Bu adam dogru diyir haa\"");


        /*
        Byte
8 bit uzunluğundadır. Max 127 , Min -128 değerleri arasındadır.
Anahtar sözcük : byte
Short
16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
Anahtar sözcük : short
Integer
32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
En çok tercih edilen veri tipidir , sebebi ise optimize uzunluktadır.
Anahtar sözcük : int
Long
64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
Int’in yetersiz olduğu yerlerde kullanılır
Anahtar sözcük : long
         */
        byte a = 120;
        short b = 1000;
        int c = 1000000;
        long d =100000000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        float piSayisi = 3.142352f;
        float sayilar = 3F;
        double sananesayisi = 3.131123;
        System.out.println(piSayisi);
        System.out.println(sananesayisi);
        System.out.println(sayilar);

        char harf = 'A';
        char harf2 = 'D';
        char harf3 = 'A';
        char harf4 = 'M';

        char harf5 = 'O';
        char harf6 = 'L';
        System.out.println("" + harf + harf2 + harf3 + harf4 +" "+ harf5 + harf6);
        boolean adamMisin = true;
        boolean askerMisin = false;
        System.out.println(adamMisin);
        System.out.println(askerMisin);

        String parola = "Parola Basak";
        System.out.println(parola);



    }

}
