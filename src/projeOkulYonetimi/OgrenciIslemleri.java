package projeOkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIslemleri {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Ogrenci>ogrenciArrayList = new ArrayList<>();
    public void ogrenciMenu(){

        System.out.println("============= İŞLEMLER =============\n" +
                "             1-EKLEME\n" +
                "             2-ARAMA\n" +
                "             3-LİSTELEME\n" +
                "             4-SİLME\n" +
                "             Q-ÇIKIŞ\n" +
                "        SEÇİMİNİZ:   ");
        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':
                ekleme();

            case '2':
                arama();
            case'3':
                listeleme();
            case '4':
                silme();
            case 'Q':
        }
    }

    private void silme() {
    }

    private void listeleme() {
        for (Ogrenci each:ogrenciArrayList) {
            System.out.println(each);

        }
        ogrenciMenu();
    }

    private void arama() {
        scanner.nextLine();
        System.out.println("LUTFEN ARANACAK TC NO GİRİNİZ:");
        String tc = scanner.nextLine();

        int flag=0;
        for (Ogrenci each: ogrenciArrayList) {

            if (each.getTcNo().equals(tc)){
                System.out.println(each);
                flag=1;
                break;
            }


            }

        if (flag==0){
            System.out.println("OGRENCİ YOK");
            ogrenciMenu();
        }
        ogrenciMenu();
        }


    private void ekleme() {
        scanner.nextLine();
        System.out.println("LUTFEN OGRENCİ ADINI GIRINIZ");
        String ad = scanner.nextLine();
        System.out.println("LUTFEN OGRENCİ SOYADINI GIRINIZ");
        String soyad = scanner.nextLine();
        System.out.println("TC NO GİRİNİZ");
        String tcNo = scanner.nextLine();
        System.out.println("LUTFEN YAS GİRİNİZ");
        int yas = scanner.nextInt();
        System.out.println("LUTFEN OGRENCİ NO GİRİNİZ");
        int numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("LUTFEN SİNİF GİRİNİZ");
        String sinif = scanner.nextLine();

        Ogrenci ogrenci = new Ogrenci(ad,soyad,tcNo,yas,numara,sinif);
        ogrenciArrayList.add(ogrenci);

        listeleme();
        ogrenciMenu();

    }
}
