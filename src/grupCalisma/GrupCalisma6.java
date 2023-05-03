package grupCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupCalisma6 {

    /*

    Bir kullanıcının girdiği bir dizinin elemanlarının ortalama
    değerinin altında kalan elemanların sayısını hesaplayan bir program yazın.
    Hesaplama işlemi bir metot içinde gerçekleştirilmeli ve
    bu metotun geri dönüş değeri olarak altında kalan eleman sayısı döndürülmelidir.

     */

    public static void main(String[] args) {

        System.out.println(elemanSayisi());
    }

    public static int elemanSayisi(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen boyut giriniz :");
        int boyut = scanner.nextInt();

        int [] arr =  new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println("Lutfen elemanlari giriniz :");
            arr[i]=scanner.nextInt();

        }

        int ortalama =0;

        int toplam =0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        ortalama = toplam/boyut;
        int sayac =0;

        List<Integer> ortalamaAltiDegerler = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<ortalama){
                sayac++;
                ortalamaAltiDegerler.add(arr[i]);

            }

        }

        System.out.println("Ortalama altı degerler: "+ortalamaAltiDegerler);
        System.out.println(ortalama);

        return  sayac;
    }





}
