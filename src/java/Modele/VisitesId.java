package Modele;
// Generated 2018-09-08 03:12:36 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VisitesId generated by hbm2java
 */
public class VisitesId  implements java.io.Serializable {


     private Date datevisite;
     private Date heuredebut;

    public VisitesId() {
    }

    public VisitesId(Date datevisite, Date heuredebut) {
       this.datevisite = datevisite;
       this.heuredebut = heuredebut;
    }
   
    public Date getDatevisite() {
        return this.datevisite;
    }
    
    public void setDatevisite(Date datevisite) {
        this.datevisite = datevisite;
    }
    public Date getHeuredebut() {
        return this.heuredebut;
    }
    
    public void setHeuredebut(Date heuredebut) {
        this.heuredebut = heuredebut;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VisitesId) ) return false;
		 VisitesId castOther = ( VisitesId ) other; 
         
		 return ( (this.getDatevisite()==castOther.getDatevisite()) || ( this.getDatevisite()!=null && castOther.getDatevisite()!=null && this.getDatevisite().equals(castOther.getDatevisite()) ) )
 && ( (this.getHeuredebut()==castOther.getHeuredebut()) || ( this.getHeuredebut()!=null && castOther.getHeuredebut()!=null && this.getHeuredebut().equals(castOther.getHeuredebut()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDatevisite() == null ? 0 : this.getDatevisite().hashCode() );
         result = 37 * result + ( getHeuredebut() == null ? 0 : this.getHeuredebut().hashCode() );
         return result;
   }   


}


