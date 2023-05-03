import java.util.Scanner;

public class GrupCalisma3 {

    /*

                Kullanıcıdan kelime girmesini isteyiniz. Eger kelime cift sayida harf iceriyorsa
                ortadaki 2 harfi yazdiran, tek sayida harf iceriyorsa ortadaki tek harfi yazdiran
                bir Java programi yaziniz.

                ORNEK:
                INPUT      :  Python
                OUTPUT     :   th

     */
    public static void main(String[] args) {

        harfYazdir();

    }

    public static void harfYazdir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kelime giriniz : ");
        String kelime = scanner.next();

        if (kelime.length()%2==0){
            kelime=kelime.substring((kelime.length()-1)/2,(kelime.length()-1)/2+2);

        }else {
            kelime=kelime.substring(kelime.length()/2,kelime.length()/2+1);
        }
        System.out.println(kelime);
    }

}
