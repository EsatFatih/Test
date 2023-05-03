package calismalar;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz");

        String adSoyad = scanner.nextLine();


        int indexNumarasiSon = adSoyad.lastIndexOf(" ");


        System.out.println(adSoyad.substring(0,indexNumarasiSon));

        System.out.println(adSoyad.substring(indexNumarasiSon+1));




    }

}
