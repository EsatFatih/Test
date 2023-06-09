package kutuphane;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Kutuphane kutuphane =new Kutuphane();
        Kitap kitap1 =new Kitap("Kürk Mantolu Madonna","Sabahattin Ali");
        Kitap kitap2 =new Kitap("Sefiller","Victor Hugo");
        Kitap kitap3 =new Kitap("Çalıkuşu","Reşat Nuri Güntekin");
        Kitap kitap4 =new Kitap("Derin Çatışma","Carl Newport");
        Kitap kitap5 =new Kitap("Sigarayı Bırakmanın Kolay Yolu","Allen Car");
        Kitap kitap6 =new Kitap("Hayvan Çiftliği","George Orwell");
        Kitap kitap7 =new Kitap("Atomik Alışkanlıklar","James Clear");
        Kitap kitap8 =new Kitap("Tutunamayanlar","Oğuz Atay");

        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);
        kutuphane.kitapEkle(kitap4);
        kutuphane.kitapEkle(kitap5);
        kutuphane.kitapEkle(kitap6);
        kutuphane.kitapEkle(kitap7);
        kutuphane.kitapEkle(kitap8);

        System.out.println(kutuphane.kitaplariListele().get(1).getYazar());
        System.out.println(kutuphane.kitaplariListele().toString());

         for (Kitap kitap: kutuphane.kitaplariListele()
         ) {
             System.out.println(kitap.getYazar()+"-"+kitap.getKitapAdi());
         }
         kutuphane.kitapCikar(kutuphane.kitaplariListele().get(7));

         kutuphane.kitapCikar(kitap8);
         System.out.println(kutuphane.kitaplariListele().toString());

         Map<Integer,String> okunacakKitap =new HashMap<>();
         int key =1;
         for (Kitap kitap: kutuphane.kitaplariListele()
         ) {
             okunacakKitap.put(key,kitap.getKitapAdi()+"-"+kitap.getYazar());
             key++;
         }

         System.out.println("Kitaplar :"+okunacakKitap);

         int deger = (int) (Math.random()* okunacakKitap.size()+1);
         System.out.println("Deger :"+deger);

         String secilenKitap =okunacakKitap.get(deger);
            System.out.println("Okuyacağınız Kiatp :"+secilenKitap);

    }


}
