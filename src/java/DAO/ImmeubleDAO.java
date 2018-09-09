/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modele.Immeuble;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class ImmeubleDAO {

    static Session session = null;

    public static void insert(Immeuble imm) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.save(imm);
        tx.commit();
        session.close();
    }

    public static void delete(Immeuble imm) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.delete(imm);
        tx.commit();
        session.close();
    }

    public static List allImmeubles() {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble ");
        List<Immeuble> results = query.list();

        return results;
    }

    public static List simpleImmeuble(String idd) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where Type_Immeuble = :no ");
        query.setParameter("no", idd);
        List<Immeuble> results = query.list();

        return results;
    }

    public static List typeImmeuble(String type) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where Type_Immeuble = :ty ");
        query.setParameter("ty", type);
        List<Immeuble> results = query.list();

        return results;
    }

    public static List AdresseImmeuble(String cp) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where codePostal = :add ");
        query.setParameter("add", cp);
        List<Immeuble> results = query.list();

        return results;
    }

    public static List villeImmeuble(String ville) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where Ville = :vil ");
        query.setParameter("vil", ville);
        List<Immeuble> results = query.list();

        return results;
    }
    
    public static List localiteImmeuble(String loc) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where localite = :loc ");
        query.setParameter("loc", loc);
        List<Immeuble> results = query.list();

        return results;
    }
    
    public static List adresseImmeuble(String codePostal, int numero) {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Immeuble where codePostal = :cp and numero = :no");
        query.setParameter("cp", codePostal);
        query.setParameter("no", numero);
        List<Immeuble> results = query.list();

        return results;
    }

}
