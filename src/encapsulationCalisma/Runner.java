package encapsulationCalisma;

public class Runner {

    public static void main(String[] args) {


        C01_Sekiller kare = new C02_Kare(8);
        System.out.println("Karenin alani :"+kare.alanHesaplama());
        System.out.println("Karenin cevresi :"+kare.cevreHesaplama());

        C01_Sekiller dikdortgen = new C03_Dikdortgen(8,6);
        System.out.println("Dikdortgenin alani :"+dikdortgen.alanHesaplama());
        System.out.println("Dikdortgenin cevresi :"+dikdortgen.cevreHesaplama());

        C01_Sekiller daire = new C04_Daire(5);
        System.out.println("Dairenin alani :"+daire.alanHesaplama());
        System.out.println("Dairenin cevresi :"+daire.cevreHesaplama());
    }
}
