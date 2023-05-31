package manavMaps;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ManavMaps {
/*
       1. Adım : Ürün girişi yapılmalı
       2. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
       3. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
       4. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
       5. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

       1. ürün = domates->10 TL
       2. ürün = muz->28 TL
       3. ürün = kiraz->40 TL
       4. ürün = şeftali->25 TL
    */
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer,Map<String,Double>>alisverisMap =new HashMap<>();
    static int siraNo =1;
    static int tutar = 0;
    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        System.out.println("*******YILDIZ MARKET *********\n" +
                "\t\t1. URUN GIRISI\n" +
                "\t\t2. ALISVERIS\n" +
                "\t\t CIKIS (Q)\n" +
                "SECİMİNİZ:   ");

        try {
            int secim = scanner.nextInt();
            switch (secim){
                case 1:
                    urunGirisi();
                case 2:
                    alisveris();
                default:
                    System.out.println("Hatali giris yaptiniz");
                    menu();
            }
        } catch (InputMismatchException e) {

            char secim = scanner.next().charAt(0);
            if (secim=='Q' || secim =='q'){
                System.out.println("Tutar: "+tutar);
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }

        }

    }

    private static void alisveris() {
        do {
            for (Map.Entry<Integer,Map<String,Double>> each1:alisverisMap.entrySet()) {
                for (Map.Entry<String,Double>each2:each1.getValue().entrySet()
                ) {
                    System.out.println(each1.getKey()+". urun "+each2.getKey()+"--> "+each2.getValue()+" TL");

                }

            }

        System.out.println("Lutfen secim yapiniz");
        int secim = scanner.nextInt();
        System.out.println("Lutfen miktari giriniz");
        double miktar = scanner.nextDouble();

        for (Map.Entry<Integer,Map<String,Double>> each1:alisverisMap.entrySet()) {
            if (each1.getKey()==secim){
                for (Map.Entry<String,Double>each2:each1.getValue().entrySet()
                     ) {
                    tutar+=each2.getValue()*miktar;

                }
            }
        }
        System.out.println("Baska urun secmek istyor musunuz? E veya H");


    }while (scanner.next().equalsIgnoreCase("E"));
        menu();


    }

    private static void urunGirisi() {
        Map<String,Double> urunGirisiMap = new HashMap<>();
        scanner.nextLine();
        System.out.println("Lutfen urun girisi yapiniz");
        String urun = scanner.nextLine();
        System.out.println("Lutfen urun fiyati giriniz" );
        double urunFiyat = scanner.nextDouble();
        urunGirisiMap.put(urun,urunFiyat);
        alisverisMap.put(siraNo++,urunGirisiMap);
        menu();

    }
}
