package mapCalisma;

import java.util.HashMap;
import java.util.Map;

public class Calisma {

    // verilen soyisme sahip tum ogrencileri yazdirin
    // verilen sube'deki tum ogrencileri yazdirin
    // verilen sinif ve sube'deki tum ogrencileri yazdirin
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = Methodlar.mapOlusturma();


        // verilen soyisme sahip tum ogrencileri yazdirin

        Methodlar.IstenenSoyismineSahipOgrencileriYazdir(ogrenciMap,"Can");

        // verilen sube'deki tum ogrencileri yazdirin

        Map<Integer,String> ogrenciMap1 = Methodlar.mapOlusturma();

        Methodlar.IstenenSubedekiOgrencileriYazdir(ogrenciMap1,"H");

        // ogrenci numarasi verilen iki deger arasinda olan (sinir degerleri dahil)
        // tum ogrencilerin numara, isim, soyisim ve bolumlerini yazdirin

        int basNo =101;
        int bitisNo=103;

        Methodlar.numaraAraligindakiOgrenciler(ogrenciMap,basNo,bitisNo);

    }

}
