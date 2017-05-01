package model_tableDB;



public class Statut {
    private final long STA_TYPE;
    private String staLibelle;
    
    public Statut(long STA_TYPE) {
        this.STA_TYPE = STA_TYPE;
    }
    
    public long getSTA_TYPE() {
        return this.STA_TYPE;
    }
    
    public String getStaLibelle() {
        return staLibelle;
    }
    
    public void setStaLibelle(String staLibelle) {
        this.staLibelle = staLibelle;
    }
    
}