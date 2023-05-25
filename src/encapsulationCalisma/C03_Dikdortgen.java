package encapsulationCalisma;

public class C03_Dikdortgen extends C01_Sekiller {


    private double kenar1;

    public C03_Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    private double kenar2;



    @Override
    public double alanHesaplama() {
        return kenar1*kenar2;
    }

    @Override
    public double cevreHesaplama() {
        return 2*(kenar1)+(kenar2);
    }
}
