package calismalar;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {

        // kullanıcıdan kelimelerden oluşan bir arrayin boyutunu ve kelimeleri alıp,
        // o arraydeki en uzun kelimeyi bulup, for each döngüsü kullanarak
        // son 3 harfi büyük harfle yazdıran ,
        // bir method oluşturun


        soUcHarfiBuyukYazdiran();

    }

    public static void soUcHarfiBuyukYazdiran(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen arrayin boyutunu giriniz");
        int boyut = scanner.nextInt();
        String[] arr = new String[boyut];
        System.out.println("Lutfen kelime giriniz");
        String enUzunKelime= arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.next();
            if (arr[i].length()>arr[0].length()){
                enUzunKelime=arr[i];

            }

        }
        System.out.println(enUzunKelime.toUpperCase().substring(enUzunKelime.length()-3));

    }
}
