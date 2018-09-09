/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modele.Images;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class ImagesDAO {
    static Session session = null;
    
     public static void insert(Images img) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.save(img);
        tx.commit();
        session.close();
    }


    public static void delete(Images img) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.delete(img);
        tx.commit();
        session.close();
    }
    
     public static List allImagesBienImmobilier(int no) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Images E where E.BIENID = :no ");
        List<Images> results = query.list();

        return  results; 
        }
        
}