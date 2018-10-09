/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Bienimmobilier;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class BienImmobilierDAO {
    static Session session = null;
    
    public static void insert(Bienimmobilier bien) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.save(bien);
        tx.commit();
        session.close();
        }

    public static void update(Bienimmobilier bien, BigDecimal prix) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        bien.setPrixLoyer(prix);
        session.update(bien);
        tx.commit();
        session.close();
        }

    public static void delete(Bienimmobilier bien) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.delete(bien);
        tx.commit();
        session.close();
        }
   
     public static List allBienImmobiliers() {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bienimmobilier ");
        List<Bienimmobilier> results = query.list();
//        session.close();
        return results;
        }
     
    public static List simpleBienimmobilier(String id1, int id2) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bienimmobilier where ImmeubleID = :id1 and BienID = :id2 ");
        query.setParameter("id1", id1);
        query.setParameter("id2", id2);
        List<Bienimmobilier> results = query.list();

        return results;
        }
    
    public static List typeBienImmobilier(String type) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bienimmobilier where Type_Bienimmobilier = :ty ");
        query.setParameter("ty", type);
        List<Bienimmobilier> results = query.list();

        return results;
        }
    public static List prixBienimmobilier(BigDecimal pr) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bienimmobilier where Prix_loyer <= :prix ");
        query.setParameter("prix", pr);
        List<Bienimmobilier> results = query.list();

        return results;
        }
    
    public static List motRechercher(String mot) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bienimmobilier "
                + "where Type_BIENIMMOBILIER LIKE :mt ");
        query.setParameter("mt", mot);
        List<Bienimmobilier> results = query.list();

        return results;
        }    
}
