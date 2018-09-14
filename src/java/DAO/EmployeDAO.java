/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Employe;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class EmployeDAO {
    static Session session = null;
    
    public static void insert(Employe emp){
       session = HibernateUtil.getSessionFactory().openSession();
       
       Transaction tx = session.beginTransaction();
       session.save(emp);
       tx.commit();
       session.close();   
    }
    
    public static void update(Employe emp, String dept){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        emp.setDepartement(dept);
        session.update(emp);
        tx.commit();
        session.close(); 
    }
    
    public static void delete(Employe emp){
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        session.delete(emp);
        tx.commit();
        session.close();
    }

}
