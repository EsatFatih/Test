package grupCalisma;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GrupCalisma19 {
    // IT personel map olusturun
    //Tc no-isim-soyisim-gorev-maaş-calisma yili bilgilerini icersin
    //ITPersonel map'inde maaslari artirin
    //Görev suresi 5 yıl ve uzeri olanların  %20 zam
    //5 yıla kadar olanlara %10 zam
    //Tecrübesi olmayanlara zam yapılmasın

    public static void main(String[] args) {

        Map<String, String> itMap = new HashMap<>();
        itMap.put("123", "Esat-Aktas-QA-250000-5");
        itMap.put("124", "Ali-Oner-QA-90000-5");
        itMap.put("125", "Gizem-Dilek-QA-70000-1");
        itMap.put("126", "Seda-Ozmen-QA-65000-1");
        System.out.println(itMap);

        Set<Map.Entry<String, String>> itEntry = itMap.entrySet();

        for (Map.Entry<String, String> eachEntry : itEntry
        ) {
            String eachValue = eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");

            Double yil = Double.parseDouble(eachValueArr[4]);
            Double maas = Double.parseDouble(eachValueArr[3]);
            if (yil >= 5) {
                maas *= 1.2;
                eachValueArr[3]=""+maas;
            } else if (yil < 5 && yil >1) {
                maas *= 1.1;
                eachValueArr[3]=""+maas;
            } else if (yil<=1) {
                maas =maas;
                eachValueArr[3]=""+maas;
            }

            eachEntry.setValue(eachValueArr[0] + "-"+ eachValueArr[1] + "-"+
                    eachValueArr[2] + "-"+ eachValueArr[3] + "-"+eachValueArr[4]);

        }
        System.out.println(itMap);
    }
}
