import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many tea do you drink in a day?" );
        int tea = scanner.nextInt();

        System.out.println("how many sugar do you use for a glass of tea?" );

        int sugar =scanner.nextInt();

        double sugarKilo = 2.7;

        double sugarUsingYear = 365*tea*sugar*sugarKilo;
        double sugarUsing40Year = 40*365*tea*sugar*sugarKilo;

        if (!(sugar==0)){
            System.out.println("sugar using in a year  : " + sugarUsingYear);
            System.out.println("sugar using in 40 year : " + sugarUsing40Year);
        }else {

            System.out.println("Good Job, less sugar more health");
        }


    }
}
