package projeOkulYonetimi;

public class Ogrenci extends Kisi{

    private int no;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String sad, String tcNo, int yas, int no, String sinif) {
        super(ad, sad, tcNo, yas);
        this.no = no;
        this.sinif = sinif;
    }

    public int getNo() {
        return no;
    }

    public String getSinif() {
        return sinif;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci" + super.toString() +
                 "no=" + no +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
