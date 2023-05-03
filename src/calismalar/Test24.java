package calismalar;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert a day: ");
        String day = scanner.next();



            if (day.equalsIgnoreCase("monday")){
                System.out.println("Work time 5 days left to weekend");
            } else if (day.equalsIgnoreCase("tuesday")) {
                System.out.println("Work time 4 days left to weekend");
            } else if (day.equalsIgnoreCase("wednesday")) {
                System.out.println("Work time 3 days left to weekend");
            } else if (day.equalsIgnoreCase("Thurday")) {
                System.out.println("Work time 2 days left to weekend");
            }else if(day.equalsIgnoreCase("friday")){
                System.out.println("Work time 1 days left to weekend");
            }else if (day.equalsIgnoreCase("saturday")){
                System.out.println("break time");

            }else if (day.equalsIgnoreCase("sunday")){
                System.out.println("break time");
        }

    }
}
