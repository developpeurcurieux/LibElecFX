package model_tableDB;




public class Editeur {
    private final long EDI_ID;
    private String ediNom;
    private String ediTelF;
    private String ediEmail;
    private long ediStatut;
    private String ediChampLibre;
    
    public Editeur(long EDI_ID) {
        this.EDI_ID = EDI_ID;
    }
    
    public long getEDI_ID() {
        return EDI_ID;
    }
    
    
    public String getEdiNom() {
        return ediNom;
    }
    
    public void setEdiNom(String ediNom) {
        this.ediNom = ediNom;
    }
    
    public String getEdiTelF() {
        return ediTelF;
    }
    
    public void setEdiTelF(String ediTelF) {
        this.ediTelF = ediTelF;
    }
    
    public String getEdiEmail() {
        return ediEmail;
    }
    
    public void setEdiEmail(String ediEmail) {
        this.ediEmail = ediEmail;
    }
    
    public long getEdiStatut() {
        return ediStatut;
    }
    
    public void setEdiStatut(long ediStatut) {
        this.ediStatut = ediStatut;
    }
    
    public String getEdiChampLibre() {
        return ediChampLibre;
    }
    
    public void setEdiChampLibre(String ediChampLibre) {
        this.ediChampLibre = ediChampLibre;
    }
    
    
    
}