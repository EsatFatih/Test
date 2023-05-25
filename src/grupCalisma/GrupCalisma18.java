package grupCalisma;

import java.util.Scanner;

public class GrupCalisma18 {
    /*
    Kullanıcıdan bir tamsayı alıp, bu sayının armstrong sayısı olup
     olmadığını ekrana yazdırın.

     371 => 3^3 + 7^3 + 1^3 = 371
     153=> 1^3 + 5^3 + 3^3 = 151
     1634 => 1^4 + 6^4 + 3^4 + 4^4 = 1634
     1 => 1^1 =1
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (armstrongSayi(sayi)==sayi){
            System.out.println("Sayi armstrongdur");
        }else{
            System.out.println("Sayi armstrong degildir.");
        }


    }

    public static int armstrongSayi (int sayi){
        String str = "";
        int temp =sayi;
        String sayiStr = str+sayi;

        int sayiUzunluk = sayiStr.length();

        int index=0;

        int basamakToplami =0;
        while (index<=sayiUzunluk){
         int basamak = temp%10;
         basamakToplami+=Math.pow(basamak,sayiUzunluk);
         temp =temp/10;

            index++;
        }


        return basamakToplami;
    }
}
