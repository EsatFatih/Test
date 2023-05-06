package grupCalisma;

import java.util.Arrays;
import java.util.Scanner;

public class GrupCalisma10 {

    //Verilen diziyle tam olarak aynı sayıları içeren,
    // ancak tüm çift sayıların tüm tek sayılardan
    // önce gelmesi için yeniden düzenlenmiş bir dizi döndürün
    // Bunun dışında, sayılar herhangi bir sırada olabilir.
    // Verilen diziyi değiştirebilir ve döndürebilir veya
    // yeni bir dizi oluşturabilirsiniz.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(yeniArr()));
    }
    public static int[] yeniArr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array in boyutunu giriniz.");
        int boyut = scanner.nextInt();

        int[] arr = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println("Lutfen sayi giriniz");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 0){
                arr[i/2]=sayi;
            }else {
                arr[boyut-1-(i/2)]=sayi;
            }

        }
        return arr;
    }
}

