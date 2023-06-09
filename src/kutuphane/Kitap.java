package kutuphane;

public class Kitap {
    private String kitapAdi;
    private String yazar;
    public Kitap(String kitapAdi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
    }
    public String getKitapAdi() {
        return kitapAdi;
    }
    public String getYazar() {
        return yazar;
    }
    @Override
    public String toString() {
        return "kitapAdi=" + kitapAdi + '\'' +
                ", yazar='" + yazar + '\''
                ;
    }
}

