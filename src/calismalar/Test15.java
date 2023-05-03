package calismalar;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("input your name: ");
        String name= scanner.nextLine();
        System.out.print("input your  surname: ");
        String surname= scanner.nextLine();
        System.out.print("input your credit card number: ");
        String cardNumber=scanner.nextLine();
        String card="";

        boolean station=false;

        if (cardNumber.length()!=16){
            System.out.println("Invalid credit card number - Card Number must be 16 digit");
        }
        for (int i = 0; i <=cardNumber.length()-1 ; i++) {
            if (!(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9')){
                station=true;
            }
        }
        if (station==true)
            System.out.println("Card Number must include only digit");
        else {
            System.out.print(name.toUpperCase().charAt(0) +
                    name.substring(1).replaceAll(".", "*")+"  ");
            System.out.println(surname.toUpperCase().charAt(0) +
                    surname.substring(1).replaceAll(".", "*"));

            for (int i = 0; i < 12; i++) {
                card+="*";
            }
            System.out.println(card + cardNumber.substring(12));
        }
        }


    }

