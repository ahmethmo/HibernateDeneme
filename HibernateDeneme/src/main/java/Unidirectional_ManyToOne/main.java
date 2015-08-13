package Unidirectional_ManyToOne;

import lol.HibernateUtil;
import org.hibernate.Session;

public class main {
    public static void main(String[] args) {

        Session ses=HibernateUtil.getSessionFactory().openSession();
        //IlkKayıt(ses);
        IkinciKayit(ses);
        
    }

    public static void IkinciKayit(Session session) {
        
        session.beginTransaction();   
        
        Adres adres= session.get(Adres.class, 1);
        session.persist(adres);

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAdres(adres);
        ogrenci.setOgrenci_Adi("Aykut");
        ogrenci.setOgrenci_Soyadi("SARAL");
        ogrenci.setOgrenci_Yasi(26);

        session.persist(ogrenci);
        
        session.getTransaction().commit();
        
    }
    
    public static void IlkKayıt(Session session) {
        
        session.beginTransaction();   
        
        Adres adres1 = new Adres();
        adres1.setAdres("Mecidiyeköy");
        adres1.setSehir("İstanbul");
        session.persist(adres1);
        
        Adres adres2 = new Adres();
        adres2.setAdres("3.köprü");
        adres2.setSehir("İstanbul");
        session.persist(adres2);

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAdres(adres1);
        ogrenci1.setOgrenci_Adi("Ahmet");
        ogrenci1.setOgrenci_Soyadi("HMO");
        ogrenci1.setOgrenci_Yasi(26);

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.setAdres(adres1);
        ogrenci2.setOgrenci_Adi("Ömer");
        ogrenci2.setOgrenci_Soyadi("Çakmak");
        ogrenci2.setOgrenci_Yasi(27);
        
        Ogrenci ogrenci3 = new Ogrenci();
        ogrenci3.setAdres(adres2);
        ogrenci3.setOgrenci_Adi("Orhan");
        ogrenci3.setOgrenci_Soyadi("Uyan");
        ogrenci3.setOgrenci_Yasi(28);

        session.persist(ogrenci1);
        session.persist(ogrenci2);
        session.persist(ogrenci3);
        
        session.getTransaction().commit();
        
    }
}