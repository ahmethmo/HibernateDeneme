package Unidirectional_OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ogr {
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Adi;
    private String Soyadı;

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

    public String getSoyadı() {
        return Soyadı;
    }

    public void setSoyadı(String Soyadı) {
        this.Soyadı = Soyadı;
    }
    
    
}
