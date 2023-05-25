package mapCalisma2;

import java.util.Map;

public class CalismaUpdate2 {

    // ogrenci map'indeki tum soyisimleri buyuk harfe cevirin
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = Methodlar.mapOlusturma();

        ogrenciMap = Methodlar.tumSoyisimleriBuyukHarfYap(ogrenciMap);
        System.out.println(ogrenciMap);
    }
}
