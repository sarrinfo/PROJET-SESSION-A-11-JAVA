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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SARRINFO
 */
public class GestionnaireVisite {

    private static ArrayList<Visite> ListVisite = new ArrayList();

    public GestionnaireVisite() {

    }

    public void gererListVisite(Date dateVisite) {
        Visite visite = VisiteDAO.simpleVisite(dateVisite);
        if (ListVisite == null) {
            ListVisite = new ArrayList();
            ajouterVisite(visite);
        }
        ajouterVisite(visite);
        boolean existe = false;

        existe = rechercherVisite(visite);

        if (existe == false) {
            ajouterVisite(visite);
        }
    }

    public void ajouterVisite(Visite visite) {
        ListVisite.add(visite);
    }

    public ArrayList getListVisite() {
        return ListVisite;
    }

    //Recherche un visite s'il est deja dans le ListVisite
    public boolean rechercherVisite(Visite visite) {
        boolean existe = false;
        Date dateVisite2 = null;
        ArrayList <Visite> list = new ArrayList();
                list = getListVisite() ;
        for (Visite v : list) {
            dateVisite2 = v.getDatevisite();
            if (dateVisite2.compareTo(visite.getDatevisite()) == 0) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public Date formaterDate(String dateVisite) {
        Date date = null;
        try {

            date = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(dateVisite);
        } catch (ParseException ex) {
            Logger.getLogger(GestionnaireVisite.class.getName()).log(Level.SEVERE, null, ex);
        }

        return date;
    }

    public void supprimerVisite(int index) {
        ListVisite.remove(index);
    }

    public void updateVisite(Client client) {
        int i = 0;
        Visite vis;
        for (i = 0; i < ListVisite.size(); i++);
        {
            vis = ListVisite.get(i);
            VisiteDAO.update(vis, client);
        }
    }
}
