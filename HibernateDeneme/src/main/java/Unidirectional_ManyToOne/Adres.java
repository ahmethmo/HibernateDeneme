package Unidirectional_ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adres {
    
       @Id
       @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String adres;
    private String sehir;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdres(String adres) {
          this.adres = adres;
    }
    public void setSehir(String sehir) {
          this.sehir = sehir;
    }

    public String getSehir() {
          return this.adres;
    }
    public String getAdres() {
          return this.sehir;
    }
}