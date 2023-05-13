package calismalar;

import java.util.Scanner;

public class Test27 {
    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(ebob());
        ekok();
    }

    private static void ekok() {
        System.out.println("Lutfen iki adet sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        double kucukSayi = 0;
        double buyukSayi = 0;

        if (sayi1 > sayi2) {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        } else {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }

        for (double i = buyukSayi; i < sayi1 * sayi2; i += buyukSayi) {
            if (i % buyukSayi == 0 && i % kucukSayi == 0) {
                System.out.println("Ekok : "+i);
                break;
            }


            }
        }

        public static double ebob () {

            System.out.println("Lutfen iki adet sayi giriniz");
            double sayi1 = scanner.nextDouble();
            double sayi2 = scanner.nextDouble();

            double kucukSayi = 0;
            if (sayi1 > sayi2) {
                kucukSayi = sayi2;
            } else {
                kucukSayi = sayi1;
            }

            double ebob = 0;
            for (double i = kucukSayi; i > 1; i--) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                    break;
                }
            }
            return ebob;
        }
    }
