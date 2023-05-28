package mapCalisma3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NestedMap {
    /*
        Asagidaki body'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
            "lastname" : “Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }
            key : String
            value : String, Integer, Boolean, Map<String,String>
         */
    public static void main(String[] args) {

        Map<String, Object> vacationMap = new HashMap<>();
        vacationMap.put("firstname","Ahmet");
        vacationMap.put("lastname","Bulut");
        vacationMap.put("totalprice",500);
        vacationMap.put("depositpaid",false);

        Map<String,String> bookingMap = new HashMap<>();
        bookingMap.put("checkin","2023-07-21");
        bookingMap.put("checkout","2023-08-10");

        vacationMap.put("bookingdates",bookingMap);
        vacationMap.put("additionalneeds","wi-fi");

        System.out.println(vacationMap);

        // rezervasyonMap'de soyismin ilk harf bilgisini yazdirin

        System.out.println(((String)vacationMap.get("lastname")).charAt(0));

    }
}
