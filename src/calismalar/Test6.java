package calismalar;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {


        /*
         * Write a Java program to compute body mass index (BMI)
         * print the situation.
         * Isuser weak, fat or obese ?
         *
         * (Hint BMI = weight(kg)/ (height*height)(m)
         * BMI<20 weak
         * 20<BMI<25 healthy
         * 25<BMI<30 fat
         * Over 30 obese
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kg cinsinden kilonuzu giriniz" );
        double kilo= scanner.nextDouble();
        System.out.println("Lutfen m cinsinden boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double bmi = kilo/(boy*boy);

        if (bmi<20){
            System.out.println("weak");
        } else if (20<bmi && bmi<25 ) {
            System.out.println("healthy");

        } else if (bmi>25 && bmi<30) {
            System.out.println("fat");

        }else if (bmi>30){
            System.out.println("obese");
        }


    }
}
