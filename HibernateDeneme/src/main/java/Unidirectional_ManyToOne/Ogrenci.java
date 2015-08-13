package Unidirectional_ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ogrenci {
 
       @Id
       @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String ogrenci_Adi;
    private String ogrenci_Soyadi;
    private int ogrenci_Yasi;
       @ManyToOne(cascade=CascadeType.ALL)
    private Adres adres;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOgrenci_Adi() {
        return ogrenci_Adi;
    }

    public void setOgrenci_Adi(String ogrenci_Adi) {
        this.ogrenci_Adi = ogrenci_Adi;
    }

    public String getOgrenci_Soyadi() {
        return ogrenci_Soyadi;
    }

    public void setOgrenci_Soyadi(String ogrenci_Soyadi) {
        this.ogrenci_Soyadi = ogrenci_Soyadi;
    }

    public int getOgrenci_Yasi() {
        return ogrenci_Yasi;
    }

    public void setOgrenci_Yasi(int ogrenci_Yasi) {
        this.ogrenci_Yasi = ogrenci_Yasi;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}