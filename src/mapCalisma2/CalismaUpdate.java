package mapCalisma2;

import java.util.Map;

public class CalismaUpdate {

    // ogrenci map'inde yilsonu sinif artirin
    // 12.siniftakiler icin sinif bilgisi olarak mezun yazin
    // mezun yazan varsa bir islem yapilmayacak

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = Methodlar.mapOlusturma();

        // ogrenci map'inde yilsonu sinif artirin

        ogrenciMap = Methodlar.yilSonuSinifArtir(ogrenciMap);
        System.out.println(ogrenciMap);
    }

}
