package grupCalisma;

import java.util.Scanner;

public class GrupCalisma14 {

        /*
     Kullanıcının girdiği ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak için gereken kodu yazınız.
    Örnegin; 75.4238 ==> *4*2*3*8

     */

    public static void main(String[] args) {

        ondalikliKisim();
    }

    public static void ondalikliKisim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz: ");
        Double girilenSayi = scanner.nextDouble();
        String ondalikliRakamlar = girilenSayi.toString();

        int index = ondalikliRakamlar.indexOf('.');

        String yeniOndalikli = "";


        for (int i = index + 1; i <= ondalikliRakamlar.length() - 1; i++) {
            yeniOndalikli += "*"+ondalikliRakamlar.charAt(i)  ;

        }

        // ondalikliRakamlar = ondalikliRakamlar.replace(ondalikliRakamlar.charAt(ondalikliRakamlar.length() - 1), ' ');
        // yeniOndalikli = ondalikliRakamlar.replace(ondalikliRakamlar.charAt(ondalikliRakamlar.length() - 1), ' ');

        System.out.println(yeniOndalikli);


    }
}
