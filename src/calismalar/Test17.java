package calismalar;

import java.util.Scanner;

public class Test17 {
    /*
    Bir Java ATM programi yaziniz asagidaki kurallara gore;
    1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
    2-Kullanici Bakiyesini gorebilmesi icin method yaziniz (default bakiye 5000)
    3-Kullanici Deposito yatirabilsin
    4-Kullanici Para cekebilsin
    5-Kullanici Cikis yapsin
     */

    static Scanner scanner = new Scanner(System.in);
    static int balance =5000;
    static int withdraw ;
    static  double deposit;
    static int numberOfTransection ;

    static String str="";




    public static void welcomeToBank(){

        System.out.println("Welcome to Bank choose one of the below sentences" +
                "\n 1- bakiye görüntüleme \n2-para cekme\n3-para yatırma\n4-çıkış");

        numberOfTransection = scanner.nextInt();

        if (numberOfTransection<=0 || numberOfTransection>4){

            System.out.println("Wrong input");

            welcomeToBank();
        }



    }

    public static void balanceLearning(){

        System.out.println("Your balance is"+balance);

    }

    public static void depositAmount(){

        System.out.println("Please enter the deposit amount");
        deposit =scanner.nextDouble();
        balance += (int) deposit;
        System.out.println("Your balance is:"+balance);

        System.out.println("Do you want anything to do? :Y , :N");

        str =scanner.nextLine();
        if (str=="Y"){
            welcomeToBank();
            return;
        }else if(str=="N"){

            exit(); 
        }
    }

    public static void withdraw(){

        System.out.println("Please enter the withdraw amount");
        withdraw = scanner.nextInt();

        if (withdraw>balance || withdraw>2500){
            System.out.println("Your balance is :"+ balance+", it is insufficent");

            withdraw();
            return;
        }
        balance -= withdraw;
        System.out.println("Your balance is:"+balance);

    }
    public static void exit(){

        System.out.println("Thanks for choosing us");
    }

    public static void numberOfTransection1(){

        welcomeToBank();

        switch (numberOfTransection){
            case 1 :
                balanceLearning();
                break;
            case 2 :
                withdraw();
                break;
            case 3:
                depositAmount();
                break;
            case 4 :
                exit();
                break;

    }





      }

    public static void main(String[] args) {


        numberOfTransection1();

    }

    }

