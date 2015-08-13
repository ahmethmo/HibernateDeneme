package Unidirectional_OneToMany;


import java.util.ArrayList;
import lol.HibernateUtil;
import org.hibernate.Session;

public class Test {
    public static void main(String[] args) {

        Session ses=HibernateUtil.getSessionFactory().openSession();
        //IlkKayıt(ses);
        IkinciKayit(ses);
        
    }
    
        public static void IkinciKayit(Session session) {
        
        session.beginTransaction();   
        
        Ogr ogr1 = new Ogr();
        ogr1.setAdi("Aykut");
        ogr1.setSoyadı("Saral");
        session.persist(ogr1);
        
        Ders Drs=session.get(Ders.class, 2);
        Drs.getOgrler().add(ogr1);
        session.persist(Drs);
 
        session.getTransaction().commit();
    }
    
    public static void IlkKayıt(Session session) {
        
        session.beginTransaction();   
        
        Ogr ogr1 = new Ogr();
        ogr1.setAdi("Ahmet");
        ogr1.setSoyadı("HMO");
       
        Ogr ogr2 = new Ogr();
        ogr2.setAdi("Ömer");
        ogr2.setSoyadı("Çakmak");
        
        Ogr ogr3 = new Ogr();
        ogr3.setAdi("Orhan");
        ogr3.setSoyadı("Uyan");
        
        session.persist(ogr1);
        session.persist(ogr2);
        session.persist(ogr3);
       
        ArrayList<Ogr> Ogrs1=new ArrayList<>();
        Ogrs1.add(ogr3);
        Ders drs1=new Ders();
        drs1.setAdi("Fizik");
        drs1.setOgrler(Ogrs1);
        session.persist(drs1);
       
        ArrayList<Ogr> Ogrs2=new ArrayList<>();
        Ogrs2.add(ogr1);
        Ogrs2.add(ogr2);
        Ders drs2=new Ders();
        drs2.setAdi("Matematik");
        drs2.setOgrler(Ogrs2);
        session.persist(drs2);
        
        session.getTransaction().commit();
        
    }
}
