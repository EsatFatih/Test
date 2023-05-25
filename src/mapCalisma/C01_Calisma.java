package mapCalisma;

import java.util.Map;

public class C01_Calisma {

    // verilen soyisme sahip tum ogrencileri yazdirin
    // verilen sube'deki tum ogrencileri yazdirin
    // verilen sinif ve sube'deki tum ogrencileri yazdirin


    public static void main(String[] args) {

    Map<Integer,String>ogrenciMap = C02_Methodlar.mapOlusturma();


        // verilen soyisme sahip tum ogrencileri yazdirin

        // C02_Methodlar.istenenSoyismeSahipOgrencileriYazdir(ogrenciMap,"Can");

        // verilen sube'deki tum ogrencileri yazdirin

        Map<Integer,String>ogrenciMap1 = C02_Methodlar.mapOlusturma();

        // C02_Methodlar.isteneSubeyeGoreOgrenciListesiYazdir(ogrenciMap1,"K");

        // verilen sinif ve sube'deki tum ogrencileri yazdirin

        C02_Methodlar.istenenSinifVesubeyeGoreYazdir(ogrenciMap,"10","K");




    }
}
