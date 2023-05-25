package mapCalisma2;

import java.util.Map;

public class Calisma {
    public static void main(String[] args) {
        // ogrenci listesini numara-isim-soyisim-sinif seklinde yazdirin

        Map<Integer, String> ogrenciMap = Methodlar.mapOlusturma();

       Methodlar.numaraIsimSoyisimSinifYazdirma(ogrenciMap);



    }
}
