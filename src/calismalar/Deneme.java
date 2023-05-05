package calismalar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Deneme {

    // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
    // Kural: 5 puana ilk ulasan oyunu kazanir

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int userPoimt = 0;
        int computerPoint = 0;

        do {
            System.out.println("Lutfen secim yapiniz : \n1- Tas \n2- Kagit\n3- Makas");
            int userChoice = scanner.nextInt();

            int compChoice = rnd.nextInt(3) + 1;

            if (userChoice == 1 && compChoice == 2) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar. Uzgunuz puan alamadiniz");
                computerPoint++;

            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Tas Makasi kirar. Tebrikler 1 puan kazandiniz ");
                userPoimt++;

            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar. Tebrikler 1 puan kazandiniz");
                userPoimt++;
            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser. Uzgunuz puan alamadiniz");
                computerPoint++;
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Tas Makasi kirar. Uzgunuz puan alamadiniz");
                computerPoint++;

            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Sizin seciminiz :" + userChoice + " Bilgisayarin secimi : " + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser. Tebrikler 1 puan kazandiniz");
                computerPoint++;

            } else {
                System.out.println("Uzgunuz puan alamadınız");
            }


        } while (userPoimt != 5 && computerPoint != 5);

        if (userPoimt > computerPoint) {
            System.out.println("Tebrikler siz kazandiniz\n: Puaniniz : " + userPoimt + "  Bilgisayar Puani :" + computerPoint);
        } else {
            System.out.println("Uzgunuz kaybettiniz Puaniniz : " + userPoimt + " Bilgisayar Puani : " + computerPoint);
        }
    }
}










