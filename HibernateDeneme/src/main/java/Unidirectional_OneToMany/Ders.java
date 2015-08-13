package Unidirectional_OneToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Adi;
        @OneToMany(cascade=CascadeType.ALL)
    private List<Ogr> Ogrler;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public List<Ogr> getOgrler() {
        return Ogrler;
    }

    public void setOgrler(List<Ogr> Ogrler) {
        this.Ogrler = Ogrler;
    }
    
    
}
