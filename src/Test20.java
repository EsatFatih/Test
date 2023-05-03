import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test20 {

        // kullancidan alinan isimlerden olusan listede 3 harften fazla olan isimleri yazdirin


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(listeKaydet());
    }
    public static List<String> listeKaydet (){

        System.out.println("lutfen isim giriniz");



        List<String> isimListesi = new ArrayList<>();


        String girilenIsim ="";

        while (!girilenIsim.equalsIgnoreCase("q")){
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                if (girilenIsim.length()>3){
                    isimListesi.add(girilenIsim);
                }
            }else {
                break;
            }



            }
        return isimListesi;
        }


    }
