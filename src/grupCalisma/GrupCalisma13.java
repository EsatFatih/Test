package grupCalisma;

import java.util.Scanner;

public class GrupCalisma13 {

    /*
     Kullanıcını girdiği ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak !çin gereken kodu yazınız.
    Örnegin; 75.4238 ==> *4*2*3*8

     */

    public static void main(String[] args) {

        ondalikKisimYazdir();

    }

    public static void ondalikKisimYazdir() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalik bir sayi giriniz");
        double girilenSayi = scanner.nextDouble();
        String girilenSayiString = Double.toString(girilenSayi);
        int index = girilenSayiString.indexOf('.');
        String ondalikliRakamlar = girilenSayiString.substring(index+1);

        String ondalikliKisim = "*";
        for (int i = 0; i < ondalikliRakamlar.length()-1; i++) {
            ondalikliKisim+=ondalikliRakamlar.charAt(i)+"*";

        }

        ondalikliKisim = ondalikliKisim+ondalikliRakamlar.substring(ondalikliRakamlar.length()-1);
        System.out.println(ondalikliKisim);
    }
}
