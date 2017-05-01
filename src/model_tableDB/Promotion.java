package model_tableDB;


public class Promotion {
    private final long PRO_ID;
    private String proNom;
    private String proDateDebut;
    private String proDateFin;
    private String proDescription;
    private float proReduction;
    private String proImage;
    private long proStatut;
    private String proChampLibre;
    

    public Promotion(long PRO_ID) {
     this.PRO_ID = PRO_ID;   
    }
    
    public long getPRO_ID() {
     return this.PRO_ID;
    }

    public String getProNom() {
        return proNom;
    }

    public void setProNom(String proNom) {
        this.proNom = proNom;
    }

    public String getProDateDebut() {
        return proDateDebut;
    }

    public void setProDateDebut(String proDateDebut) {
        this.proDateDebut = proDateDebut;
    }

    public String getProDateFin() {
        return proDateFin;
    }

    public void setProDateFin(String proDateFin) {
        this.proDateFin = proDateFin;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public float getProReduction() {
        return proReduction;
    }

    public void setProReduction(float proReduction) {
        this.proReduction = proReduction;
    }

    public String getProImage() {
        return proImage;
    }

    public void setProImage(String proImage) {
        this.proImage = proImage;
    }

    public long getProStatut() {
        return proStatut;
    }

    public void setProStatut(long proStatut) {
        this.proStatut = proStatut;
    }

    public String getProChampLibre() {
        return proChampLibre;
    }

    public void setProChampLibre(String proChampLibre) {
        this.proChampLibre = proChampLibre;
    }
    
    
}