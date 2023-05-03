public class Test10 {
    public static void main(String[] args) {

        /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *

         */


       int sayi =5;

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }

            System.out.println("   ");


        }


        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >=i ; j--) {

                System.out.print("* ");

            }
            System.out.println("");
        }


        }
    }

