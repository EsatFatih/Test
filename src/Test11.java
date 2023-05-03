public class Test11 {

    public static void main(String[] args) {
        // verilen sayinin asal sayi olup olmadigini yazdiran bir method olusturun

        asalSayiMi(85);
    }

    public static void asalSayiMi(int sayi){


        boolean asalMi = true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi %i ==0){
                asalMi = false;
            }

        }
        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degil");
        }

    }

}
