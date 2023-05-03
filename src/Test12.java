public class Test12 {

    public static void main(String[] args) {

        // kullanicinin verdigi iki sayi ve
        // sececegi isleme gore
        // sonucu double olarak bize donduren bir method olusturun
        // ornek sayilar 3, 5,   islem * oldugunda method 15 dondurmeli


        System.out.println(miniHesapMakinesi(8, 5, '*'));
    }

    public static double miniHesapMakinesi(int sayi1, int sayi2, char islem){


        double sonuc =0;

        switch (islem){
            case '+':
                sonuc = sayi1+sayi2;
                break;
            case '-':
                sonuc = sayi1-sayi2;
                break;
            case '*':
                sonuc = sayi1*sayi2;
                break;
            case '/':
                sonuc = (double)sayi1/sayi2;
                break;
            default:
                System.out.println("gecersizislem");


        }
        return sonuc;
    }


}
