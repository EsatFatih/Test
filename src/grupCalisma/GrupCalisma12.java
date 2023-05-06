package grupCalisma;

import java.util.Scanner;

public class GrupCalisma12 {

      /* Problem Tanımı :
    Basit 4 işlem yapan bir hesap makinesi kodlayınız...
    Kullanıcıdan yapacağı işlemi işlem sembolü ile seçmesini sağlayınız.
    Kullanıcıdan iki sayı girmesini isteyiniz.
    Girilen iki sayi ve seçilen işleme göre doğru sonucu ekrana yazdırınız.
    */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("+ : Toplama Işlemi :\n" +
                "- : Cıkarma Işlemi :\n" +
                "* : Carpma Islemi :\n" +
                "/ : Bölme Islemi:");
        System.out.println("******************************");
        System.out.println("Lütfen yapacagınız işlemin sembolünü seçiniz :");

        char islem=scan.next().charAt(0);
        double a;
        double b;
        switch (islem){
            case '+':
                System.out.println("Birinci sayi");
                a=scan.nextDouble();
                System.out.println("ikinci sayi");
                b= scan.nextDouble();
                System.out.println("Girilen değerlerin toplamı: "+(a+b));
                break;
            case '-':
                System.out.println("Birinci sayi");
                a= scan.nextDouble();
                System.out.println("ikinci sayi");
                b= scan.nextDouble();
                System.out.println("Girilen değerlerin farkı: "+(a-b));
                break;
            case '*':
                System.out.println("Birinci sayi");
                a= scan.nextDouble();
                System.out.println("ikinci sayi");
                b= scan.nextDouble();
                System.out.println("Girilen değerlerin çarpımı: "+(a*b));
                break;
            case '/':
                System.out.println("Birinci sayi");
                a= scan.nextDouble();
                System.out.println("ikinci sayi");
                b= scan.nextDouble();
                System.out.println("Girilen değerlerin bolumu: "+(a/b));
                break;
            default:{
                System.out.println("Gecersiz İşlem:");
            }

        }
    }
}
