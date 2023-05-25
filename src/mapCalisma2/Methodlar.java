package mapCalisma2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Methodlar {
    public static Map<Integer, String> mapOlusturma() {

        Map<Integer,String>ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static void numaraIsimSoyisimSinifYazdirma(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            String eachValue = eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");
            System.out.println(eachEntry.getKey()+"  "+eachValueArr[0]+"  "+ eachValueArr[1]+"  "
                                                +eachValueArr[2]+"  "+eachValueArr[3]);
        }
    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            String eachValue = eachEntry.getValue();
            String [] eachArrValue = eachValue.split("-");

            if (eachArrValue[2].equalsIgnoreCase("12")){
                eachArrValue[2]="Mezun";
            }
            if (!eachArrValue[2].equalsIgnoreCase("Mezun")){
                int sinifSayiDegeri = Integer.parseInt(eachArrValue[2]);
                    sinifSayiDegeri++;
                    eachArrValue[2] = ""+sinifSayiDegeri;
            }
            eachEntry.setValue(eachArrValue[0]+"-"+eachArrValue[1]+"-"+eachArrValue[2]+"-"+
                                   eachArrValue[3]+"-"+eachArrValue[4]);
        }

        return ogrenciMap;
    }

    public static Map<Integer, String> tumSoyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            String eachValue= eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");
            eachEntry.setValue(eachValueArr[0]+"-"+eachValueArr[1].toUpperCase()+"-"+eachValueArr[2]
                    + "-"+ eachValueArr[3] + "-"+eachValueArr[4]);

        }

        return ogrenciMap;
    }
}
