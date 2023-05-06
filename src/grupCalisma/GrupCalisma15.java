package grupCalisma;

import java.util.Scanner;

public class GrupCalisma15 {

    /*
    Basit 4 işlem yapan bir hesap makinesi kodlayınız...
    Kullanıcıdan yapacağı işlemi işlem sembolü ile seçmesini sağlayınız.
    Kullanıcıdan iki sayı girmesini isteyiniz.
    Girilen iki sayi ve seçilen işleme göre doğru sonucu ekrana yazdırınız.
    */


    public static void main(String[] args) {

        islemSonucu();
    }
    public static void islemSonucu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Toplama (+) \n" +
                            "Cıkarma (-) \n" +
                            "Bolme  (/) \n" +
                            "Carpma  (*) ");

        char islem = scanner.next().charAt(0);
        double sayi1;
        double sayi2 ;
        double islemSonucu = 0;



        switch (islem){
            case '*':
                System.out.println("Lutfen iki adet sayi giriniz :");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
               islemSonucu =sayi1*sayi2;
                System.out.println(islemSonucu);
                break;
            case '/':
                System.out.println("Lutfen iki adet sayi giriniz :");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                islemSonucu =sayi1/sayi2;
                System.out.println(islemSonucu);
                break;
            case '+' :
                System.out.println("Lutfen iki adet sayi giriniz :");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                islemSonucu =sayi1+sayi2;
                System.out.println(islemSonucu);
                break;
            case '-':
                System.out.println("Lutfen iki adet sayi giriniz :");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                islemSonucu =sayi1-sayi2;
                System.out.println(islemSonucu);
                break;
            default:
                System.out.println("Lutfen gecerli islem giriniz");
                islemSonucu();






        }

    }
}

