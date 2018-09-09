package Modele;
// Generated 2018-09-08 03:12:36 by Hibernate Tools 4.3.1



/**
 * Utilisateur generated by hbm2java
 */
public class Utilisateur  implements java.io.Serializable {


     private UtilisateurId id;
     private String nomutilisateur;
     private String prenom;
     private String courriel;
     private String motdepasse;
     private String telephone;
     private Integer photo;

    public Utilisateur() {
    }

	
    public Utilisateur(UtilisateurId id) {
        this.id = id;
    }
    public Utilisateur(UtilisateurId id, String nomutilisateur, String prenom, String courriel, String motdepasse, String telephone, Integer photo) {
       this.id = id;
       this.nomutilisateur = nomutilisateur;
       this.prenom = prenom;
       this.courriel = courriel;
       this.motdepasse = motdepasse;
       this.telephone = telephone;
       this.photo = photo;
    }
   
    public UtilisateurId getId() {
        return this.id;
    }
    
    public void setId(UtilisateurId id) {
        this.id = id;
    }
    public String getNomutilisateur() {
        return this.nomutilisateur;
    }
    
    public void setNomutilisateur(String nomutilisateur) {
        this.nomutilisateur = nomutilisateur;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCourriel() {
        return this.courriel;
    }
    
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    public String getMotdepasse() {
        return this.motdepasse;
    }
    
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Integer getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(Integer photo) {
        this.photo = photo;
    }




}


