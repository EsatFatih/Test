package calismalar;

public class Hastane {

    static String hastaneIsmi="Yıldız Hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;


    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(personelSayisi);

        Hastane ayseHemsire = new Hastane();
        System.out.println(ayseHemsire.personelAdresi);
        ayseHemsire.personelAdresi= "çankaya";
        ayseHemsire.personelIsmi = "AYŞE";
        ayseHemsire.personelTelefonu = "12312331323";

        Hastane fatmaHemsire = new Hastane();
        System.out.println(fatmaHemsire.personelTelefonu);
        fatmaHemsire.personelIsmi ="fatma";


        ayseHemsire.hastaneIsmi="Levent Hastanesi";
        System.out.println(hastaneIsmi);

    }
}
