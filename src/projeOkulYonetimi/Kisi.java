package projeOkulYonetimi;

public class Kisi {

    private String ad;
    private String sad;
    private String tcNo;
    int yas;

    public Kisi() {
    }

    public Kisi(String ad, String sad, String tcNo, int yas) {
        this.ad = ad;
        this.sad = sad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSad() {
        return sad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", sad='" + sad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
