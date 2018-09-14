/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class ClientDAO {
    static Session session = null;
    
    public static void insert(Client client){
       session = HibernateUtil.getSessionFactory().openSession();
       
       Transaction tx = session.beginTransaction();
       session.save(client);
       tx.commit();
       session.close();   
    }
    
    public static void update(Client client, String tel){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        client.setTelephone(tel);
        session.update(tel);
        tx.commit();
        session.close(); 
    }
    
    public static void delete(Client client){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        session.delete(client);
        tx.commit();
        session.close();
    }
}
