package Modele;
// Generated 2018-09-14 01:24:50 by Hibernate Tools 4.3.1


import java.util.Date;
import com.google.gson.annotations.SerializedName;
/**
 * Annonce generated by hbm2java
 */
public class Annonce  implements java.io.Serializable {


     private int numero;
     private Bienimmobilier bienimmobilier;
     private String titre;
     private Integer nombrepieces;
     private Integer nombresdb;
     private Integer surface;
     private Date anneeconstruction;
     private String inclusion;
     private String exclusion;
     private String particularite;
     private String autresdescription;

    public Annonce() {
    }

	
    public Annonce(int numero) {
        this.numero = numero;
    }
    public Annonce(int numero, Bienimmobilier bienimmobilier, String titre, Integer nombrepieces, Integer nombresdb, Integer surface, Date anneeconstruction, String inclusion, String exclusion, String particularite, String autresdescription) {
       this.numero = numero;
       this.bienimmobilier = bienimmobilier;
       this.titre = titre;
       this.nombrepieces = nombrepieces;
       this.nombresdb = nombresdb;
       this.surface = surface;
       this.anneeconstruction = anneeconstruction;
       this.inclusion = inclusion;
       this.exclusion = exclusion;
       this.particularite = particularite;
       this.autresdescription = autresdescription;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Bienimmobilier getBienimmobilier() {
        return this.bienimmobilier;
    }
    
    public void setBienimmobilier(Bienimmobilier bienimmobilier) {
        this.bienimmobilier = bienimmobilier;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Integer getNombrepieces() {
        return this.nombrepieces;
    }
    
    public void setNombrepieces(Integer nombrepieces) {
        this.nombrepieces = nombrepieces;
    }
    public Integer getNombresdb() {
        return this.nombresdb;
    }
    
    public void setNombresdb(Integer nombresdb) {
        this.nombresdb = nombresdb;
    }
    public Integer getSurface() {
        return this.surface;
    }
    
    public void setSurface(Integer surface) {
        this.surface = surface;
    }
    public Date getAnneeconstruction() {
        return this.anneeconstruction;
    }
    
    public void setAnneeconstruction(Date anneeconstruction) {
        this.anneeconstruction = anneeconstruction;
    }
    public String getInclusion() {
        return this.inclusion;
    }
    
    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }
    public String getExclusion() {
        return this.exclusion;
    }
    
    public void setExclusion(String exclusion) {
        this.exclusion = exclusion;
    }
    public String getParticularite() {
        return this.particularite;
    }
    
    public void setParticularite(String particularite) {
        this.particularite = particularite;
    }
    public String getAutresdescription() {
        return this.autresdescription;
    }
    
    public void setAutresdescription(String autresdescription) {
        this.autresdescription = autresdescription;
    }

    public String toString (){
        return this.titre;
    }


}


