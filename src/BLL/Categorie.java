package BLL;
// Generated 18-dec-2014 15:37:03 by Hibernate Tools 4.3.1



/**
 * Categorie generated by hbm2java
 */
public class Categorie  implements java.io.Serializable {


     private Integer id;
     private String naam;

    public Categorie() {
    }

    public Categorie(String naam) {
       this.naam = naam;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaam() {
        return this.naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString()
    {
        return naam;
    }


}


