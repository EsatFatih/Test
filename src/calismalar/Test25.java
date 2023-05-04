package calismalar;

import java.util.Arrays;

public class Test25 {
    /*
        1. SORU
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        Örnek: 12 = 1 1 0 0

         */

    public static void main(String[] args) {

        int sayi = 12;

        int[] arr = new int[4];

        int index = 3;
        while (sayi >= 1) {
            arr[index]= sayi % 2;
            sayi = sayi/2;
            index--;
        }
        // arr[0]= sayi;
        System.out.println(Arrays.toString(arr));
    }
}
