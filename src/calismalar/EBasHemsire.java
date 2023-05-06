package calismalar;

public class EBasHemsire extends DHemsire{


    EBasHemsire() {
        System.out.println(adres);
        adres = "Cankaya";
        System.out.println(gorev);
        System.out.println("Genel gorev : " + super.gorev);
        isim = "Ayse";

        System.out.println(this.isim);
        System.out.println(super.isim);

        this.maas();
        super.maas();
        nobet();
        this.nobet();
        super.nobet();
        ozelSigorta();
        this.ozelSigorta();
        super.ozelSigorta();
        tazminat();
        this.tazminat();
        // super.tazminat(); CTE
        // inheritance'da child'da yoksa parent'a bakilir
        // AMAAAA parent'da yoksa child'a bakilmaz CTE olur
    }

    String gorev = "Bas Hemsire";
    String adres = "Adres belirtilmedi";

    public void maas() {
        System.out.println("Bas Hemsire maasi : " + 3000);
    }

    public void nobet() {
        System.out.println("Bashemsireler ayda 3 gun nobet tutar");
    }

    public void tazminat() {
        System.out.println("Bas hemsireler 13.maas alir");
    }

    public static void main(String[] args) {
        EBasHemsire bh1 = new EBasHemsire();
    }
}


