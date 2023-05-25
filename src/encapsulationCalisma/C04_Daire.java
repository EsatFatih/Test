package encapsulationCalisma;

public class C04_Daire extends C01_Sekiller {

    private double yaricap;

    public C04_Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesaplama() {

        return Math.PI *yaricap*yaricap;
    }

    @Override
    public double cevreHesaplama() {
        return 2*Math.PI*yaricap;
    }
}
