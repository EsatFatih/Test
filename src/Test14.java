public class Test14 {

    public static void main(String[] args) {


        System.out.println(metniTerseCevirme("java sahane"));


        // Soru 3- While loop kullanarak verilen bir String'i terse cevirip, bu halini bize
        //donduren bir method olusturun

        String str = "Java cok guzel";


        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));

        }

        System.out.println("*************************");

        int sayi = str.length()-1;

        while (sayi>=0){
            String str2 = str.substring(sayi,sayi+1);
            sayi--;
        }
        }
        public static String metniTerseCevirme (String str){
            int sayi = str.length()-1;
            String str2="";

            while (sayi>=0){
                str2 = str2+(str.substring(sayi,sayi+1));
                sayi--;
            }
            return  str2;

        }
    }

