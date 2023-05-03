import java.util.Scanner;

public class GrupCalisma4 {

    /*

        Bir kullanıcının girdiği bir dizideki elemanların arasındaki farkın
        mutlak değerlerinin toplamını hesaplayan bir program yazın.
        Hesaplama işlemi bir metot içinde gerçekleştirilmeli ve
        bu metotun geri dönüş değeri olarak toplam döndürülmelidir.

     */

    public static void main(String[] args) {

        System.out.println(toplam());

    } // 7      8       5

    public static int toplam(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int [] arr = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println("Lutfen elemanları giriniz");
            int sayi = scanner.nextInt();
            arr[i] = sayi;

        }


        int toplam = 0;
        int fark =0;

        for (int i = 0; i < arr.length-1 ; i++) {
            fark= arr[i]-arr[i+1];
            if (fark<0){
                fark= fark*-1;
                toplam+=fark;
            }else {
                toplam+=fark;
            }


        }
    return toplam;

    }
}
