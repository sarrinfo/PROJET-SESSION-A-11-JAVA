/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import DAO.VisiteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SARRINFO
 */
public class GestionnaireVisite {
     private static ArrayList<Visite> ListVisite = null;

    public GestionnaireVisite() {
   
    }

    public void gererListVisite(Date dateVisite) {

        if (ListVisite == null) {
            ListVisite = new ArrayList();
        }
            Visite visite = VisiteDAO.simpleVisite(dateVisite);
            boolean existe = rechercherVisite(dateVisite);
            
            if(!existe){
            ListVisite.add(visite);
            }
    }

    public ArrayList getListVisite() {
        return ListVisite;
    }

    //Recherche un visite s'il est deja dans le ListVisite
    public boolean rechercherVisite(Date  dateVisite) {
        boolean existe = false;
        int i = 0;
        for (i = 0; i < ListVisite.size(); i++);
        {
            Visite vis = ListVisite.get(i);
            if(vis.getDatevisite() == dateVisite){
              existe = true; 
            }
        }
        return existe;
    }

    public Date formaterDate(String dateVisite) 
            throws ParseException
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = dateFormat.parse(dateVisite);
        return date;
    }
    
    public void annulerVisite(Date dateVisite) {
        int i = 0;
        Visite vis;
        for (i = 0; i < ListVisite.size(); i++);
        {
            vis = ListVisite.get(i);
            if(vis.getDatevisite() == dateVisite){
              ListVisite.remove(vis); 
            }
        }
    }
    public void updateVisite(Client client) {
        int i = 0;
        Visite vis ;
        for (i = 0; i < ListVisite.size(); i++);
        {
            vis = ListVisite.get(i);
            VisiteDAO.update(vis, client);
        }
    }
}

