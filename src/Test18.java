import java.util.Scanner;

public class Test18 {

    // Kullanicidan alinan karekterlerin string olup olmadigini kontrol eden bir java program yaziniz

    static Scanner scanner = new Scanner(System.in);

    static String str ;


    public static void isThisString(){

        System.out.println("Lutfen string giriniz");


        if (scanner.hasNextInt()){

            int input = scanner.nextInt();
            System.out.println("İnteger karakter girdiniz");
            isThisString();
        } else if (scanner.hasNextDouble()){
            double input = scanner.nextDouble();

            System.out.println("double karakter girdiniz.");
            isThisString();
        } else if (scanner.hasNext()) {
            String stringData = scanner.next();
            System.out.println("Great job");
            
        } else if (scanner.hasNext() && scanner.hasNextInt()) {


        }

    }


   public static void main(String[] args) {

        isThisString();




    }
}
