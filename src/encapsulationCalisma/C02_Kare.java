package encapsulationCalisma;

public class C02_Kare extends C01_Sekiller {

    private double kenar;

    public C02_Kare(double kenar) {
        this.kenar = kenar;
    }




    @Override
    public double alanHesaplama() {

        return kenar*kenar;
    }

    @Override
    public double cevreHesaplama() {
        return 4*kenar;
    }
}
