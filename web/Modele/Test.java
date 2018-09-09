/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import DAO.BienImmobilierDAO;
import DAO.HibernateUtil;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author SARRINFO
 */
public class Test {
    public static void main (String []args ){
        BigDecimal id = new BigDecimal(501);
        List <Bienimmobilier> list= BienImmobilierDAO.simpleBienimmobilier(id);
        for(Bienimmobilier line : list ){
            System.out.println("ID : "+line.getId().getBienid());
             System.out.println("Prix : "+line.getPrixLoyer()); 
            
        }
        HibernateUtil.getSessionFactory().close();
    }
}
    

