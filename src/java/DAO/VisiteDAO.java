/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Bienimmobilier;
import Modele.Visite;
import Modele.Client;
import Modele.Employe;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author SARRINFO
 */
public class VisiteDAO {
    static Session session = null;
    
    public static void insert(Visite visite) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.save(visite);
        tx.commit();
        session.close();
        }

    public static void update(Visite visite, Client client, Bienimmobilier bien ) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        visite.setClient(client);
        visite.setBienimmobilier(bien);
        session.update(visite);
        tx.commit();
        session.close();
        }
        public static void update(Visite visite, Employe emp) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        visite.setEmploye(emp);
        session.update(visite);
        tx.commit();
        session.close();
        }
    
     public static void update(Visite visite, Bienimmobilier bien ) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        
        visite.setBienimmobilier(bien);
        session.update(visite);
        tx.commit();
        session.close();
        }
        
     public static void update(Visite visite, Client client) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        visite.setClient(client);
        session.update(visite);
        tx.commit();
        session.close();
        }

    public static void delete(Visite visite) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.delete(visite);
        tx.commit();
        session.close();
        }
   
     public static List allVisites() {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Visite ");
        List<Visite> results = query.list();

        return results;
        }
     
    public static List simpleVisite(int  idBien) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Visite where BIENID = :idBien and clientID is null");
        query.setParameter("idBien", idBien);
        List<Visite> results = query.list();

        return results;
        }
    
}
