/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SARRINFO
 */


import DAO.AdresseDAO;
import DAO.DetailsDAO;
import DAO.BienImmobilierDAO;
import DAO.HibernateUtil;
import DAO.ImagesDAO;
import DAO.ImmeubleDAO;
import Modele.Adresse;
import Modele.AdresseId;
import Modele.Bienimmobilier;
import Modele.BienimmobilierId;
import Modele.Details;
import Modele.Images;
import Modele.ImagesId;
import Modele.Immeuble;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SARRINFO
 */
public class Test {
    public static void main (String []args ){
        
        Adresse add = new Adresse(new AdresseId("H1Z-1R2", 4150), "45e Rue", 
                "cote des neiges","Montreal");
        Immeuble imm = new Immeuble("R001", add, "Residentiel");

        Adresse add1 = new Adresse(new AdresseId("H8M-4T2", 10150), "Beaubien", 
                "Mont royal","Montreal");
        Immeuble imm1 = new Immeuble("R002", add1, "Residentiel");
        
        Adresse add2 = new Adresse(new AdresseId("H3N-2T6", 3750), "Fleury", 
                "Anjou","Montreal");
        Immeuble imm2 = new Immeuble("C001", add2 , "Commerce");
        
        AdresseDAO.insert(add);
        AdresseDAO.insert(add1);
        AdresseDAO.insert(add2);
        
        ImmeubleDAO.insert(imm);
        ImmeubleDAO.insert(imm1);
        ImmeubleDAO.insert(imm2);
        
        
        Bienimmobilier bien = new Bienimmobilier(new BienimmobilierId(10001,"R001")
                , imm, "Appart", new BigDecimal(800));
        Bienimmobilier bien1 = new Bienimmobilier(new BienimmobilierId(10002,"R001")
                , imm, "Appart", new BigDecimal(750));
        Bienimmobilier bien2 = new Bienimmobilier(new BienimmobilierId(20001,"R002")
                , imm, "Appart", new BigDecimal(850));
         Bienimmobilier bien3 = new Bienimmobilier(new BienimmobilierId(10001,"C001")
                , imm, "Bureau", new BigDecimal(900));
        Bienimmobilier bien4 = new Bienimmobilier(new BienimmobilierId(10002,"C001")
                , imm, "Bureau", new BigDecimal(650));
        Bienimmobilier bien5 = new Bienimmobilier(new BienimmobilierId(20002,"R002")
                , imm, "Appart", new BigDecimal(900));
        
        BienImmobilierDAO.insert(bien);
        BienImmobilierDAO.insert(bien1);
        BienImmobilierDAO.insert(bien3);
        BienImmobilierDAO.insert(bien2);
        BienImmobilierDAO.insert(bien4);
        BienImmobilierDAO.insert(bien5);
        
       
        byte Id =1;
        byte Id1 =2;
        byte Id2 =3;
        byte Id3 =4;
        byte Id4 =5;
        
        Images img = new Images(new ImagesId("R001",10001,Id));
        Images img1 = new Images(new ImagesId("R001",10001,Id1));
        Images img2 = new Images(new ImagesId("R001",10001,Id2));
        Images img3 = new Images(new ImagesId("R001",10001,Id3));
        Images img4 = new Images(new ImagesId("R001",10001,Id4));
        ImagesDAO.insert(img);
        ImagesDAO.insert(img1);
        ImagesDAO.insert(img2);
        ImagesDAO.insert(img3);
        ImagesDAO.insert(img4);
      
        img = new Images(new ImagesId("R001",10002,Id));
        img1 = new Images(new ImagesId("R001",10002,Id1));
        img2 = new Images(new ImagesId("R001",10002,Id2));
        img3 = new Images(new ImagesId("R001",10002,Id3));
        img4 = new Images(new ImagesId("R001",10002,Id4));
        ImagesDAO.insert(img);
        ImagesDAO.insert(img1);
        ImagesDAO.insert(img2);
        ImagesDAO.insert(img3);
        ImagesDAO.insert(img4);
       
        img = new Images(new ImagesId("C001",10002,Id));
        img1 = new Images(new ImagesId("C001",10002,Id1));
        img2 = new Images(new ImagesId("C001",10002,Id2));
        img3 = new Images(new ImagesId("C001",10002,Id3));
        img4 = new Images(new ImagesId("C001",10002,Id4));
        ImagesDAO.insert(img);
        ImagesDAO.insert(img1);
        ImagesDAO.insert(img2);
        ImagesDAO.insert(img3);
        ImagesDAO.insert(img4);
        
     
        Date date = new Date("2018/07/06");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Details ann = new Details(10001, "Grand 4 1/2 pres de la station Henri Bourassa"
                + "",4,2,300,date,"chauffage inclus, frigo et poele","internet"," "
                        + "proche du metro Henri Bourassa"," Parking sous sol",10001 ,"R001" );
        DetailsDAO.insert(ann);
        
        

//        List <Bienimmobilier> list= BienImmobilierDAO.allBienImmobiliers();
//        for(Bienimmobilier line : list ){
//            System.out.println("ID : "+line.getTypeBienimmobilier());
//            System.out.println("Prix : "+line.getPrixLoyer()); 
//            
//        }
        HibernateUtil.getSessionFactory().close();
    }
}
