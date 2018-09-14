package Modele;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DAO.UtilisateurDAO;
import Modele.Utilisateur;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import com.sdzee.beans.Utilisateur;

public final class InscriptionForm {
    private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";
    private static final String CHAMP_CONF   = "confirmation";
    private static final String CHAMP_NOM   = "nom";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public Utilisateur inscrireUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String motDePasse = getValeurChamp( request, CHAMP_PASS );
        String confirmation = getValeurChamp( request, CHAMP_CONF );
        String nom   = getValeurChamp( request, CHAMP_NOM );

        Utilisateur utilisateur = new Utilisateur();
        UtilisateurId user = new UtilisateurId(nom,email);
        utilisateur.setId(user);
        /* Validation du champ email. */
        try {
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
        }

        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse( motDePasse, confirmation );
        } catch ( Exception e ) {
            setErreur( CHAMP_PASS, e.getMessage() );
            setErreur( CHAMP_CONF, null );
        }
        utilisateur.setMotdepasse(motDePasse );
        
        /* Validation du nom utilisateur*/
        try {
            validationNom( nom );
        } catch ( Exception e ) {
            setErreur( CHAMP_NOM, e.getMessage() );
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            UtilisateurDAO.insert(utilisateur);
            resultat = "Succés de l'inscription.";
        } else {
            resultat = "Échec de l'inscription.";
        }

        return utilisateur;
    }

    /**
     * Valide l'adresse email saisie.
     */
    private void validationEmail( String email ) throws Exception {
        if ( email != null ){
            if (!email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" )) 
                {
            throw new Exception( "Merci de saisir une adresse mail valide." );
            }
        } else {
            throw new Exception ("Merci de saisir une adresse valide");        
        }
    }

    /**
     * Valide le mot de passe saisi.
     */
    private void validationMotDePasse( String motDePasse, String confirmation ) throws Exception {
       
        if ( motDePasse != null && confirmation != null ) {
            if(!motDePasse.equals(confirmation)){
                throw new Exception ("Les mots de passe entrés sont différents,"
                        + " merci de les saisir a nouveau");
            } else if ( motDePasse.length() < 8 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 8 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir et conirmer votre mot de passe." );
        }
    }
    
    /**
     * 
     * @param champ
     * @param message 
     */
    private void validationNom(String nom )throws Exception {
        if(nom != null && nom.length() < 3)
        {
            throw new Exception ("le nom de l'utilisateur doit contenir au moins 3 caracteres.");
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }
    }
}
