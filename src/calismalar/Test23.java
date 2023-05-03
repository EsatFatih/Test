package calismalar;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert a letter:  ");
        char harf = scanner.next().toUpperCase().charAt(0);

        boolean harfDenkDegilMi = true;
        if (harf=='O'){
            System.out.println("Ocak");
            harfDenkDegilMi =false;
        }

        if (harf =='S'){
            System.out.println("Subat");
            harfDenkDegilMi =false;
        }
        if (harf=='M'){
            System.out.println("Mart ve Mayıs");
            harfDenkDegilMi =false;
        }
        if (harf =='N'){
            System.out.println("Nisan");
            harfDenkDegilMi =false;
        }
        if (harf =='H'){
            System.out.println("Haziran");
            harfDenkDegilMi =false;
        }
        if (harf =='T'){
            System.out.println("Temmuz");
            harfDenkDegilMi =false;

    }
        if (harf =='A'){
            System.out.println("Agustos ve Aralik");
            harfDenkDegilMi =false;

}
        if (harf =='E'){
            System.out.println("Eylul ve Ekim");
            harfDenkDegilMi =false;

    }
        if (harf =='K'){
            System.out.println("Kasim");
            harfDenkDegilMi =false;


}
        if (harfDenkDegilMi){

            System.out.println("Lutfen gecerli harf giriniz");

        }
}
}