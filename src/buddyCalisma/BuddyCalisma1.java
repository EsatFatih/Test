package buddyCalisma;

import java.util.Scanner;

public class BuddyCalisma1 {



    public static void main(String[] args) {

        /*

        29- Bir kullanıcının girdiği bir dizideki elemanların arasındaki farkın
        mutlak değerlerinin toplamını hesaplayan bir program yazın.
        Hesaplama işlemi bir metot içinde gerçekleştirilmeli ve
        bu metotun geri dönüş değeri olarak toplam döndürülmelidir.

         */


        System.out.println(toplamDondur());
    }
    public static int toplamDondur(){

        Scanner scanner = new Scanner(System.in);
        // Bir kullanıcının girdiği bir dizideki elemenlar:

        System.out.println("Lutfen eleman sayisini giriniz");
        int boyut = scanner.nextInt();
        int arr[] = new int[boyut];



        for (int i = 0; i <boyut ; i++) {
            System.out.println("Lutfen tamsayi giriniz");
            arr[i]= scanner.nextInt();

        }

        int toplam = 0;
        int fark = 0;

        for (int i = 0; i < arr.length-1; i++) {
            fark=arr[i]-arr[i+1];
            if (fark<0){
                toplam-= fark;
            }else {
                toplam+= fark;
            }

        }

        return toplam;
    }
}
