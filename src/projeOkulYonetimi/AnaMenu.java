package projeOkulYonetimi;

import java.util.Scanner;

public class AnaMenu {
    Scanner scanner = new Scanner(System.in);
    OgrenciIslemleri ogrenciIslemleri;
    public void anaMenu(){

        System.out.println("====================================\n" +
                "         ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "        ====================================\n" +
                "         1- ÖĞRENCİ İŞLEMLERİ\n" +
                "         2- ÖĞRETMEN İŞLEMLERİ\n" +
                "         Q- ÇIKIŞ\n"
                        + "SECİMİNİZ: ");
        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':
                 ogrenciIslemleri = new OgrenciIslemleri();
                 ogrenciIslemleri.ogrenciMenu();
            case '2':
            case 'Q':
                System.out.println("Iyi gunler");

        }

    }
}
