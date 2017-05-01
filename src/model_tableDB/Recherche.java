package model_tableDB;






public class Recherche {
    private String mocLibelle;
    private String LIV_ISBN;
    
    public Recherche(String mocLibele, String LIV_ISBN) {
        this.LIV_ISBN = LIV_ISBN;
        this.mocLibelle = mocLibele;
    }
    
    public String getMocLibelle() {
        return mocLibelle;
    }
    
    public void setMocLibelle(String mocLibelle) {
        this.mocLibelle = mocLibelle;
    }
    
    public String getLIV_ISBN() {
        return LIV_ISBN;
    }
    
    public void setLIV_ISBN(String LIV_ISBN) {
        this.LIV_ISBN = LIV_ISBN;
    }
    
    
    
    
}