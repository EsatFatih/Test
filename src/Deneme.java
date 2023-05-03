import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deneme {

    static Scanner scanner= new Scanner(System.in);

    static int toplam = 0;

    static int urun = 0;

    static List<String>urunListesi = new ArrayList<>(Arrays.asList("Domates","Muz","Elma","Cilek","Erik"));

    static List<Integer>fiyatListesi = new ArrayList<>(Arrays.asList(25,25,36,63,61));


    public static void main(String[] args) {


       /*
    2. SORU

        Basit bir 5 ürünlü manav alisveris programi yaziniz.

        1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
                  istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     */

        System.out.println("***********Wise market************");

        urunFiyat();
    }

    public static int urunFiyat() {


        for (int i = 1; i <=urunListesi.size() ; i++) {
            System.out.println(i+" . urun"+ urunListesi.get(i-1)+"\t"+fiyatListesi.get(i-1));

        }

        System.out.println("Please choose product: ");
        int urun = scanner.nextInt();

        System.out.println("Please how much weight: ");
        double kilo = scanner.nextDouble();





        return urun;

    }


}
    



















