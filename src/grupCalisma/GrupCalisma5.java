package grupCalisma;

import java.util.Scanner;

public class GrupCalisma5 {

    /*
                Kullanıcıdan kelime girmesini isteyiniz. Eger kelime cift sayida harf iceriyorsa
                ortadaki 2 harfi, tek sayida harf iceriyorsa ortadaki tek harfi yazdiran
                bir Java programi yaziniz.

                ORNEK:
                INPUT      :  P y t h o n
                OUTPUT     :   th

     */

    public static void main(String[] args) {


        harfYazdir();
    }

    public static void harfYazdir(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kelime giriniz");
        String kelime = scanner.next();

        if (kelime.length()%2==0){

            kelime = kelime.substring(kelime.length()/2-1,kelime.length()/2+1);

        }else {

            kelime = kelime.substring(kelime.length()/2,kelime.length()/2+1);
        }

        System.out.println(kelime);









    }
}
