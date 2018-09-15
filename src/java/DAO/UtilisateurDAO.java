/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.Session;
import Modele.Utilisateur;
import DAO.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class UtilisateurDAO {
    static Session session = null;
    
    public static void insert(Utilisateur utilisateur){
       session = HibernateUtil.getSessionFactory().openSession();
       
       Transaction tx = session.beginTransaction();
       session.save(utilisateur);
       tx.commit();
       session.close();   
    }
    
    public static void update(Utilisateur utilisateur, String pwd){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        utilisateur.setMotdepasse(pwd);
        session.update(utilisateur);
        tx.commit();
        session.close(); 
    }
    
    public static void delete(Utilisateur utilisateur){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        session.delete(utilisateur);
        tx.commit();
        session.close();
    }
    
        public static Utilisateur verifyPWD(String pwd, String email) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Utilisateur where courriel = :mail and motDePasse = :pwd");
        query.setParameter("mail", email);
        query.setParameter("pwd", pwd);
        Utilisateur results = (Utilisateur) query.uniqueResult();

        session.close();
        return results;
    }
    
}
