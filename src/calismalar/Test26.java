package calismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test26 {
    /*
    2. SORU

        Basit bir 5 ürünlü manav alisveris programi yaziniz.

        1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
                  istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     */
    static int toplam = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        urunSecim();
    }

    public static void urunSecim() {

        List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Salatalık", "Muz", "Nar", "Kivi"));
        List<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(25, 16, 35, 50, 45));

        System.out.println("Urun listesi :\n\t\t1- Domates : 25 TL\n\t\t2- Salatalık : 16 TL " +
                "\n\t\t3- Muz : 35 TL\n\t\t4- Nar : 50 TL\n\t\t5-Kivi : 45 TL");

        System.out.println("Please choose your product : ");
        int secim = scanner.nextInt();
        System.out.println("Please tell me how many kilos :");
        int kilo = scanner.nextInt();


        toplam += (fiyatListesi.get(secim - 1)) * kilo;


                System.out.println("Do you want another product ? : Y or N");
                char ansnwer = scanner.next().toUpperCase().charAt(0);
                if (ansnwer == 'Y') {

                    urunSecim();
                } else if (ansnwer == 'N') {

                    System.out.println("Urunlerin toplam fiyatı : " + toplam);
                }

        }
    }

