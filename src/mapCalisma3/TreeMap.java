package mapCalisma3;

public class TreeMap {

    public static void main(String[] args) {

        java.util.TreeMap<Integer,String> ogrenciMap = new java.util.TreeMap<>();
        ogrenciMap.put(103,"Ali Can");
        ogrenciMap.put(120,"Veli Cem");
        ogrenciMap.put(101,"Akif Han");
        ogrenciMap.put(140,"Yusuf San");

        System.out.println(ogrenciMap.subMap(103, 140));
        System.out.println(ogrenciMap.subMap(103,false,140,true));
        System.out.println(ogrenciMap.descendingMap());

        System.out.println(ogrenciMap.lowerKey(101));
        System.out.println(ogrenciMap.lowerEntry(103));
        System.out.println(ogrenciMap.floorKey(125));
        System.out.println(ogrenciMap.higherKey(101));
        System.out.println(ogrenciMap.headMap(105));

    }
}
