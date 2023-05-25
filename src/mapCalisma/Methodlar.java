package mapCalisma;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Methodlar {


    public static void IstenenSoyismineSahipOgrencileriYazdir(Map<Integer,String>ogreciMap,String soyIsim) {

        Collection<String> istenenSoyIsimeSahipOlanlar = ogreciMap.values();

        int sira =1;
        for (String eachValue:istenenSoyIsimeSahipOlanlar
             ) {
            String[] arrValue = eachValue.split("-");
            if (arrValue[1].equalsIgnoreCase(soyIsim)){
                System.out.println(sira+ " - "+arrValue[0]+" "+arrValue[1]);
                sira++;
            }
        }
    }

    public static Map<Integer,String>mapOlusturma(){
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static void IstenenSubedekiOgrencileriYazdir(Map<Integer, String> ogrenciMap, String sube) {

        Collection<String> IstenenSube = ogrenciMap.values();

        int sira =1;
        for (String eachValue:IstenenSube
             ) {

            String[]arrValue= eachValue.split("-");
            if (arrValue[3].equalsIgnoreCase(sube)){
                System.out.println(sira+" - "+arrValue[0]+" "+arrValue[1]+" "+arrValue[2]+" "+arrValue[3]);
                sira++;
            }
        }


    }

    public static void numaraAraligindakiOgrenciler(Map<Integer, String> ogrenciMap, int basNo, int bitisNo) {

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        int sira =1;
        for (Integer eachKey:ogrenciKeySeti
             ) {

            if (basNo<=eachKey && eachKey<=bitisNo){
                String value = ogrenciMap.get(eachKey);
                String[] arrValue = value.split("-");
                System.out.println(sira+ "-"+ eachKey+"-"+arrValue[0]+" "+arrValue[1]+" "+arrValue[4]);
                sira++;
            }

        }
    }
}
