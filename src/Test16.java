import java.util.Scanner;

public class Test16 {

    public static void main(String[] args) {

        /*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("input a String ");
        String str = scanner.nextLine();
        System.out.print("input a sentence ");
        String sentence = scanner.nextLine();

        int strAdet = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.contains(str)){

                strAdet++;

            }


        }

        System.out.println("There are" +strAdet +str+ "in "+sentence);
    }
}

