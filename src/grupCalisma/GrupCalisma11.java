package grupCalisma;

import java.util.Random;
import java.util.Scanner;

public class GrupCalisma11 {

    //1 ile 100 arasında rastgele üretilen sayının kullanıcının kaçıncı denemede tahmin ettiğini hesaplayan,
    //ayrıca kullanıcıyı "daha büyük sayı giriniz","daha küçük sayı giriniz" şeklinde  yönlendiren programı
    //metot kullanarak yazınız.

    public static void main(String[] args) {

        sayiTahmin();
    }

    public static void sayiTahmin() {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int sayi = random.nextInt(101);

        int girilenSayi = 102;

        int tahmin = 0;

        while (girilenSayi != sayi) {
            System.out.println("Lutfen 1 ile 100 arasında bir sayi giriniz : ");
            girilenSayi = scanner.nextInt();
            if (girilenSayi > sayi) {
                System.out.println("Daha kucuk sayi giriniz");
            } else if (girilenSayi < sayi) {
                System.out.println("Daha buyuk sayi giriniz");
            } else {
                System.out.println("tahmininiz :"+girilenSayi+" "+ tahmin + " . denemede buldunuz");
            }
            tahmin++;

        }

    }


}
