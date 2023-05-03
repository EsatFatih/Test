package buddyCalisma;

import java.util.Scanner;

public class Buddycalisma2 {

    // Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
    //         tamkare ise true değilse false yazdırınız.
    //         Ornek :  input : 16, output:true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif sayi giriniz");

        int sayi = scanner.nextInt();

        int karekok = 2;

        boolean sayiTamKareMi= false;

        do {
            if (sayi == karekok*karekok){
                sayiTamKareMi=true;
                break;
            }

            karekok++;
        }while ( karekok*karekok<=sayi );


        System.out.println(sayiTamKareMi);


    }
}



