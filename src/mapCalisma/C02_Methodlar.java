package mapCalisma;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class C02_Methodlar {

    public static Map<Integer, String> mapOlusturma() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }


    public static void istenenSoyismeSahipOgrencileriYazdir(Map<Integer, String> ogrenciMap, String soyIsim) {
        // verilen soyisme sahip tum ogrencileri yazdirin

        Collection<String> istenenSoyisim = ogrenciMap.values();

        int sira = 1;
        for (String eachValue : istenenSoyisim
        ) {
            String[] arrValue = eachValue.split("-");
            if (arrValue[1].equalsIgnoreCase(soyIsim)) {
                System.out.println(sira+" -"+arrValue[0]+" "+arrValue[1]);
                sira++;
            }
        }


    }

    public static void isteneSubeyeGoreOgrenciListesiYazdir(Map<Integer, String> ogrenciMap1, String sube) {

        // verilen sube'deki tum ogrencileri yazdirin

        Collection<String> istenenSube =ogrenciMap1.values();

        int sira =1;
        for (String eachValue:istenenSube
             ) {
            String[]arrValue = eachValue.split("-");
            if (arrValue[3].equalsIgnoreCase(sube)) {
                System.out.println(sira+" -"+arrValue[0]+" "+arrValue[1]+" "+arrValue[2]+" "+arrValue[3]);
                sira++;
            }
        }
    }

    public static void istenenSinifVesubeyeGoreYazdir(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        // verilen sinif ve sube'deki tum ogrencileri yazdirin

        Collection<String>istenenSubeveSinif = ogrenciMap.values();

        int sira =1;
        for (String eachValue:istenenSubeveSinif
             ) {
            String[]arrValue = eachValue.split("-");
            if (arrValue[2].equalsIgnoreCase(sinif) && arrValue[3].equalsIgnoreCase(sube)){
                System.out.println(sira+" -"+ arrValue[0]+" "+arrValue[1]+" "+arrValue[2]+" "+arrValue[3]);
                sira++;
            }
        }
    }
}


