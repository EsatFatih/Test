package calismalar;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {


        //  Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //  Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //  isim bosluk soyisim seklinde bize donduren bir method olusturun
        //  input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();





        harflerBuyuk(isim,soyisim);





        }
        public static String harflerBuyuk (String isim, String soyisim){




            String sonuc =isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase()+ " "
                    +soyisim.toUpperCase().charAt(0)+soyisim.substring(1);

        System.out.println(sonuc);

        return sonuc;
    }




}
